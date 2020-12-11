package com.vanderhighway.grrbac.core.modifier;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class GeneratorUtil {

    @Extension
    private static GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

    private static List<String> allMonths = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December");
    private static List<Integer> monthDays = Arrays.asList(31,29,31,30,31,30,31,31,30,31,30,31);
    private static List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    /**
     * Create a GRRBAC model and save it.
     * @param fileName file name of the model
     * @return the created GRRBAC model.
     */
    public static Resource createAndSaveGRRBACModel(String fileName) throws IOException {

        String fileSeparator = System.getProperty("file.separator");

        // Initializing the EMF package
        ePackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("grrbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        ResourceSet set = new ResourceSetImpl();

        String relativePath = "." + fileSeparator + fileName + ".grrbac";
        File file = new File(relativePath);
        if (file.createNewFile()) {
            System.out.println(relativePath + " File Created in Project root directory");
        } else {
            System.out.println("File " + relativePath + " already exists in the project root directory");
        }
        URI uri = URI.createFileURI(relativePath);
        Resource resource = set.createResource(uri);
        return resource;
    }

    public static SiteAccessControlSystem buildBasicSecurityPolicy(GRRBACPackage ePackage, Resource resource,
                                                                   String securityPolicyName, String authorizationPolicyName,
                                                                   String authenticationPolicyName, String topologyName,
                                                                   String contexContainerName) {

        resource.getContents().add(EcoreUtil.create(ePackage.getSiteAccessControlSystem()));
        SiteAccessControlSystem system = ((SiteAccessControlSystem) resource.getContents().get(0));
        system.setName(securityPolicyName);

        AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy) EcoreUtil.create(ePackage.getAuthorizationPolicy());
        resource.getContents().add(authorizationPolicy);
        authorizationPolicy.setName(authorizationPolicyName);
        system.setAuthorizationPolicy(authorizationPolicy);

        AuthenticationPolicy authenticationPolicy = (AuthenticationPolicy) EcoreUtil.create(ePackage.getAuthenticationPolicy());
        resource.getContents().add(authenticationPolicy);
        authenticationPolicy.setName(authenticationPolicyName);
        system.setAuthenticationPolicy(authenticationPolicy);

        AccessControlSystemTopology topology = (AccessControlSystemTopology) EcoreUtil.create(ePackage.getAccessControlSystemTopology());
        resource.getContents().add(topology);
        topology.setName(topologyName);
        system.setTopology(topology);

        ContextContainer contextContainer = (ContextContainer) EcoreUtil.create(ePackage.getContextContainer());
        contextContainer.setName(contexContainerName);
        system.setContextContainer(contextContainer);
        return system;
    }

    public static ValidDayOfWeek getOrCreateDayOfWeekSchedule(PolicyModifier modifier, String scheduleName) throws ModelManipulationException, InvocationTargetException {
        ValidDayOfWeek validDay = (ValidDayOfWeek) modifier.getResource().getEObject(scheduleName);
        if(validDay == null) {
            if (allDays.contains(scheduleName)) {
                validDay = modifier.addValidDayOfWeek(scheduleName);
            }
        }
        return validDay;
    }

    public static ValidDayOfMonth getOrCreateDayOfMonthSchedule(PolicyModifier modifier, String scheduleName) throws ModelManipulationException, InvocationTargetException {
        ValidDayOfMonth validDay = (ValidDayOfMonth) modifier.getResource().getEObject(scheduleName);
        if(validDay == null) {
            String[] parts = scheduleName.split("_");
            if (allMonths.contains(parts[1])) {
                validDay = modifier.addValidDayOfMonth(scheduleName);
            }
        }
        return validDay;
    }

    public static ValidDayOfWeekMonth getOrCreateDayOfWeekMonthSchedule(PolicyModifier modifier, String scheduleName) throws ModelManipulationException, InvocationTargetException {
        ValidDayOfWeekMonth validDay = (ValidDayOfWeekMonth) modifier.getResource().getEObject(scheduleName);
        if(validDay == null) {
            String[] parts = scheduleName.split("_");
            ValidDayOfWeek ws = getOrCreateDayOfWeekSchedule(modifier, parts[0]);
            ValidDayOfMonth ms = getOrCreateDayOfMonthSchedule(modifier, parts[1] + "_" + parts[2]);
            validDay = modifier.addValidDayOfWeekMonth(ws, ms, scheduleName);
        }
        return validDay;
    }

    public static ValidDayOfYear getOrCreateDayOfYearSchedule(PolicyModifier modifier, String scheduleName) throws ModelManipulationException, InvocationTargetException {
        ValidDayOfYear validDay = (ValidDayOfYear) modifier.getResource().getEObject(scheduleName);
        if(validDay == null) {
            String[] parts = scheduleName.split("_");
            ValidDayOfWeekMonth wms = getOrCreateDayOfWeekMonthSchedule(modifier, parts[0] + "_" + parts[1] + "_" + parts[2]);
            validDay = modifier.addValidDayOfYear(wms, scheduleName);
        }
        return validDay;
    }

    public static void addManyTemporalContextInstances(PolicyModifier modifier, TemporalContext context, List<String> Schedules, List<IntegerInterval> intervals) throws ModelManipulationException, InvocationTargetException {
        for(String schedule: Schedules) {
            ValidDay validDay = (ValidDay) modifier.getResource().getEObject(schedule);

            if(validDay == null) {
                if(allDays.contains(schedule)) {
                    validDay = getOrCreateDayOfWeekSchedule(modifier, schedule);
                }
                else if(schedule.split("_").length == 2) {
                    validDay = getOrCreateDayOfMonthSchedule(modifier, schedule);
                } else if(schedule.split("_").length == 3) {
                    validDay = getOrCreateDayOfWeekMonthSchedule(modifier, schedule);
                } else if(schedule.split("_").length == 4) {
                    validDay = getOrCreateDayOfYearSchedule(modifier, schedule);
                } else {
                    throw new IllegalArgumentException("Can not parse schedule \"" + schedule + "\"" );
                }
            }
            for (IntegerInterval interval: intervals) {
                modifier.addTemporalContextInstance(context, validDay, interval);
            }
        }
    }
}
