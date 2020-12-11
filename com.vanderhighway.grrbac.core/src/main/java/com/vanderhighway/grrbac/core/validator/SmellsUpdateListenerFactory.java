package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;

public class SmellsUpdateListenerFactory {


    public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {

        engine.addMatchUpdateListener(UnusedRole.Matcher.on(engine), SmellsUpdateListenerFactory.getUnusedRoleUpdateListener(), fireNow);
        engine.addMatchUpdateListener(UnusedDemarcation.Matcher.on(engine), SmellsUpdateListenerFactory.getUnusedDemarcationUpdateListener(), fireNow);
        engine.addMatchUpdateListener(ZombieDemarcation.Matcher.on(engine), SmellsUpdateListenerFactory.getZombieDemarcationUpdateListener(), fireNow);
        engine.addMatchUpdateListener(ZombiePermission.Matcher.on(engine), SmellsUpdateListenerFactory.getZombiePermissionUpdateListener(), fireNow);
        engine.addMatchUpdateListener(GodUser.Matcher.on(engine), SmellsUpdateListenerFactory.getGodUserUpdateListener(), fireNow);
        engine.addMatchUpdateListener(GodRole.Matcher.on(engine), SmellsUpdateListenerFactory.getGodRoleUpdateListener(), fireNow);
        engine.addMatchUpdateListener(IgnoredRoleInheritance.Matcher.on(engine), SmellsUpdateListenerFactory.getIgnoredRoleInheritanceUpdateListener(), fireNow);
        engine.addMatchUpdateListener(IgnoredDemarcationInheritance.Matcher.on(engine), SmellsUpdateListenerFactory.getIgnoredDemarcationInheritanceUpdateListener(), fireNow);
    }

    public static IMatchUpdateListener<UnusedRole.Match> getUnusedRoleUpdateListener() {
        return new IMatchUpdateListener<UnusedRole.Match>() {
            @Override
            public void notifyAppearance(UnusedRole.Match match) {
                System.out.println("[ADD UnusedRole Match] role " + match.getRole().getName()
                        + " is unused");
            }

            @Override
            public void notifyDisappearance(UnusedRole.Match match) {
                System.out.println("[REMOVE UnusedRole Match] role " + match.getRole().getName()
                        + " is unused");
            }
        };
    }

    public static IMatchUpdateListener<UnusedDemarcation.Match> getUnusedDemarcationUpdateListener() {
        return new IMatchUpdateListener<UnusedDemarcation.Match>() {
            @Override
            public void notifyAppearance(UnusedDemarcation.Match match) {
                System.out.println("[ADD UnusedDemarcation Match] demarcation " + match.getDemarcation().getName()
                        + " is unused");
            }

            @Override
            public void notifyDisappearance(UnusedDemarcation.Match match) {
                System.out.println("[REMOVE UnusedDemarcation Match] demarcation " + match.getDemarcation().getName()
                        + " is unused");
            }
        };
    }

    public static IMatchUpdateListener<UnusedPermission.Match> getUnusedPermissionUpdateListener() {
        return new IMatchUpdateListener<UnusedPermission.Match>() {
            @Override
            public void notifyAppearance(UnusedPermission.Match match) {
                System.out.println("[ADD UnusedPermission Match] permission " + match.getPermission().getName()
                        + " is unused");
            }

            @Override
            public void notifyDisappearance(UnusedPermission.Match match) {
                System.out.println("[REMOVE UnusedPermission Match] permission " + match.getPermission().getName()
                        + " is unused");
            }
        };
    }

    public static IMatchUpdateListener<ZombieDemarcation.Match> getZombieDemarcationUpdateListener() {
        return new IMatchUpdateListener<ZombieDemarcation.Match>() {
            @Override
            public void notifyAppearance(ZombieDemarcation.Match match) {
                System.out.println("[ADD ZombieDemarcation Match] demarcation " + match.getDemarcation().getName()
                        + " is used but never granted");
            }

            @Override
            public void notifyDisappearance(ZombieDemarcation.Match match) {
                System.out.println("[REMOVE ZombieDemarcation Match] demarcation " + match.getDemarcation().getName()
                        + " is used but never granted");
            }
        };
    }

    public static IMatchUpdateListener<ZombiePermission.Match> getZombiePermissionUpdateListener() {
        return new IMatchUpdateListener<ZombiePermission.Match>() {
            @Override
            public void notifyAppearance(ZombiePermission.Match match) {
                System.out.println("[ADD ZombiePermission Match] permission " + match.getPermission().getName()
                        + " is used but never granted");
            }

            @Override
            public void notifyDisappearance(ZombiePermission.Match match) {
                System.out.println("[REMOVE ZombiePermission Match] permission " + match.getPermission().getName()
                        + " is used but never granted");
            }
        };
    }

//    public static IMatchUpdateListener<UnreachableZone.Match> getUnreachableZoneUpdateListener() {
//        return new IMatchUpdateListener<UnreachableZone.Match>() {
//            @Override
//            public void notifyAppearance(UnreachableZone.Match match) {
//                System.out.println("[ADD UnreachableZone Match] zone " + match.getZone().getName()
//                        + " is not reachable");
//            }
//
//            @Override
//            public void notifyDisappearance(UnreachableZone.Match match) {
//                System.out.println("[REMOVE UnreachableZone Match] zone " + match.getZone().getName()
//                        + " is not reachable");
//            }
//        };
//    }

    public static IMatchUpdateListener<IgnoredRoleInheritance.Match> getIgnoredRoleInheritanceUpdateListener() {
        return new IMatchUpdateListener<IgnoredRoleInheritance.Match>() {
            @Override
            public void notifyAppearance(IgnoredRoleInheritance.Match match) {
                System.out.println("[ADD IgnoredRoleInheritance Match] user " + match.getUser().getName()
                        + " has been assigned " + match.getRoleSenior().getName() + " but also its junior " + match.getRoleJunior().getName());
            }

            @Override
            public void notifyDisappearance(IgnoredRoleInheritance.Match match) {
                System.out.println("[REMOVE IgnoredRoleInheritance Match] user " + match.getUser().getName()
                        + " has been assigned " + match.getRoleSenior().getName() + " but also its junior " + match.getRoleJunior().getName());
            }
        };
    }

    public static IMatchUpdateListener<IgnoredDemarcationInheritance.Match> getIgnoredDemarcationInheritanceUpdateListener() {
        return new IMatchUpdateListener<IgnoredDemarcationInheritance.Match>() {
            @Override
            public void notifyAppearance(IgnoredDemarcationInheritance.Match match) {
                System.out.println("[ADD IgnoredDemarcationInheritance Match] role " + match.getRole().getName()
                        + " has been granted " + match.getSupDemarcation().getName() + " but also one of its subdemarcations "
                        + match.getSubDemarcation().getName() + " during " + match.getScenario());
            }

            @Override
            public void notifyDisappearance(IgnoredDemarcationInheritance.Match match) {
                System.out.println("[REMOVE IgnoredDemarcationInheritance Match] role " + match.getRole().getName()
                        + " has been granted " + match.getSupDemarcation().getName() + " but also one of its subdemarcations "
                        + match.getSubDemarcation().getName() + " during " + match.getScenario());
            }
        };
    }

    public static IMatchUpdateListener<GodUser.Match> getGodUserUpdateListener() {
        return new IMatchUpdateListener<GodUser.Match>() {
            @Override
            public void notifyAppearance(GodUser.Match match) {
                System.out.println("[ADD GodUser Match] user " + match.getUser().getName()
                        + " always has all permissions");
            }

            @Override
            public void notifyDisappearance(GodUser.Match match) {
                System.out.println("[REMOVE GodUser Match] user " + match.getUser().getName()
                        + " always has all permissions");
            }
        };
    }


    public static IMatchUpdateListener<GodRole.Match> getGodRoleUpdateListener() {
        return new IMatchUpdateListener<GodRole.Match>() {
            @Override
            public void notifyAppearance(GodRole.Match match) {
                System.out.println("[ADD GodRole Match] role " + match.getRole().getName()
                        + " always has all permissions");
            }

            @Override
            public void notifyDisappearance(GodRole.Match match) {
                System.out.println("[REMOVE GodRole Match] role " + match.getRole().getName()
                        + " always has all permissions");
            }
        };
    }

}
