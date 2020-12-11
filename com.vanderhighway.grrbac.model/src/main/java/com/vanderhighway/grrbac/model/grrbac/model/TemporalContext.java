/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalGrantRules <em>Temporal Grant Rules</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getAuthorizationConstraints <em>Authorization Constraints</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getMyScenarios <em>My Scenarios</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext()
 * @model
 * @generated
 */
public interface TemporalContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeRange> getInstances();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Grant Rules</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Grant Rules</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_TemporalGrantRules()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext
	 * @model opposite="temporalContext"
	 * @generated
	 */
	EList<TemporalGrantRule> getTemporalGrantRules();

	/**
	 * Returns the value of the '<em><b>Authorization Constraints</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Constraints</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_AuthorizationConstraints()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext
	 * @model opposite="temporalContext"
	 * @generated
	 */
	EList<PolicyDependentAuthorizationConstraint> getAuthorizationConstraints();

	/**
	 * Returns the value of the '<em><b>Temporal Authentication Rules</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Authentication Rules</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_TemporalAuthenticationRules()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext
	 * @model opposite="temporalContext"
	 * @generated
	 */
	EList<TemporalAuthenticationRule> getTemporalAuthenticationRules();

	/**
	 * Returns the value of the '<em><b>My Scenarios</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario#getTemporalContexts <em>Temporal Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Scenarios</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTemporalContext_MyScenarios()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.MyScenario#getTemporalContexts
	 * @model opposite="temporalContexts"
	 * @generated
	 */
	EList<MyScenario> getMyScenarios();

} // TemporalContext
