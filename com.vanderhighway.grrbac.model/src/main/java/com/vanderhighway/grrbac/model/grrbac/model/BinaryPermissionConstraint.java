/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Permission Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryPermissionConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryPermissionConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Permission)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryPermissionConstraint_Left()
	 * @model
	 * @generated
	 */
	Permission getLeft();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Permission value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Permission)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getBinaryPermissionConstraint_Right()
	 * @model
	 * @generated
	 */
	Permission getRight();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Permission value);

} // BinaryPermissionConstraint
