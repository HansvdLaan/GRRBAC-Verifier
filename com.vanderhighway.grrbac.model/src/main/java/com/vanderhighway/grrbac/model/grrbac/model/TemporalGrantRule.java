/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Grant Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#isIsGrant <em>Is Grant</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole <em>Role</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation <em>Demarcation</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext <em>Temporal Context</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule()
 * @model
 * @generated
 */
public interface TemporalGrantRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getName <em>Name</em>}' attribute.
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
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Is Grant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Grant</em>' attribute.
	 * @see #setIsGrant(boolean)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_IsGrant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsGrant();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#isIsGrant <em>Is Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Grant</em>' attribute.
	 * @see #isIsGrant()
	 * @generated
	 */
	void setIsGrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_Role()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getConstrainedBy
	 * @model opposite="constrainedBy"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Demarcation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demarcation</em>' reference.
	 * @see #setDemarcation(Demarcation)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_Demarcation()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getConstrainedBy
	 * @model opposite="constrainedBy"
	 * @generated
	 */
	Demarcation getDemarcation();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation <em>Demarcation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demarcation</em>' reference.
	 * @see #getDemarcation()
	 * @generated
	 */
	void setDemarcation(Demarcation value);

	/**
	 * Returns the value of the '<em><b>Temporal Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalGrantRules <em>Temporal Grant Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Context</em>' reference.
	 * @see #setTemporalContext(TemporalContext)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalGrantRule_TemporalContext()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalGrantRules
	 * @model opposite="temporalGrantRules"
	 * @generated
	 */
	TemporalContext getTemporalContext();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext <em>Temporal Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Context</em>' reference.
	 * @see #getTemporalContext()
	 * @generated
	 */
	void setTemporalContext(TemporalContext value);

} // TemporalGrantRule
