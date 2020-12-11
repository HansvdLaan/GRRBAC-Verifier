/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRU <em>RU</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRD <em>RD</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getJuniors <em>Juniors</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>RU</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.User}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.User#getUR <em>UR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RU</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_RU()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.User#getUR
	 * @model opposite="UR"
	 * @generated
	 */
	EList<User> getRU();

	/**
	 * Returns the value of the '<em><b>RD</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDR <em>DR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RD</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_RD()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDR
	 * @model opposite="DR"
	 * @generated
	 */
	EList<Demarcation> getRD();

	/**
	 * Returns the value of the '<em><b>Juniors</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Role}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juniors</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_Juniors()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getSeniors
	 * @model opposite="seniors"
	 * @generated
	 */
	EList<Role> getJuniors();

	/**
	 * Returns the value of the '<em><b>Seniors</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Role}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seniors</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_Seniors()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getJuniors
	 * @model opposite="juniors"
	 * @generated
	 */
	EList<Role> getSeniors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constrained By</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained By</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getRole_ConstrainedBy()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole
	 * @model opposite="role"
	 * @generated
	 */
	EList<TemporalGrantRule> getConstrainedBy();

} // Role
