package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;

public class ContextDependentConstraintsUpdateListenerFactory {

    public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {
        engine.addMatchUpdateListener(UserCanGetTrapped.Matcher.on(engine), getUserCanGetTrappedUpdateListener(), fireNow);
        engine.addMatchUpdateListener(UninvocablePermission.Matcher.on(engine), getUninvocablePermissionUpdateListener(), fireNow);
    }

    public static IMatchUpdateListener<UninvocablePermission.Match> getUninvocablePermissionUpdateListener() {
        return new IMatchUpdateListener<UninvocablePermission.Match>() {
            @Override
            public void notifyAppearance(UninvocablePermission.Match match) {
                System.out.println("[ADD UninvocablePermission Match] user " + match.getUser().getName()
                        + " can not invoke the granted permission " + match.getPermission().getName() + " during " +
                        match.getScenario());
            }

            @Override
            public void notifyDisappearance(UninvocablePermission.Match match) {
                System.out.println("[REMOVE UninvocablePermission Match] user " + match.getUser().getName()
                        + " can not invoke the granted permission " + match.getPermission().getName() + " during " +
                        match.getScenario());
            }
        };
    }

    public static IMatchUpdateListener<UserCanGetTrapped.Match> getUserCanGetTrappedUpdateListener() {
        return new IMatchUpdateListener<UserCanGetTrapped.Match>() {
            @Override
            public void notifyAppearance(UserCanGetTrapped.Match match) {
                System.out.println("[ADD UserCanGetTrapped Match] user " + match.getUser().getName()
                        + " can get trapped in zone " + match.getZone().getName() + " during " +
                        match.getScenario());
            }

            @Override
            public void notifyDisappearance(UserCanGetTrapped.Match match) {
                System.out.println("[ADD UserCanGetTrapped Match] user " + match.getUser().getName()
                        + " can get trapped in zone " + match.getZone().getName() + " during " +
                        match.getScenario());
            }
        };
    }
}
