/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Permission Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryPermissionConstraint()
 * @model abstract="true"
 * @generated
 */
public interface UnaryPermissionConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' reference.
	 * @see #setPermission(Permission)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryPermissionConstraint_Permission()
	 * @model
	 * @generated
	 */
	Permission getPermission();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint#getPermission <em>Permission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(Permission value);

} // UnaryPermissionConstraint
