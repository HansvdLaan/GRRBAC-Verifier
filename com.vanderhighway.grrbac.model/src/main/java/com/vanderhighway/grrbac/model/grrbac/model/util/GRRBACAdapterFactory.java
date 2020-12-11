/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.util;

import com.vanderhighway.grrbac.model.grrbac.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage
 * @generated
 */
public class GRRBACAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GRRBACPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRRBACAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GRRBACPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GRRBACSwitch<Adapter> modelSwitch =
		new GRRBACSwitch<Adapter>() {
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseDemarcation(Demarcation object) {
				return createDemarcationAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter caseTimeRange(TimeRange object) {
				return createTimeRangeAdapter();
			}
			@Override
			public Adapter caseValidDay(ValidDay object) {
				return createValidDayAdapter();
			}
			@Override
			public Adapter caseValidDayOfWeek(ValidDayOfWeek object) {
				return createValidDayOfWeekAdapter();
			}
			@Override
			public Adapter caseValidDayOfMonth(ValidDayOfMonth object) {
				return createValidDayOfMonthAdapter();
			}
			@Override
			public Adapter caseTemporalContext(TemporalContext object) {
				return createTemporalContextAdapter();
			}
			@Override
			public Adapter caseValidDayTimeRange(ValidDayTimeRange object) {
				return createValidDayTimeRangeAdapter();
			}
			@Override
			public Adapter caseValidDayOfWeekMonth(ValidDayOfWeekMonth object) {
				return createValidDayOfWeekMonthAdapter();
			}
			@Override
			public Adapter caseTemporalGrantRule(TemporalGrantRule object) {
				return createTemporalGrantRuleAdapter();
			}
			@Override
			public Adapter caseSACSObject(SACSObject object) {
				return createSACSObjectAdapter();
			}
			@Override
			public Adapter caseSiteAccessControlSystem(SiteAccessControlSystem object) {
				return createSiteAccessControlSystemAdapter();
			}
			@Override
			public Adapter caseSecurityZone(SecurityZone object) {
				return createSecurityZoneAdapter();
			}
			@Override
			public Adapter casePolicyDependentAuthorizationConstraint(PolicyDependentAuthorizationConstraint object) {
				return createPolicyDependentAuthorizationConstraintAdapter();
			}
			@Override
			public Adapter caseUnaryUserConstraint(UnaryUserConstraint object) {
				return createUnaryUserConstraintAdapter();
			}
			@Override
			public Adapter caseBinaryUserConstraint(BinaryUserConstraint object) {
				return createBinaryUserConstraintAdapter();
			}
			@Override
			public Adapter caseUnaryRoleConstraint(UnaryRoleConstraint object) {
				return createUnaryRoleConstraintAdapter();
			}
			@Override
			public Adapter caseBinaryRoleConstraint(BinaryRoleConstraint object) {
				return createBinaryRoleConstraintAdapter();
			}
			@Override
			public Adapter caseUnaryDemarcationConstraint(UnaryDemarcationConstraint object) {
				return createUnaryDemarcationConstraintAdapter();
			}
			@Override
			public Adapter caseBinaryDemarcationConstraint(BinaryDemarcationConstraint object) {
				return createBinaryDemarcationConstraintAdapter();
			}
			@Override
			public Adapter caseUnaryPermissionConstraint(UnaryPermissionConstraint object) {
				return createUnaryPermissionConstraintAdapter();
			}
			@Override
			public Adapter caseBinaryPermissionConstraint(BinaryPermissionConstraint object) {
				return createBinaryPermissionConstraintAdapter();
			}
			@Override
			public Adapter caseSoDURConstraint(SoDURConstraint object) {
				return createSoDURConstraintAdapter();
			}
			@Override
			public Adapter caseSoDUDConstraint(SoDUDConstraint object) {
				return createSoDUDConstraintAdapter();
			}
			@Override
			public Adapter caseSoDUPConstraint(SoDUPConstraint object) {
				return createSoDUPConstraintAdapter();
			}
			@Override
			public Adapter caseSoDRDConstraint(SoDRDConstraint object) {
				return createSoDRDConstraintAdapter();
			}
			@Override
			public Adapter caseSoDDPConstraint(SoDDPConstraint object) {
				return createSoDDPConstraintAdapter();
			}
			@Override
			public Adapter caseAuthorizationPolicy(AuthorizationPolicy object) {
				return createAuthorizationPolicyAdapter();
			}
			@Override
			public Adapter casePrerequisiteURConstraint(PrerequisiteURConstraint object) {
				return createPrerequisiteURConstraintAdapter();
			}
			@Override
			public Adapter casePrerequisiteUDConstraint(PrerequisiteUDConstraint object) {
				return createPrerequisiteUDConstraintAdapter();
			}
			@Override
			public Adapter casePrerequisiteUPConstraint(PrerequisiteUPConstraint object) {
				return createPrerequisiteUPConstraintAdapter();
			}
			@Override
			public Adapter casePrerequisiteRDConstraint(PrerequisiteRDConstraint object) {
				return createPrerequisiteRDConstraintAdapter();
			}
			@Override
			public Adapter casePrerequisiteRPConstraint(PrerequisiteRPConstraint object) {
				return createPrerequisiteRPConstraintAdapter();
			}
			@Override
			public Adapter casePrerequisiteDPConstraint(PrerequisiteDPConstraint object) {
				return createPrerequisiteDPConstraintAdapter();
			}
			@Override
			public Adapter caseBoDURConstraint(BoDURConstraint object) {
				return createBoDURConstraintAdapter();
			}
			@Override
			public Adapter caseBoDUDConstraint(BoDUDConstraint object) {
				return createBoDUDConstraintAdapter();
			}
			@Override
			public Adapter caseBoDRDConstraint(BoDRDConstraint object) {
				return createBoDRDConstraintAdapter();
			}
			@Override
			public Adapter caseBoDUPConstraint(BoDUPConstraint object) {
				return createBoDUPConstraintAdapter();
			}
			@Override
			public Adapter caseBoDRPConstraint(BoDRPConstraint object) {
				return createBoDRPConstraintAdapter();
			}
			@Override
			public Adapter caseBoDDPConstraint(BoDDPConstraint object) {
				return createBoDDPConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityURConstraint(CardinalityURConstraint object) {
				return createCardinalityURConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityUDConstraint(CardinalityUDConstraint object) {
				return createCardinalityUDConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityRDConstraint(CardinalityRDConstraint object) {
				return createCardinalityRDConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityUPConstraint(CardinalityUPConstraint object) {
				return createCardinalityUPConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityRPConstraint(CardinalityRPConstraint object) {
				return createCardinalityRPConstraintAdapter();
			}
			@Override
			public Adapter caseCardinalityDPConstraint(CardinalityDPConstraint object) {
				return createCardinalityDPConstraintAdapter();
			}
			@Override
			public Adapter caseContextContainer(ContextContainer object) {
				return createContextContainerAdapter();
			}
			@Override
			public Adapter caseValidDayOfYear(ValidDayOfYear object) {
				return createValidDayOfYearAdapter();
			}
			@Override
			public Adapter caseAuthenticationPolicy(AuthenticationPolicy object) {
				return createAuthenticationPolicyAdapter();
			}
			@Override
			public Adapter caseTemporalAuthenticationRule(TemporalAuthenticationRule object) {
				return createTemporalAuthenticationRuleAdapter();
			}
			@Override
			public Adapter caseMyScenario(MyScenario object) {
				return createMyScenarioAdapter();
			}
			@Override
			public Adapter caseAccessControlSystemTopology(AccessControlSystemTopology object) {
				return createAccessControlSystemTopologyAdapter();
			}
			@Override
			public Adapter caseSoDRPConstraint(SoDRPConstraint object) {
				return createSoDRPConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation
	 * @generated
	 */
	public Adapter createDemarcationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange
	 * @generated
	 */
	public Adapter createTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay <em>Valid Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay
	 * @generated
	 */
	public Adapter createValidDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek <em>Valid Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek
	 * @generated
	 */
	public Adapter createValidDayOfWeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth <em>Valid Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth
	 * @generated
	 */
	public Adapter createValidDayOfMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext
	 * @generated
	 */
	public Adapter createTemporalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange <em>Valid Day Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange
	 * @generated
	 */
	public Adapter createValidDayTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth
	 * @generated
	 */
	public Adapter createValidDayOfWeekMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule <em>Temporal Grant Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule
	 * @generated
	 */
	public Adapter createTemporalGrantRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SACSObject <em>SACS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SACSObject
	 * @generated
	 */
	public Adapter createSACSObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem <em>Site Access Control System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem
	 * @generated
	 */
	public Adapter createSiteAccessControlSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone
	 * @generated
	 */
	public Adapter createSecurityZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint <em>Policy Dependent Authorization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint
	 * @generated
	 */
	public Adapter createPolicyDependentAuthorizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint <em>Unary User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint
	 * @generated
	 */
	public Adapter createUnaryUserConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint <em>Binary User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint
	 * @generated
	 */
	public Adapter createBinaryUserConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint <em>Unary Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint
	 * @generated
	 */
	public Adapter createUnaryRoleConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint <em>Binary Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint
	 * @generated
	 */
	public Adapter createBinaryRoleConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint <em>Unary Demarcation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint
	 * @generated
	 */
	public Adapter createUnaryDemarcationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint <em>Binary Demarcation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint
	 * @generated
	 */
	public Adapter createBinaryDemarcationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint <em>Unary Permission Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint
	 * @generated
	 */
	public Adapter createUnaryPermissionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint <em>Binary Permission Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint
	 * @generated
	 */
	public Adapter createBinaryPermissionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDURConstraint <em>So DUR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDURConstraint
	 * @generated
	 */
	public Adapter createSoDURConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDUDConstraint <em>So DUD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDUDConstraint
	 * @generated
	 */
	public Adapter createSoDUDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDUPConstraint <em>So DUP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDUPConstraint
	 * @generated
	 */
	public Adapter createSoDUPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDRDConstraint <em>So DRD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDRDConstraint
	 * @generated
	 */
	public Adapter createSoDRDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDDPConstraint <em>So DDP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDDPConstraint
	 * @generated
	 */
	public Adapter createSoDDPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy
	 * @generated
	 */
	public Adapter createAuthorizationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteURConstraint <em>Prerequisite UR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteURConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteURConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUDConstraint <em>Prerequisite UD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUDConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteUDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUPConstraint <em>Prerequisite UP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUPConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteUPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRDConstraint <em>Prerequisite RD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRDConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteRDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRPConstraint <em>Prerequisite RP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRPConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteRPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteDPConstraint <em>Prerequisite DP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteDPConstraint
	 * @generated
	 */
	public Adapter createPrerequisiteDPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDURConstraint <em>Bo DUR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDURConstraint
	 * @generated
	 */
	public Adapter createBoDURConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDUDConstraint <em>Bo DUD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDUDConstraint
	 * @generated
	 */
	public Adapter createBoDUDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDRDConstraint <em>Bo DRD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDRDConstraint
	 * @generated
	 */
	public Adapter createBoDRDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDUPConstraint <em>Bo DUP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDUPConstraint
	 * @generated
	 */
	public Adapter createBoDUPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDRPConstraint <em>Bo DRP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDRPConstraint
	 * @generated
	 */
	public Adapter createBoDRPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDDPConstraint <em>Bo DDP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDDPConstraint
	 * @generated
	 */
	public Adapter createBoDDPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint <em>Cardinality UR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint
	 * @generated
	 */
	public Adapter createCardinalityURConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint <em>Cardinality UD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint
	 * @generated
	 */
	public Adapter createCardinalityUDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint <em>Cardinality RD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint
	 * @generated
	 */
	public Adapter createCardinalityRDConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint <em>Cardinality UP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint
	 * @generated
	 */
	public Adapter createCardinalityUPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint <em>Cardinality RP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint
	 * @generated
	 */
	public Adapter createCardinalityRPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint <em>Cardinality DP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint
	 * @generated
	 */
	public Adapter createCardinalityDPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer <em>Context Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer
	 * @generated
	 */
	public Adapter createContextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear <em>Valid Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear
	 * @generated
	 */
	public Adapter createValidDayOfYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy <em>Authentication Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy
	 * @generated
	 */
	public Adapter createAuthenticationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule <em>Temporal Authentication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule
	 * @generated
	 */
	public Adapter createTemporalAuthenticationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario <em>My Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.MyScenario
	 * @generated
	 */
	public Adapter createMyScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology <em>Access Control System Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology
	 * @generated
	 */
	public Adapter createAccessControlSystemTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDRPConstraint <em>So DRP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDRPConstraint
	 * @generated
	 */
	public Adapter createSoDRPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GRRBACAdapterFactory
