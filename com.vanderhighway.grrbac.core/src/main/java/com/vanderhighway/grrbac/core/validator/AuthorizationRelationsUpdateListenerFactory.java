package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.RHSDH;
import com.vanderhighway.grrbac.patterns.RSD;
import com.vanderhighway.grrbac.patterns.USP;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;

public class AuthorizationRelationsUpdateListenerFactory {

	public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {
		engine.addMatchUpdateListener(USP.Matcher.on(engine), getAccessRelationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(RHSDH.Matcher.on(engine), getRHSDHUpdateListener(), fireNow);
	}

	public static IMatchUpdateListener<USP.Match> getAccessRelationUpdateListener() {
		return new IMatchUpdateListener<USP.Match>() {
			@Override
			public void notifyAppearance(USP.Match match) {
				String userName = match.getUser().getName();
				String permissionName = match.getPermission().getName();
				System.out.println("[ADD AccessRelation Match] " + userName + " has permission " + permissionName + " during " + match.getScenario().toString());
			}

			@Override
			public void notifyDisappearance(USP.Match match) {
				String userName = match.getUser().getName();
				String permissionName = match.getPermission().getName();
				System.out.println("[ADD AccessRelation Match] " + userName + " has permission " + permissionName + " during " + match.getScenario().toString());
			}
		};
	}

	public static IMatchUpdateListener<RSD.Match> getRSDUpdateListener() {
		return new IMatchUpdateListener<RSD.Match>() {
			@Override
			public void notifyAppearance(RSD.Match match) {
				String roleName = match.getRole().getName();
				String demarcationName = match.getDemarcation().getName();
				System.out.println("[ADD RSD Match] " + match.getScenario().toString() + " -> " + roleName + "-" + demarcationName);
			}

			@Override
			public void notifyDisappearance(RSD.Match match) {
				String roleName = match.getRole().getName();
				String demarcationName = match.getDemarcation().getName();
				System.out.println("[REM RSD Match]" + match.getScenario().toString() + " -> " + roleName + "-" + demarcationName);
			}
		};
	}

	public static IMatchUpdateListener<RHSDH.Match> getRHSDHUpdateListener() {
		return new IMatchUpdateListener<RHSDH.Match>() {
			@Override
			public void notifyAppearance(RHSDH.Match match) {
				String roleName = match.getRole().getName();
				String demarcationName = match.getDemarcation().getName();
				System.out.println("[ADD RHSDH Match] " + match.getScenario().toString() + " -> " + roleName + "-" + demarcationName);
			}

			@Override
			public void notifyDisappearance(RHSDH.Match match) {
				String roleName = match.getRole().getName();
				String demarcationName = match.getDemarcation().getName();
				System.out.println("[REM RHSDH Match]" + match.getScenario().toString() + " -> " + roleName + "-" + demarcationName);
			}
		};
	}
}
