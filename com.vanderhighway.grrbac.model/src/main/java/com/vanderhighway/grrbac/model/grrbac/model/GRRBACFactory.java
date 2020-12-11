/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage
 * @generated
 */
public interface GRRBACFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GRRBACFactory eINSTANCE = com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Demarcation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demarcation</em>'.
	 * @generated
	 */
	Demarcation createDemarcation();

	/**
	 * Returns a new object of class '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission</em>'.
	 * @generated
	 */
	Permission createPermission();

	/**
	 * Returns a new object of class '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Range</em>'.
	 * @generated
	 */
	TimeRange createTimeRange();

	/**
	 * Returns a new object of class '<em>Valid Day Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Day Of Week</em>'.
	 * @generated
	 */
	ValidDayOfWeek createValidDayOfWeek();

	/**
	 * Returns a new object of class '<em>Valid Day Of Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Day Of Month</em>'.
	 * @generated
	 */
	ValidDayOfMonth createValidDayOfMonth();

	/**
	 * Returns a new object of class '<em>Temporal Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Context</em>'.
	 * @generated
	 */
	TemporalContext createTemporalContext();

	/**
	 * Returns a new object of class '<em>Valid Day Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Day Time Range</em>'.
	 * @generated
	 */
	ValidDayTimeRange createValidDayTimeRange();

	/**
	 * Returns a new object of class '<em>Valid Day Of Week Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Day Of Week Month</em>'.
	 * @generated
	 */
	ValidDayOfWeekMonth createValidDayOfWeekMonth();

	/**
	 * Returns a new object of class '<em>Temporal Grant Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Grant Rule</em>'.
	 * @generated
	 */
	TemporalGrantRule createTemporalGrantRule();

	/**
	 * Returns a new object of class '<em>SACS Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SACS Object</em>'.
	 * @generated
	 */
	SACSObject createSACSObject();

	/**
	 * Returns a new object of class '<em>Site Access Control System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site Access Control System</em>'.
	 * @generated
	 */
	SiteAccessControlSystem createSiteAccessControlSystem();

	/**
	 * Returns a new object of class '<em>Security Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Zone</em>'.
	 * @generated
	 */
	SecurityZone createSecurityZone();

	/**
	 * Returns a new object of class '<em>So DUR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DUR Constraint</em>'.
	 * @generated
	 */
	SoDURConstraint createSoDURConstraint();

	/**
	 * Returns a new object of class '<em>So DUD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DUD Constraint</em>'.
	 * @generated
	 */
	SoDUDConstraint createSoDUDConstraint();

	/**
	 * Returns a new object of class '<em>So DUP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DUP Constraint</em>'.
	 * @generated
	 */
	SoDUPConstraint createSoDUPConstraint();

	/**
	 * Returns a new object of class '<em>So DRD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DRD Constraint</em>'.
	 * @generated
	 */
	SoDRDConstraint createSoDRDConstraint();

	/**
	 * Returns a new object of class '<em>So DDP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DDP Constraint</em>'.
	 * @generated
	 */
	SoDDPConstraint createSoDDPConstraint();

	/**
	 * Returns a new object of class '<em>Authorization Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Policy</em>'.
	 * @generated
	 */
	AuthorizationPolicy createAuthorizationPolicy();

	/**
	 * Returns a new object of class '<em>Prerequisite UR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite UR Constraint</em>'.
	 * @generated
	 */
	PrerequisiteURConstraint createPrerequisiteURConstraint();

	/**
	 * Returns a new object of class '<em>Prerequisite UD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite UD Constraint</em>'.
	 * @generated
	 */
	PrerequisiteUDConstraint createPrerequisiteUDConstraint();

	/**
	 * Returns a new object of class '<em>Prerequisite UP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite UP Constraint</em>'.
	 * @generated
	 */
	PrerequisiteUPConstraint createPrerequisiteUPConstraint();

	/**
	 * Returns a new object of class '<em>Prerequisite RD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite RD Constraint</em>'.
	 * @generated
	 */
	PrerequisiteRDConstraint createPrerequisiteRDConstraint();

	/**
	 * Returns a new object of class '<em>Prerequisite RP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite RP Constraint</em>'.
	 * @generated
	 */
	PrerequisiteRPConstraint createPrerequisiteRPConstraint();

	/**
	 * Returns a new object of class '<em>Prerequisite DP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite DP Constraint</em>'.
	 * @generated
	 */
	PrerequisiteDPConstraint createPrerequisiteDPConstraint();

	/**
	 * Returns a new object of class '<em>Bo DUR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DUR Constraint</em>'.
	 * @generated
	 */
	BoDURConstraint createBoDURConstraint();

	/**
	 * Returns a new object of class '<em>Bo DUD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DUD Constraint</em>'.
	 * @generated
	 */
	BoDUDConstraint createBoDUDConstraint();

	/**
	 * Returns a new object of class '<em>Bo DRD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DRD Constraint</em>'.
	 * @generated
	 */
	BoDRDConstraint createBoDRDConstraint();

	/**
	 * Returns a new object of class '<em>Bo DUP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DUP Constraint</em>'.
	 * @generated
	 */
	BoDUPConstraint createBoDUPConstraint();

	/**
	 * Returns a new object of class '<em>Bo DRP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DRP Constraint</em>'.
	 * @generated
	 */
	BoDRPConstraint createBoDRPConstraint();

	/**
	 * Returns a new object of class '<em>Bo DDP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo DDP Constraint</em>'.
	 * @generated
	 */
	BoDDPConstraint createBoDDPConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality UR Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality UR Constraint</em>'.
	 * @generated
	 */
	CardinalityURConstraint createCardinalityURConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality UD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality UD Constraint</em>'.
	 * @generated
	 */
	CardinalityUDConstraint createCardinalityUDConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality RD Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality RD Constraint</em>'.
	 * @generated
	 */
	CardinalityRDConstraint createCardinalityRDConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality UP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality UP Constraint</em>'.
	 * @generated
	 */
	CardinalityUPConstraint createCardinalityUPConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality RP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality RP Constraint</em>'.
	 * @generated
	 */
	CardinalityRPConstraint createCardinalityRPConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality DP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality DP Constraint</em>'.
	 * @generated
	 */
	CardinalityDPConstraint createCardinalityDPConstraint();

	/**
	 * Returns a new object of class '<em>Context Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Container</em>'.
	 * @generated
	 */
	ContextContainer createContextContainer();

	/**
	 * Returns a new object of class '<em>Valid Day Of Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Day Of Year</em>'.
	 * @generated
	 */
	ValidDayOfYear createValidDayOfYear();

	/**
	 * Returns a new object of class '<em>Authentication Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Policy</em>'.
	 * @generated
	 */
	AuthenticationPolicy createAuthenticationPolicy();

	/**
	 * Returns a new object of class '<em>Temporal Authentication Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Authentication Rule</em>'.
	 * @generated
	 */
	TemporalAuthenticationRule createTemporalAuthenticationRule();

	/**
	 * Returns a new object of class '<em>My Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Scenario</em>'.
	 * @generated
	 */
	MyScenario createMyScenario();

	/**
	 * Returns a new object of class '<em>Access Control System Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control System Topology</em>'.
	 * @generated
	 */
	AccessControlSystemTopology createAccessControlSystemTopology();

	/**
	 * Returns a new object of class '<em>So DRP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So DRP Constraint</em>'.
	 * @generated
	 */
	SoDRPConstraint createSoDRPConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GRRBACPackage getGRRBACPackage();

} //GRRBACFactory
