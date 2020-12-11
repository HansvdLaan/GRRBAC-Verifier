/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary User Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryUserConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryUserConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(User)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryUserConstraint_Left()
	 * @model
	 * @generated
	 */
	User getLeft();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(User value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(User)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryUserConstraint_Right()
	 * @model
	 * @generated
	 */
	User getRight();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(User value);

} // BinaryUserConstraint
