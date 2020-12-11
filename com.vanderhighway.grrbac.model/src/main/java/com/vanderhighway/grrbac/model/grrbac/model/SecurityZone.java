/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#isPublic <em>Public</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getReachable <em>Reachable</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSecurityZone()
 * @model
 * @generated
 */
public interface SecurityZone extends SACSObject {
	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSecurityZone_Public()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSecurityZone_Reachable()
	 * @model
	 * @generated
	 */
	EList<SecurityZone> getReachable();

	/**
	 * Returns the value of the '<em><b>Constrained By</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained By</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getSecurityZone_ConstrainedBy()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone
	 * @model opposite="securityZone"
	 * @generated
	 */
	EList<TemporalAuthenticationRule> getConstrainedBy();

} // SecurityZone
