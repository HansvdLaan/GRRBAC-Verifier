package com.vanderhighway.grrbac.examples;

import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.*;

public class EmptyPolicyGenerator {

	@Extension
	private static GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

	public static void main(String[] args) throws IOException, InvocationTargetException, ModelManipulationException, ModelManipulationException, ParseException {

        Resource resource = GeneratorUtil.createAndSaveGRRBACModel("empty_policy");
		SiteAccessControlSystem system = GeneratorUtil.buildBasicSecurityPolicy(ePackage, resource, "DummySecurityPolicy",
				"DummyAuthorizationPolicy", "DummyAuthenticationPolicy",
				"DummyTopology","DummyContextContainer");

        final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resource));
        PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);

		Map<String, ValidDayOfWeek> dayOfWeekScheduleMap = new HashMap<>();
		Map<String, Map<Integer, ValidDayOfMonth>> dayOfMonthScheduleMap = new HashMap();

		TemporalContext always = modifier.addTemporalContext("Always");

		resource.save(Collections.emptyMap());

		modifier.dispose();

		System.out.println("Done!");
	}
}
