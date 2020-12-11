/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Demarcation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint#getDemarcation <em>Demarcation</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryDemarcationConstraint()
 * @model abstract="true"
 * @generated
 */
public interface UnaryDemarcationConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Demarcation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demarcation</em>' reference.
	 * @see #setDemarcation(Demarcation)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryDemarcationConstraint_Demarcation()
	 * @model
	 * @generated
	 */
	Demarcation getDemarcation();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint#getDemarcation <em>Demarcation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demarcation</em>' reference.
	 * @see #getDemarcation()
	 * @generated
	 */
	void setDemarcation(Demarcation value);

} // UnaryDemarcationConstraint
