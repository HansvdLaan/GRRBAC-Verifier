package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;


public class ConstraintUpdateListenerFactory {

	public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {

		engine.addMatchUpdateListener(SoDURViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDURViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDUDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDUDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDUPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDUPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDRDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDRDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDRPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDRPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDDPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDDPViolationUpdateListener(), fireNow);

		engine.addMatchUpdateListener(PrerequisiteURViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteURViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteUDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteUDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteUPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteUPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteRDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteRDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteRPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteRPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteDPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteDPViolationUpdateListener(), fireNow);

		engine.addMatchUpdateListener(BoDURViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDURViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDUDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDUDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDUPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDUPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDRDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDRDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDRPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDRPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDDPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDDPViolationUpdateListener(), fireNow);

		engine.addMatchUpdateListener(CardinalityURViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityURViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityUDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityUDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityUPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityUPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityRDViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityRDViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityRPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityRPViolationUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityDPViolation.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityDPViolationUpdateListener(), fireNow);
	}

	public static IMatchUpdateListener<SoDURViolation.Match> getSoDURViolationUpdateListener() {
		return new IMatchUpdateListener<SoDURViolation.Match>() {
			@Override
			public void notifyAppearance(SoDURViolation.Match match) {
				System.out.println("[ADD SoDURViolation Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(SoDURViolation.Match match) {
				System.out.println("[REMOVE SoDURViolation Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<SoDUDViolation.Match> getSoDUDViolationUpdateListener() {
		return new IMatchUpdateListener<SoDUDViolation.Match>() {
			@Override
			public void notifyAppearance(SoDUDViolation.Match match) {
				System.out.println("[ADD SoDUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDUDViolation.Match match) {
				System.out.println("[REMOVE SoDUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDUPViolation.Match> getSoDUPViolationUpdateListener() {
		return new IMatchUpdateListener<SoDUPViolation.Match>() {
			@Override
			public void notifyAppearance(SoDUPViolation.Match match) {
				System.out.println("[ADD SoDUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDUPViolation.Match match) {
				System.out.println("[REMOVE SoDUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDRDViolation.Match> getSoDRDViolationUpdateListener() {
		return new IMatchUpdateListener<SoDRDViolation.Match>() {
			@Override
			public void notifyAppearance(SoDRDViolation.Match match) {
				System.out.println("[ADD SoDRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDRDViolation.Match match) {
				System.out.println("[REMOVE SoDRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDRPViolation.Match> getSoDRPViolationUpdateListener() {
		return new IMatchUpdateListener<SoDRPViolation.Match>() {
			@Override
			public void notifyAppearance(SoDRPViolation.Match match) {
				System.out.println("[ADD SoDRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDRPViolation.Match match) {
				System.out.println("[REMOVE SoDRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());;
			}
		};
	}

	public static IMatchUpdateListener<SoDDPViolation.Match> getSoDDPViolationUpdateListener() {
		return new IMatchUpdateListener<SoDDPViolation.Match>() {
			@Override
			public void notifyAppearance(SoDDPViolation.Match match) {
				System.out.println("[ADD SoDDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(SoDDPViolation.Match match) {
				System.out.println("[REMOVE SoDDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteURViolation.Match> getPrerequisiteURViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteURViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteURViolation.Match match) {
				System.out.println("[ADD PrerequisiteURViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(PrerequisiteURViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteURViolation Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteUDViolation.Match> getPrerequisiteUDViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteUDViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteUDViolation.Match match) {
				System.out.println("[ADD PrerequisiteUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteUDViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteUPViolation.Match> getPrerequisiteUPViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteUPViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteUPViolation.Match match) {
				System.out.println("[ADD PrerequisiteUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteUPViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteRDViolation.Match> getPrerequisiteRDViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteRDViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteRDViolation.Match match) {
				System.out.println("[ADD PrerequisiteRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteRDViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteRPViolation.Match> getPrerequisiteRPViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteRPViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteRPViolation.Match match) {
				System.out.println("[ADD PrerequisiteRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteRPViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteDPViolation.Match> getPrerequisiteDPViolationUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteDPViolation.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteDPViolation.Match match) {
				System.out.println("[ADD PrerequisiteDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(PrerequisiteDPViolation.Match match) {
				System.out.println("[REMOVE PrerequisiteDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<BoDURViolation.Match> getBoDURViolationUpdateListener() {
		return new IMatchUpdateListener<BoDURViolation.Match>() {
			@Override
			public void notifyAppearance(BoDURViolation.Match match) {
				System.out.println("[ADD BoDURViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(BoDURViolation.Match match) {
				System.out.println("[REMOVE BoDURViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<BoDUDViolation.Match> getBoDUDViolationUpdateListener() {
		return new IMatchUpdateListener<BoDUDViolation.Match>() {
			@Override
			public void notifyAppearance(BoDUDViolation.Match match) {
				System.out.println("[ADD BoDUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDUDViolation.Match match) {
				System.out.println("[REMOVE BoDUDViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDUPViolation.Match> getBoDUPViolationUpdateListener() {
		return new IMatchUpdateListener<BoDUPViolation.Match>() {
			@Override
			public void notifyAppearance(BoDUPViolation.Match match) {
				System.out.println("[ADD BoDUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDUPViolation.Match match) {
				System.out.println("[REMOVE BoDUPViolation Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDRDViolation.Match> getBoDRDViolationUpdateListener() {
		return new IMatchUpdateListener<BoDRDViolation.Match>() {
			@Override
			public void notifyAppearance(BoDRDViolation.Match match) {
				System.out.println("[ADD BoDRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDRDViolation.Match match) {
				System.out.println("[REMOVE BoDRDViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDRPViolation.Match> getBoDRPViolationUpdateListener() {
		return new IMatchUpdateListener<BoDRPViolation.Match>() {
			@Override
			public void notifyAppearance(BoDRPViolation.Match match) {
				System.out.println("[ADD BoDRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDRPViolation.Match match) {
				System.out.println("[REMOVE BoDRPViolation Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDDPViolation.Match> getBoDDPViolationUpdateListener() {
		return new IMatchUpdateListener<BoDDPViolation.Match>() {
			@Override
			public void notifyAppearance(BoDDPViolation.Match match) {
				System.out.println("[ADD BoDDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(BoDDPViolation.Match match) {
				System.out.println("[REMOVE BoDDPViolation Match] demarcation " + match.getDemarcation().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityURViolation.Match> getCardinalityURViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityURViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityURViolation.Match match) {
				System.out.println("[ADD CardinalityURViolation Match] " + match.getUsageCount() + " users have been assigned role " + match.getConstraint().getRole().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityURViolation.Match match) {
				System.out.println("[REMOVE CardinalityURViolation Match] " + match.getUsageCount() + " users have been assigned role " + match.getConstraint().getRole().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityUDViolation.Match> getCardinalityUDViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityUDViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityUDViolation.Match match) {
				System.out.println("[ADD CardinalityUDViolation Match] " + match.getUsageCount() + " users have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityUDViolation.Match match) {
				System.out.println("[REMOVE CardinalityURViolation Match] " + match.getUsageCount() + " users have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());

			}
		};
	}

	public static IMatchUpdateListener<CardinalityUPViolation.Match> getCardinalityUPViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityUPViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityUPViolation.Match match) {
				System.out.println("[ADD CardinalityUPViolation Match] " + match.getUsageCount() + " users have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityUPViolation.Match match) {
				System.out.println("[REMOVE CardinalityUPViolation Match] " + match.getUsageCount() + " users have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityRDViolation.Match> getCardinalityRDViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityRDViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityRDViolation.Match match) {
				System.out.println("[ADD CardinalityRDViolation Match] " + match.getUsageCount() + " roles have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityRDViolation.Match match) {
				System.out.println("[REMOVE CardinalityRDViolation Match] " + match.getUsageCount() + " roles have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityRPViolation.Match> getCardinalityRPViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityRPViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityRPViolation.Match match) {
				System.out.println("[ADD CardinalityRPViolation Match] " + match.getUsageCount() + " roles have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityRPViolation.Match match) {
				System.out.println("[REMOVE CardinalityRPViolation Match] " + match.getUsageCount() + " roles have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityDPViolation.Match> getCardinalityDPViolationUpdateListener() {
		return new IMatchUpdateListener<CardinalityDPViolation.Match>() {
			@Override
			public void notifyAppearance(CardinalityDPViolation.Match match) {
				System.out.println("[ADD CardinalityDPViolation Match] " + match.getUsageCount() + " demarcations have been assigned permission " + match.getConstraint().getPermission().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityDPViolation.Match match) {
				System.out.println("[REMOVE CardinalityDPViolation Match] " + match.getUsageCount() + " demarcations have been assigned permission " + match.getConstraint().getPermission().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}
}
