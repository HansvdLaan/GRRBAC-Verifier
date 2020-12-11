/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPD <em>PD</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPO <em>PO</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>PD</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDP <em>DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPermission_PD()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDP
	 * @model opposite="DP"
	 * @generated
	 */
	EList<Demarcation> getPD();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPermission_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>PO</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getOP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PO</em>' reference.
	 * @see #setPO(SACSObject)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getPermission_PO()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getOP
	 * @model opposite="OP"
	 * @generated
	 */
	SACSObject getPO();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPO <em>PO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PO</em>' reference.
	 * @see #getPO()
	 * @generated
	 */
	void setPO(SACSObject value);

} // Permission
