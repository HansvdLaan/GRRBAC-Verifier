/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Dependent Authorization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext <em>Temporal Context</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPolicyDependentAuthorizationConstraint()
 * @model abstract="true"
 * @generated
 */
public interface PolicyDependentAuthorizationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPolicyDependentAuthorizationConstraint_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getAuthorizationConstraints <em>Authorization Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Context</em>' reference.
	 * @see #setTemporalContext(TemporalContext)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPolicyDependentAuthorizationConstraint_TemporalContext()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getAuthorizationConstraints
	 * @model opposite="authorizationConstraints"
	 * @generated
	 */
	TemporalContext getTemporalContext();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext <em>Temporal Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Context</em>' reference.
	 * @see #getTemporalContext()
	 * @generated
	 */
	void setTemporalContext(TemporalContext value);

} // PolicyDependentAuthorizationConstraint
