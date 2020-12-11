package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.RHSDH;
import com.vanderhighway.grrbac.patterns.Scenarios;
import com.vanderhighway.grrbac.patterns.USP;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;

public class TemporalRelationsUpdateListenerFactory {

	public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {
		engine.addMatchUpdateListener(Scenarios.Matcher.on(engine), TemporalRelationsUpdateListenerFactory.getScenarioUpdateListener(), fireNow);
	}

	public static IMatchUpdateListener<Scenarios.Match> getScenarioUpdateListener() {
		return new IMatchUpdateListener<Scenarios.Match>() {
			@Override
			public void notifyAppearance(Scenarios.Match match) {
				System.out.println("[ADD Scenarios Match] " + match.getScenario().toString());
			}

			@Override
			public void notifyDisappearance(Scenarios.Match match) {
				System.out.println("[REM Scenarios Match] " + match.getScenario().toString());
			}
		};
	}
}
