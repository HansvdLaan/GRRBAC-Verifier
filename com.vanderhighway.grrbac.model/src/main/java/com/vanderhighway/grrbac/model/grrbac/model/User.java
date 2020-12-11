/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.User#getUR <em>UR</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.User#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>UR</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Role}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRU <em>RU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UR</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUser_UR()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getRU
	 * @model opposite="RU"
	 * @generated
	 */
	EList<Role> getUR();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getUser_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // User
