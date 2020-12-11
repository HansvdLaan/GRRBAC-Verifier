/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryRoleConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryRoleConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Role)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryRoleConstraint_Left()
	 * @model
	 * @generated
	 */
	Role getLeft();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Role value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Role)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryRoleConstraint_Right()
	 * @model
	 * @generated
	 */
	Role getRight();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Role value);

} // BinaryRoleConstraint
