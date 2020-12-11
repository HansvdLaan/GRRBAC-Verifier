/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryRoleConstraint()
 * @model abstract="true"
 * @generated
 */
public interface UnaryRoleConstraint extends PolicyDependentAuthorizationConstraint {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUnaryRoleConstraint_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // UnaryRoleConstraint
