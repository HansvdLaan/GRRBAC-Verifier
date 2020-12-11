/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Authentication Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getStatus <em>Status</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext <em>Temporal Context</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone <em>Security Zone</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule()
 * @model
 * @generated
 */
public interface TemporalAuthenticationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Temporal Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Context</em>' reference.
	 * @see #setTemporalContext(TemporalContext)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule_TemporalContext()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalAuthenticationRules
	 * @model opposite="temporalAuthenticationRules"
	 * @generated
	 */
	TemporalContext getTemporalContext();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext <em>Temporal Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Context</em>' reference.
	 * @see #getTemporalContext()
	 * @generated
	 */
	void setTemporalContext(TemporalContext value);

	/**
	 * Returns the value of the '<em><b>Security Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Zone</em>' reference.
	 * @see #setSecurityZone(SecurityZone)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalAuthenticationRule_SecurityZone()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getConstrainedBy
	 * @model opposite="constrainedBy"
	 * @generated
	 */
	SecurityZone getSecurityZone();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone <em>Security Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Zone</em>' reference.
	 * @see #getSecurityZone()
	 * @generated
	 */
	void setSecurityZone(SecurityZone value);

} // TemporalAuthenticationRule
