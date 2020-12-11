package com.vanderhighway.grrbac.core.validator;

import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;


public class ConstraintUpdateListenerFactory {

	public static void addALlUpdateListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {

		engine.addMatchUpdateListener(SoDURPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDURPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDUDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDUDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDUPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDUPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDRDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDRDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDRPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDRPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(SoDDPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getSoDDPPatternUpdateListener(), fireNow);

		engine.addMatchUpdateListener(PrerequisiteURPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteURPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteUDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteUDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteUPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteUPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteRDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteRDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteRPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteRPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(PrerequisiteDPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getPrerequisiteDPPatternUpdateListener(), fireNow);

		engine.addMatchUpdateListener(BoDURPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDURPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDUDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDUDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDUPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDUPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDRDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDRDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDRPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDRPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(BoDDPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getBoDDPPatternUpdateListener(), fireNow);

		engine.addMatchUpdateListener(CardinalityURPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityURPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityUDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityUDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityUPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityUPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityRDPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityRDPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityRPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityRPPatternUpdateListener(), fireNow);
		engine.addMatchUpdateListener(CardinalityDPPattern.Matcher.on(engine), ConstraintUpdateListenerFactory.getCardinalityDPPatternUpdateListener(), fireNow);
	}

	public static IMatchUpdateListener<SoDURPattern.Match> getSoDURPatternUpdateListener() {
		return new IMatchUpdateListener<SoDURPattern.Match>() {
			@Override
			public void notifyAppearance(SoDURPattern.Match match) {
				System.out.println("[ADD SoDURPattern Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(SoDURPattern.Match match) {
				System.out.println("[REMOVE SoDURPattern Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<SoDUDPattern.Match> getSoDUDPatternUpdateListener() {
		return new IMatchUpdateListener<SoDUDPattern.Match>() {
			@Override
			public void notifyAppearance(SoDUDPattern.Match match) {
				System.out.println("[ADD SoDUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDUDPattern.Match match) {
				System.out.println("[REMOVE SoDUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDUPPattern.Match> getSoDUPPatternUpdateListener() {
		return new IMatchUpdateListener<SoDUPPattern.Match>() {
			@Override
			public void notifyAppearance(SoDUPPattern.Match match) {
				System.out.println("[ADD SoDUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDUPPattern.Match match) {
				System.out.println("[REMOVE SoDUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDRDPattern.Match> getSoDRDPatternUpdateListener() {
		return new IMatchUpdateListener<SoDRDPattern.Match>() {
			@Override
			public void notifyAppearance(SoDRDPattern.Match match) {
				System.out.println("[ADD SoDRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDRDPattern.Match match) {
				System.out.println("[REMOVE SoDRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<SoDRPPattern.Match> getSoDRPPatternUpdateListener() {
		return new IMatchUpdateListener<SoDRPPattern.Match>() {
			@Override
			public void notifyAppearance(SoDRPPattern.Match match) {
				System.out.println("[ADD SoDRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(SoDRPPattern.Match match) {
				System.out.println("[REMOVE SoDRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());;
			}
		};
	}

	public static IMatchUpdateListener<SoDDPPattern.Match> getSoDDPPatternUpdateListener() {
		return new IMatchUpdateListener<SoDDPPattern.Match>() {
			@Override
			public void notifyAppearance(SoDDPPattern.Match match) {
				System.out.println("[ADD SoDDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(SoDDPPattern.Match match) {
				System.out.println("[REMOVE SoDDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteURPattern.Match> getPrerequisiteURPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteURPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteURPattern.Match match) {
				System.out.println("[ADD PrerequisiteURPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(PrerequisiteURPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteURPattern Match] user " + match.getUser().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteUDPattern.Match> getPrerequisiteUDPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteUDPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteUDPattern.Match match) {
				System.out.println("[ADD PrerequisiteUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteUDPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteUPPattern.Match> getPrerequisiteUPPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteUPPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteUPPattern.Match match) {
				System.out.println("[ADD PrerequisiteUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteUPPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteRDPattern.Match> getPrerequisiteRDPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteRDPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteRDPattern.Match match) {
				System.out.println("[ADD PrerequisiteRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteRDPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteRPPattern.Match> getPrerequisiteRPPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteRPPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteRPPattern.Match match) {
				System.out.println("[ADD PrerequisiteRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(PrerequisiteRPPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<PrerequisiteDPPattern.Match> getPrerequisiteDPPatternUpdateListener() {
		return new IMatchUpdateListener<PrerequisiteDPPattern.Match>() {
			@Override
			public void notifyAppearance(PrerequisiteDPPattern.Match match) {
				System.out.println("[ADD PrerequisiteDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(PrerequisiteDPPattern.Match match) {
				System.out.println("[REMOVE PrerequisiteDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<BoDURPattern.Match> getBoDURPatternUpdateListener() {
		return new IMatchUpdateListener<BoDURPattern.Match>() {
			@Override
			public void notifyAppearance(BoDURPattern.Match match) {
				System.out.println("[ADD BoDURPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(BoDURPattern.Match match) {
				System.out.println("[REMOVE BoDURPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<BoDUDPattern.Match> getBoDUDPatternUpdateListener() {
		return new IMatchUpdateListener<BoDUDPattern.Match>() {
			@Override
			public void notifyAppearance(BoDUDPattern.Match match) {
				System.out.println("[ADD BoDUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDUDPattern.Match match) {
				System.out.println("[REMOVE BoDUDPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDUPPattern.Match> getBoDUPPatternUpdateListener() {
		return new IMatchUpdateListener<BoDUPPattern.Match>() {
			@Override
			public void notifyAppearance(BoDUPPattern.Match match) {
				System.out.println("[ADD BoDUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDUPPattern.Match match) {
				System.out.println("[REMOVE BoDUPPattern Match] user " + match.getUser().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDRDPattern.Match> getBoDRDPatternUpdateListener() {
		return new IMatchUpdateListener<BoDRDPattern.Match>() {
			@Override
			public void notifyAppearance(BoDRDPattern.Match match) {
				System.out.println("[ADD BoDRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDRDPattern.Match match) {
				System.out.println("[REMOVE BoDRDPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDRPPattern.Match> getBoDRPPatternUpdateListener() {
		return new IMatchUpdateListener<BoDRPPattern.Match>() {
			@Override
			public void notifyAppearance(BoDRPPattern.Match match) {
				System.out.println("[ADD BoDRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}

			@Override
			public void notifyDisappearance(BoDRPPattern.Match match) {
				System.out.println("[REMOVE BoDRPPattern Match] role " + match.getRole().getName() + " violates constraint "
						+ match.getConstraint().getName() + " during " + match.getScenario());
			}
		};
	}

	public static IMatchUpdateListener<BoDDPPattern.Match> getBoDDPPatternUpdateListener() {
		return new IMatchUpdateListener<BoDDPPattern.Match>() {
			@Override
			public void notifyAppearance(BoDDPPattern.Match match) {
				System.out.println("[ADD BoDDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint "
						+ match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(BoDDPPattern.Match match) {
				System.out.println("[REMOVE BoDDPPattern Match] demarcation " + match.getDemarcation().getName() + " violates constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityURPattern.Match> getCardinalityURPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityURPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityURPattern.Match match) {
				System.out.println("[ADD CardinalityURPattern Match] " + match.getUsageCount() + " users have been assigned role " + match.getConstraint().getRole().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityURPattern.Match match) {
				System.out.println("[REMOVE CardinalityURPattern Match] " + match.getUsageCount() + " users have been assigned role " + match.getConstraint().getRole().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityUDPattern.Match> getCardinalityUDPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityUDPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityUDPattern.Match match) {
				System.out.println("[ADD CardinalityUDPattern Match] " + match.getUsageCount() + " users have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityUDPattern.Match match) {
				System.out.println("[REMOVE CardinalityURPattern Match] " + match.getUsageCount() + " users have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());

			}
		};
	}

	public static IMatchUpdateListener<CardinalityUPPattern.Match> getCardinalityUPPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityUPPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityUPPattern.Match match) {
				System.out.println("[ADD CardinalityUPPattern Match] " + match.getUsageCount() + " users have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityUPPattern.Match match) {
				System.out.println("[REMOVE CardinalityUPPattern Match] " + match.getUsageCount() + " users have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityRDPattern.Match> getCardinalityRDPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityRDPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityRDPattern.Match match) {
				System.out.println("[ADD CardinalityRDPattern Match] " + match.getUsageCount() + " roles have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityRDPattern.Match match) {
				System.out.println("[REMOVE CardinalityRDPattern Match] " + match.getUsageCount() + " roles have been granted demarcation " + match.getConstraint().getDemarcation().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityRPPattern.Match> getCardinalityRPPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityRPPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityRPPattern.Match match) {
				System.out.println("[ADD CardinalityRPPattern Match] " + match.getUsageCount() + " roles have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityRPPattern.Match match) {
				System.out.println("[REMOVE CardinalityRPPattern Match] " + match.getUsageCount() + " roles have been granted permission " + match.getConstraint().getPermission().getName() +
						" during " + match.getScenario() + " while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}

	public static IMatchUpdateListener<CardinalityDPPattern.Match> getCardinalityDPPatternUpdateListener() {
		return new IMatchUpdateListener<CardinalityDPPattern.Match>() {
			@Override
			public void notifyAppearance(CardinalityDPPattern.Match match) {
				System.out.println("[ADD CardinalityDPPattern Match] " + match.getUsageCount() + " demarcations have been assigned permission " + match.getConstraint().getPermission().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}

			@Override
			public void notifyDisappearance(CardinalityDPPattern.Match match) {
				System.out.println("[REMOVE CardinalityDPPattern Match] " + match.getUsageCount() + " demarcations have been assigned permission " + match.getConstraint().getPermission().getName() +
						" while the upper bound is " + match.getConstraint().getBound() + ", violating constraint " + match.getConstraint().getName());
			}
		};
	}
}
