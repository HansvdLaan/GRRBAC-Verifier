/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthenticationPolicy()
 * @model
 * @generated
 */
public interface AuthenticationPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthenticationPolicy_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Authentication Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Authentication Rules</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthenticationPolicy_TemporalAuthenticationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalAuthenticationRule> getTemporalAuthenticationRules();

} // AuthenticationPolicy
