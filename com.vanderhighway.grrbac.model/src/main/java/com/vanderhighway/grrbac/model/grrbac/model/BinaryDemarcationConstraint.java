/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Demarcation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryDemarcationConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryDemarcationConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Demarcation)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryDemarcationConstraint_Left()
	 * @model
	 * @generated
	 */
	Demarcation getLeft();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Demarcation value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Demarcation)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryDemarcationConstraint_Right()
	 * @model
	 * @generated
	 */
	Demarcation getRight();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Demarcation value);

} // BinaryDemarcationConstraint
