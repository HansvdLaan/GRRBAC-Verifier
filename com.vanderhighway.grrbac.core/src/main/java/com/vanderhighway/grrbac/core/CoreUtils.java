package com.vanderhighway.grrbac.core;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class CoreUtils {

    @Extension
    private static final GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

    // Map used to give a unique ID to instances;
    private HashMap<String, Integer> instanceIDCounter;
    
    public CoreUtils() {
        this.instanceIDCounter = new HashMap<>();
    }
    
    public void addMissingDaySchedules(Resource resource, SiteAccessControlSystem system) throws ModelManipulationException, ParseException {

        Map<String, ValidDayOfWeek> dayOfWeekScheduleMap = new HashMap<>();
        Map<String, Map<Integer, ValidDayOfMonth>> dayOfMonthScheduleMap = new HashMap();
        Map<String, ValidDayOfWeekMonth> dayOfWeekMonthScheduleMap = new HashMap();

        ContextContainer contextContainer = system.getContextContainer();
        TemporalContext alwaysTC = (TemporalContext) resource.getEObject("Always");

        Set<ValidDayOfYear> dateSchedules = contextContainer.getValidDays().stream()
                .filter(x -> x instanceof ValidDayOfYear)
                .map(x -> (ValidDayOfYear) x) //otherwise the compiler complains
                .collect(Collectors.toSet());

        List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        for (String day: allDays) {
            ValidDayOfWeek ws;
            if(resource.getEObject(day) == null) {
                ws = addValidDayOfWeekCore(contextContainer, day);
            } else {
                ws = (ValidDayOfWeek) resource.getEObject(day);
            }
            dayOfWeekScheduleMap.put(day, ws);
            addTemporalContextInstanceCore(contextContainer, alwaysTC, ws, new IntegerInterval(0, 1439));
            addDayScheduleTimeRangeCore(ws, new IntegerInterval(0, 1439));
        }

        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");
        List<Integer> monthDays = Arrays.asList(31,29,31,30,31,30,31,31,30,31,30,31);
        for (int monthIndex = 0; monthIndex < months.size(); monthIndex++) {
            dayOfMonthScheduleMap.put(months.get(monthIndex), new HashMap<>());
            for (int dayIndex = 0; dayIndex < monthDays.get(monthIndex); dayIndex++) {
                ValidDayOfMonth ms;
                String name = (dayIndex+1) + "_" + months.get(monthIndex);
                if(resource.getEObject(name) == null) {
                    ms = addValidDayOfMonthCore(contextContainer, name);
                } else {
                    ms = (ValidDayOfMonth) resource.getEObject(name);
                }
                dayOfMonthScheduleMap.get(months.get(monthIndex)).put(dayIndex, ms);
                addTemporalContextInstanceCore(contextContainer, alwaysTC, ms, new IntegerInterval(0, 1439));
                addDayScheduleTimeRangeCore(ms, new IntegerInterval(0, 1439));
            }
        }

        for (int monthIndex = 0; monthIndex < months.size(); monthIndex++) {
            for (int dayIndex = 0; dayIndex < monthDays.get(monthIndex); dayIndex++) {
                ValidDayOfMonth monthSchedule = dayOfMonthScheduleMap.get(months.get(monthIndex)).get(dayIndex);
                for (String day : allDays) {
                    ValidDayOfWeek weekSchedule = dayOfWeekScheduleMap.get(day);
                    ValidDayOfWeekMonth wms;
                    String name = weekSchedule.getName() + "_" + (dayIndex+1) + "_" + months.get(monthIndex);
                    if(resource.getEObject(name) == null) {
                        wms = addValidDayOfWeekMonthCore(contextContainer, weekSchedule, monthSchedule, name);
                    } else {
                        wms = (ValidDayOfWeekMonth) resource.getEObject(name);
                        if(wms.getValidDayOfWeek() == null) {
                            wms.setValidDayOfWeek(weekSchedule);
                        }
                        if(wms.getValidDayOfMonth() == null) {
                            wms.setValidDayOfMonth(monthSchedule);
                        }
                    }
                    dayOfWeekMonthScheduleMap.put(name, wms);
                    addTemporalContextInstanceCore(contextContainer, alwaysTC, wms, new IntegerInterval(0, 1439));
                    addDayScheduleTimeRangeCore(wms, new IntegerInterval(0, 1439));
                }
            }
        }

        for(ValidDayOfYear ys: dateSchedules) {
            addTemporalContextInstanceCore(contextContainer, alwaysTC, ys, new IntegerInterval(0, 1439));
            addDayScheduleTimeRangeCore(ys, new IntegerInterval(0, 1439));
        }
    }

    public ValidDayOfWeek addValidDayOfWeekCore(ContextContainer contextContainer, String name) throws ModelManipulationException {
        ValidDayOfWeek dw = (ValidDayOfWeek) EcoreUtil.create(ePackage.getValidDayOfWeek());
        dw.setName(name);
        contextContainer.getValidDays().add(dw);
        return dw;
    }

    public ValidDayOfMonth addValidDayOfMonthCore(ContextContainer contextContainer, String name) throws ModelManipulationException {
        ValidDayOfMonth dm = (ValidDayOfMonth) EcoreUtil.create(ePackage.getValidDayOfMonth());
        dm.setName(name);
        contextContainer.getValidDays().add(dm);
        return dm;
    }

    public ValidDayOfWeekMonth addValidDayOfWeekMonthCore(ContextContainer contextContainer, ValidDayOfWeek weekSchedule, ValidDayOfMonth monthSchedule, String name) throws ModelManipulationException {
        ValidDayOfWeekMonth dwm = (ValidDayOfWeekMonth) EcoreUtil.create(ePackage.getValidDayOfWeekMonth());
        dwm.setName(name);
        dwm.setValidDayOfWeek(weekSchedule);
        dwm.setValidDayOfMonth(monthSchedule);
        contextContainer.getValidDays().add(dwm);
        return dwm;
    }

    public ValidDayOfYear addValidDayOfYearCore(ContextContainer contextContainer, ValidDayOfWeekMonth dayOfWeekMonthSchedule, String name) throws ModelManipulationException {
        ValidDayOfYear dy = (ValidDayOfYear) EcoreUtil.create(ePackage.getValidDayOfYear());
        dy.setName(name);
        dy.setValidDayOfWeekMonth(dayOfWeekMonthSchedule);
        contextContainer.getValidDays().add(dy);
        return dy;
    }

    public TimeRange addTemporalContextInstanceCore(ContextContainer contextContainer, TemporalContext context, ValidDay validDay, IntegerInterval interval) throws ModelManipulationException {
        TimeRange instance = (TimeRange) EcoreUtil.create(ePackage.getTimeRange());
        instance.setName(getUniqueID(getUniqueID(context.getName() + "-" + validDay.getName())));
        instance.setValidDay(validDay);
        instance.setStart(interval.getStart());
        instance.setEnd(interval.getEnd());
        context.getInstances().add(instance);
        return instance;
    }

    public ValidDayTimeRange addDayScheduleTimeRangeCore(ValidDay validDay, IntegerInterval interval) throws ModelManipulationException {
        ValidDayTimeRange instance = (ValidDayTimeRange) EcoreUtil.create(ePackage.getValidDayTimeRange());
        instance.setName(getUniqueID(validDay.getName()));
        instance.setStart(interval.getStart());
        instance.setEnd(interval.getEnd());
        validDay.getInstances().add(instance);
        return instance;
    }

    public String getUniqueID(String key) {
        this.instanceIDCounter.putIfAbsent(key, 0);
        this.instanceIDCounter.put(key, this.instanceIDCounter.get(key) + 1);
        return key + "-" + this.instanceIDCounter.get(key);
    }

    public HashMap<String, Integer> getInstanceIDCounter() {
        return instanceIDCounter;
    }

    public void setInstanceIDCounter(HashMap<String, Integer> instanceIDCounter) {
        this.instanceIDCounter = instanceIDCounter;
    }
}
