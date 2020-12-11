/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Access Control System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationConstraints <em>Authorization Constraints</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationPolicy <em>Authorization Policy</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getContextContainer <em>Context Container</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthenticationPolicy <em>Authentication Policy</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem()
 * @model
 * @generated
 */
public interface SiteAccessControlSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Constraints</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_AuthorizationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyDependentAuthorizationConstraint> getAuthorizationConstraints();

	/**
	 * Returns the value of the '<em><b>Authorization Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Policy</em>' containment reference.
	 * @see #setAuthorizationPolicy(AuthorizationPolicy)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_AuthorizationPolicy()
	 * @model containment="true"
	 * @generated
	 */
	AuthorizationPolicy getAuthorizationPolicy();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationPolicy <em>Authorization Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Policy</em>' containment reference.
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	void setAuthorizationPolicy(AuthorizationPolicy value);

	/**
	 * Returns the value of the '<em><b>Context Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Container</em>' containment reference.
	 * @see #setContextContainer(ContextContainer)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_ContextContainer()
	 * @model containment="true"
	 * @generated
	 */
	ContextContainer getContextContainer();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getContextContainer <em>Context Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Container</em>' containment reference.
	 * @see #getContextContainer()
	 * @generated
	 */
	void setContextContainer(ContextContainer value);

	/**
	 * Returns the value of the '<em><b>Authentication Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Policy</em>' containment reference.
	 * @see #setAuthenticationPolicy(AuthenticationPolicy)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_AuthenticationPolicy()
	 * @model containment="true"
	 * @generated
	 */
	AuthenticationPolicy getAuthenticationPolicy();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthenticationPolicy <em>Authentication Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Policy</em>' containment reference.
	 * @see #getAuthenticationPolicy()
	 * @generated
	 */
	void setAuthenticationPolicy(AuthenticationPolicy value);

	/**
	 * Returns the value of the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' containment reference.
	 * @see #setTopology(AccessControlSystemTopology)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSiteAccessControlSystem_Topology()
	 * @model containment="true"
	 * @generated
	 */
	AccessControlSystemTopology getTopology();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getTopology <em>Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' containment reference.
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(AccessControlSystemTopology value);

} // SiteAccessControlSystem
