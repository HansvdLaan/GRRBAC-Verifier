package com.vanderhighway.grrbac.examples.util;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.patterns.AuthenticationStatus;

import java.util.*;
import java.util.stream.Collectors;

public class ScheduleRoutineTemporalContext {

    private AuthenticationStatus status;
    private Map<String, Set<IntegerInterval>> intervals;

    public ScheduleRoutineTemporalContext(AuthenticationStatus status){
        this.status = status;
        this.intervals = new LinkedHashMap<>();
        this.intervals.put("Mon", new TreeSet<>());
        this.intervals.put("Tue", new TreeSet<>());
        this.intervals.put("Wed", new TreeSet<>());
        this.intervals.put("Thu", new TreeSet<>());
        this.intervals.put("Fri", new TreeSet<>());
        this.intervals.put("Sat", new TreeSet<>());
        this.intervals.put("Sun", new TreeSet<>());
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public Map<String, Set<IntegerInterval>> getIntervals() {
        return intervals;
    }

    public void setIntervals(Map<String, Set<IntegerInterval>> intervals) {
        this.intervals = intervals;
    }

     public boolean isEmpty() {
        boolean isEmpty = true;
        for(String day: intervals.keySet()) {
            isEmpty = isEmpty && intervals.get(day).isEmpty();
        }
        return isEmpty;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleRoutineTemporalContext that = (ScheduleRoutineTemporalContext) o;
        return status == that.status &&
                intervals.equals(that.intervals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, intervals);
    }

    public static Set<ScheduleRoutineTemporalContext> extractFromScheduleRoutine (ScheduleRoutine routine) {
        ScheduleRoutineTemporalContext unlockedContext = new ScheduleRoutineTemporalContext(AuthenticationStatus.UNLOCKED);
        ScheduleRoutineTemporalContext protectedContext = new ScheduleRoutineTemporalContext(AuthenticationStatus.PROTECTED);
        ScheduleRoutineTemporalContext lockedContext = new ScheduleRoutineTemporalContext(AuthenticationStatus.LOCKED);

        for (ScheduleRoutineDay routineDay: routine.schedule) {
            for(TimeBar bar: routineDay.timeBars) {
                switch (bar.type) {
                    case "conditional-access":
                        protectedContext.getIntervals().get(routineDay.name).add(
                                ScheduleRoutineTemporalContext.toInterval(bar.start, bar.width)
                        );
                        break;
                    case "open-access":
                        unlockedContext.getIntervals().get(routineDay.name).add(
                                ScheduleRoutineTemporalContext.toInterval(bar.start, bar.width)
                        );
                        break;
                    case "no-access":
                        lockedContext.getIntervals().get(routineDay.name).add(
                                ScheduleRoutineTemporalContext.toInterval(bar.start, bar.width)
                        );
                        break;
                }
            }
        }

        Set<ScheduleRoutineTemporalContext> returnSet = new LinkedHashSet<>();
        if(!unlockedContext.isEmpty()) {
            returnSet.add(unlockedContext);
        }
        if(!lockedContext.isEmpty()) {
            returnSet.add(lockedContext);
        }
        if(!protectedContext.isEmpty()) {
            returnSet.add(protectedContext);
        }

        return returnSet;
    }

    public static Set<ScheduleRoutineTemporalContext> extractFromScheduleRoutines (Set<ScheduleRoutine> routines) {
        Set<ScheduleRoutineTemporalContext> contexts = routines.stream().map(ScheduleRoutineTemporalContext::extractFromScheduleRoutine)
                .flatMap(Collection::stream).collect(Collectors.toSet());
        return contexts;
    }

    private static IntegerInterval toInterval(double start, double width) {
        double startTime = (1439.0 / 100.0) * start;
        startTime = 5*(Math.round(startTime/5)); //round to nearest 5m
        double endTime = startTime + (1439.0 / 100.0) * width; //To prevent rounding errors!
        endTime = 5*(Math.round(endTime/5)); //round to nearest 5m
        endTime--;
        endTime = Math.min(1439, endTime);
        return new IntegerInterval((int) startTime, (int) endTime);
    }
    
}
