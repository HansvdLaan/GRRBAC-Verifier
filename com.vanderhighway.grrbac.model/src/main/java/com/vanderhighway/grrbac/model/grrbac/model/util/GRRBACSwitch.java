/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.util;

import com.vanderhighway.grrbac.model.grrbac.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage
 * @generated
 */
public class GRRBACSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GRRBACPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRRBACSwitch() {
		if (modelPackage == null) {
			modelPackage = GRRBACPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GRRBACPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.DEMARCATION: {
				Demarcation demarcation = (Demarcation)theEObject;
				T result = caseDemarcation(demarcation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PERMISSION: {
				Permission permission = (Permission)theEObject;
				T result = casePermission(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.TIME_RANGE: {
				TimeRange timeRange = (TimeRange)theEObject;
				T result = caseTimeRange(timeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY: {
				ValidDay validDay = (ValidDay)theEObject;
				T result = caseValidDay(validDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY_OF_WEEK: {
				ValidDayOfWeek validDayOfWeek = (ValidDayOfWeek)theEObject;
				T result = caseValidDayOfWeek(validDayOfWeek);
				if (result == null) result = caseValidDay(validDayOfWeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY_OF_MONTH: {
				ValidDayOfMonth validDayOfMonth = (ValidDayOfMonth)theEObject;
				T result = caseValidDayOfMonth(validDayOfMonth);
				if (result == null) result = caseValidDay(validDayOfMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.TEMPORAL_CONTEXT: {
				TemporalContext temporalContext = (TemporalContext)theEObject;
				T result = caseTemporalContext(temporalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY_TIME_RANGE: {
				ValidDayTimeRange validDayTimeRange = (ValidDayTimeRange)theEObject;
				T result = caseValidDayTimeRange(validDayTimeRange);
				if (result == null) result = caseTimeRange(validDayTimeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH: {
				ValidDayOfWeekMonth validDayOfWeekMonth = (ValidDayOfWeekMonth)theEObject;
				T result = caseValidDayOfWeekMonth(validDayOfWeekMonth);
				if (result == null) result = caseValidDay(validDayOfWeekMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.TEMPORAL_GRANT_RULE: {
				TemporalGrantRule temporalGrantRule = (TemporalGrantRule)theEObject;
				T result = caseTemporalGrantRule(temporalGrantRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SACS_OBJECT: {
				SACSObject sacsObject = (SACSObject)theEObject;
				T result = caseSACSObject(sacsObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM: {
				SiteAccessControlSystem siteAccessControlSystem = (SiteAccessControlSystem)theEObject;
				T result = caseSiteAccessControlSystem(siteAccessControlSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SECURITY_ZONE: {
				SecurityZone securityZone = (SecurityZone)theEObject;
				T result = caseSecurityZone(securityZone);
				if (result == null) result = caseSACSObject(securityZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT: {
				PolicyDependentAuthorizationConstraint policyDependentAuthorizationConstraint = (PolicyDependentAuthorizationConstraint)theEObject;
				T result = casePolicyDependentAuthorizationConstraint(policyDependentAuthorizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.UNARY_USER_CONSTRAINT: {
				UnaryUserConstraint unaryUserConstraint = (UnaryUserConstraint)theEObject;
				T result = caseUnaryUserConstraint(unaryUserConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(unaryUserConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BINARY_USER_CONSTRAINT: {
				BinaryUserConstraint binaryUserConstraint = (BinaryUserConstraint)theEObject;
				T result = caseBinaryUserConstraint(binaryUserConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(binaryUserConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.UNARY_ROLE_CONSTRAINT: {
				UnaryRoleConstraint unaryRoleConstraint = (UnaryRoleConstraint)theEObject;
				T result = caseUnaryRoleConstraint(unaryRoleConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(unaryRoleConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BINARY_ROLE_CONSTRAINT: {
				BinaryRoleConstraint binaryRoleConstraint = (BinaryRoleConstraint)theEObject;
				T result = caseBinaryRoleConstraint(binaryRoleConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(binaryRoleConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT: {
				UnaryDemarcationConstraint unaryDemarcationConstraint = (UnaryDemarcationConstraint)theEObject;
				T result = caseUnaryDemarcationConstraint(unaryDemarcationConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(unaryDemarcationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BINARY_DEMARCATION_CONSTRAINT: {
				BinaryDemarcationConstraint binaryDemarcationConstraint = (BinaryDemarcationConstraint)theEObject;
				T result = caseBinaryDemarcationConstraint(binaryDemarcationConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(binaryDemarcationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.UNARY_PERMISSION_CONSTRAINT: {
				UnaryPermissionConstraint unaryPermissionConstraint = (UnaryPermissionConstraint)theEObject;
				T result = caseUnaryPermissionConstraint(unaryPermissionConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(unaryPermissionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BINARY_PERMISSION_CONSTRAINT: {
				BinaryPermissionConstraint binaryPermissionConstraint = (BinaryPermissionConstraint)theEObject;
				T result = caseBinaryPermissionConstraint(binaryPermissionConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(binaryPermissionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DUR_CONSTRAINT: {
				SoDURConstraint soDURConstraint = (SoDURConstraint)theEObject;
				T result = caseSoDURConstraint(soDURConstraint);
				if (result == null) result = caseBinaryRoleConstraint(soDURConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDURConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DUD_CONSTRAINT: {
				SoDUDConstraint soDUDConstraint = (SoDUDConstraint)theEObject;
				T result = caseSoDUDConstraint(soDUDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(soDUDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDUDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DUP_CONSTRAINT: {
				SoDUPConstraint soDUPConstraint = (SoDUPConstraint)theEObject;
				T result = caseSoDUPConstraint(soDUPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(soDUPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDUPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DRD_CONSTRAINT: {
				SoDRDConstraint soDRDConstraint = (SoDRDConstraint)theEObject;
				T result = caseSoDRDConstraint(soDRDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(soDRDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDRDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DDP_CONSTRAINT: {
				SoDDPConstraint soDDPConstraint = (SoDDPConstraint)theEObject;
				T result = caseSoDDPConstraint(soDDPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(soDDPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDDPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.AUTHORIZATION_POLICY: {
				AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy)theEObject;
				T result = caseAuthorizationPolicy(authorizationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_UR_CONSTRAINT: {
				PrerequisiteURConstraint prerequisiteURConstraint = (PrerequisiteURConstraint)theEObject;
				T result = casePrerequisiteURConstraint(prerequisiteURConstraint);
				if (result == null) result = caseBinaryRoleConstraint(prerequisiteURConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteURConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_UD_CONSTRAINT: {
				PrerequisiteUDConstraint prerequisiteUDConstraint = (PrerequisiteUDConstraint)theEObject;
				T result = casePrerequisiteUDConstraint(prerequisiteUDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(prerequisiteUDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteUDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_UP_CONSTRAINT: {
				PrerequisiteUPConstraint prerequisiteUPConstraint = (PrerequisiteUPConstraint)theEObject;
				T result = casePrerequisiteUPConstraint(prerequisiteUPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(prerequisiteUPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteUPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_RD_CONSTRAINT: {
				PrerequisiteRDConstraint prerequisiteRDConstraint = (PrerequisiteRDConstraint)theEObject;
				T result = casePrerequisiteRDConstraint(prerequisiteRDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(prerequisiteRDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteRDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_RP_CONSTRAINT: {
				PrerequisiteRPConstraint prerequisiteRPConstraint = (PrerequisiteRPConstraint)theEObject;
				T result = casePrerequisiteRPConstraint(prerequisiteRPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(prerequisiteRPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteRPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.PREREQUISITE_DP_CONSTRAINT: {
				PrerequisiteDPConstraint prerequisiteDPConstraint = (PrerequisiteDPConstraint)theEObject;
				T result = casePrerequisiteDPConstraint(prerequisiteDPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(prerequisiteDPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(prerequisiteDPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DUR_CONSTRAINT: {
				BoDURConstraint boDURConstraint = (BoDURConstraint)theEObject;
				T result = caseBoDURConstraint(boDURConstraint);
				if (result == null) result = caseBinaryRoleConstraint(boDURConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDURConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DUD_CONSTRAINT: {
				BoDUDConstraint boDUDConstraint = (BoDUDConstraint)theEObject;
				T result = caseBoDUDConstraint(boDUDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(boDUDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDUDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DRD_CONSTRAINT: {
				BoDRDConstraint boDRDConstraint = (BoDRDConstraint)theEObject;
				T result = caseBoDRDConstraint(boDRDConstraint);
				if (result == null) result = caseBinaryDemarcationConstraint(boDRDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDRDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DUP_CONSTRAINT: {
				BoDUPConstraint boDUPConstraint = (BoDUPConstraint)theEObject;
				T result = caseBoDUPConstraint(boDUPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(boDUPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDUPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DRP_CONSTRAINT: {
				BoDRPConstraint boDRPConstraint = (BoDRPConstraint)theEObject;
				T result = caseBoDRPConstraint(boDRPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(boDRPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDRPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.BO_DDP_CONSTRAINT: {
				BoDDPConstraint boDDPConstraint = (BoDDPConstraint)theEObject;
				T result = caseBoDDPConstraint(boDDPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(boDDPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(boDDPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_UR_CONSTRAINT: {
				CardinalityURConstraint cardinalityURConstraint = (CardinalityURConstraint)theEObject;
				T result = caseCardinalityURConstraint(cardinalityURConstraint);
				if (result == null) result = caseUnaryRoleConstraint(cardinalityURConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityURConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_UD_CONSTRAINT: {
				CardinalityUDConstraint cardinalityUDConstraint = (CardinalityUDConstraint)theEObject;
				T result = caseCardinalityUDConstraint(cardinalityUDConstraint);
				if (result == null) result = caseUnaryDemarcationConstraint(cardinalityUDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityUDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_RD_CONSTRAINT: {
				CardinalityRDConstraint cardinalityRDConstraint = (CardinalityRDConstraint)theEObject;
				T result = caseCardinalityRDConstraint(cardinalityRDConstraint);
				if (result == null) result = caseUnaryDemarcationConstraint(cardinalityRDConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityRDConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_UP_CONSTRAINT: {
				CardinalityUPConstraint cardinalityUPConstraint = (CardinalityUPConstraint)theEObject;
				T result = caseCardinalityUPConstraint(cardinalityUPConstraint);
				if (result == null) result = caseUnaryPermissionConstraint(cardinalityUPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityUPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_RP_CONSTRAINT: {
				CardinalityRPConstraint cardinalityRPConstraint = (CardinalityRPConstraint)theEObject;
				T result = caseCardinalityRPConstraint(cardinalityRPConstraint);
				if (result == null) result = caseUnaryPermissionConstraint(cardinalityRPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityRPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CARDINALITY_DP_CONSTRAINT: {
				CardinalityDPConstraint cardinalityDPConstraint = (CardinalityDPConstraint)theEObject;
				T result = caseCardinalityDPConstraint(cardinalityDPConstraint);
				if (result == null) result = caseUnaryPermissionConstraint(cardinalityDPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(cardinalityDPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.CONTEXT_CONTAINER: {
				ContextContainer contextContainer = (ContextContainer)theEObject;
				T result = caseContextContainer(contextContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.VALID_DAY_OF_YEAR: {
				ValidDayOfYear validDayOfYear = (ValidDayOfYear)theEObject;
				T result = caseValidDayOfYear(validDayOfYear);
				if (result == null) result = caseValidDay(validDayOfYear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.AUTHENTICATION_POLICY: {
				AuthenticationPolicy authenticationPolicy = (AuthenticationPolicy)theEObject;
				T result = caseAuthenticationPolicy(authenticationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE: {
				TemporalAuthenticationRule temporalAuthenticationRule = (TemporalAuthenticationRule)theEObject;
				T result = caseTemporalAuthenticationRule(temporalAuthenticationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.MY_SCENARIO: {
				MyScenario myScenario = (MyScenario)theEObject;
				T result = caseMyScenario(myScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.ACCESS_CONTROL_SYSTEM_TOPOLOGY: {
				AccessControlSystemTopology accessControlSystemTopology = (AccessControlSystemTopology)theEObject;
				T result = caseAccessControlSystemTopology(accessControlSystemTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRRBACPackage.SO_DRP_CONSTRAINT: {
				SoDRPConstraint soDRPConstraint = (SoDRPConstraint)theEObject;
				T result = caseSoDRPConstraint(soDRPConstraint);
				if (result == null) result = caseBinaryPermissionConstraint(soDRPConstraint);
				if (result == null) result = casePolicyDependentAuthorizationConstraint(soDRPConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demarcation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demarcation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemarcation(Demarcation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRange(TimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDay(ValidDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day Of Week</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDayOfWeek(ValidDayOfWeek object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day Of Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day Of Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDayOfMonth(ValidDayOfMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalContext(TemporalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDayTimeRange(ValidDayTimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day Of Week Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day Of Week Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDayOfWeekMonth(ValidDayOfWeekMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Grant Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Grant Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalGrantRule(TemporalGrantRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACS Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACS Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACSObject(SACSObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Access Control System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Access Control System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteAccessControlSystem(SiteAccessControlSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityZone(SecurityZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Dependent Authorization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Dependent Authorization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDependentAuthorizationConstraint(PolicyDependentAuthorizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary User Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary User Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryUserConstraint(UnaryUserConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary User Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary User Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryUserConstraint(BinaryUserConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Role Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Role Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryRoleConstraint(UnaryRoleConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Role Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Role Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryRoleConstraint(BinaryRoleConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Demarcation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Demarcation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryDemarcationConstraint(UnaryDemarcationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Demarcation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Demarcation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryDemarcationConstraint(BinaryDemarcationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Permission Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Permission Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryPermissionConstraint(UnaryPermissionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Permission Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Permission Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryPermissionConstraint(BinaryPermissionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DUR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DUR Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDURConstraint(SoDURConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DUD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DUD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDUDConstraint(SoDUDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DUP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DUP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDUPConstraint(SoDUPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DRD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DRD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDRDConstraint(SoDRDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DDP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DDP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDDPConstraint(SoDDPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationPolicy(AuthorizationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite UR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite UR Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteURConstraint(PrerequisiteURConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite UD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite UD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteUDConstraint(PrerequisiteUDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite UP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite UP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteUPConstraint(PrerequisiteUPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite RD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite RD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteRDConstraint(PrerequisiteRDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite RP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite RP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteRPConstraint(PrerequisiteRPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite DP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite DP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteDPConstraint(PrerequisiteDPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DUR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DUR Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDURConstraint(BoDURConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DUD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DUD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDUDConstraint(BoDUDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DRD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DRD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDRDConstraint(BoDRDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DUP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DUP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDUPConstraint(BoDUPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DRP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DRP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDRPConstraint(BoDRPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bo DDP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bo DDP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoDDPConstraint(BoDDPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality UR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality UR Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityURConstraint(CardinalityURConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality UD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality UD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityUDConstraint(CardinalityUDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality RD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality RD Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRDConstraint(CardinalityRDConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality UP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality UP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityUPConstraint(CardinalityUPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality RP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality RP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRPConstraint(CardinalityRPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality DP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality DP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityDPConstraint(CardinalityDPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextContainer(ContextContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Day Of Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Day Of Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidDayOfYear(ValidDayOfYear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationPolicy(AuthenticationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Authentication Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Authentication Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalAuthenticationRule(TemporalAuthenticationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyScenario(MyScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control System Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control System Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlSystemTopology(AccessControlSystemTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So DRP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So DRP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoDRPConstraint(SoDRPConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GRRBACSwitch
