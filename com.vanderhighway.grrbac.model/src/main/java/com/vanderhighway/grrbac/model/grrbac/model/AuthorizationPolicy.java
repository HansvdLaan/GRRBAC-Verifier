/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getUsers <em>Users</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getDemarcations <em>Demarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getTemporalGrantRules <em>Temporal Grant Rules</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy()
 * @model
 * @generated
 */
public interface AuthorizationPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Demarcations</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demarcations</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_Demarcations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Demarcation> getDemarcations();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Grant Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Grant Rules</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getAuthorizationPolicy_TemporalGrantRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalGrantRule> getTemporalGrantRules();

} // AuthorizationPolicy
