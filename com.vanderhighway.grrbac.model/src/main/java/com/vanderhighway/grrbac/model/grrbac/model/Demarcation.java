/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demarcation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDR <em>DR</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDP <em>DP</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSubdemarcations <em>Subdemarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSuperdemarcations <em>Superdemarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation()
 * @model
 * @generated
 */
public interface Demarcation extends EObject {
	/**
	 * Returns the value of the '<em><b>DR</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Role}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRD <em>RD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DR</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_DR()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getRD
	 * @model opposite="RD"
	 * @generated
	 */
	EList<Role> getDR();

	/**
	 * Returns the value of the '<em><b>DP</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Permission}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPD <em>PD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_DP()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission#getPD
	 * @model opposite="PD"
	 * @generated
	 */
	EList<Permission> getDP();

	/**
	 * Returns the value of the '<em><b>Subdemarcations</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSuperdemarcations <em>Superdemarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdemarcations</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_Subdemarcations()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSuperdemarcations
	 * @model opposite="superdemarcations"
	 * @generated
	 */
	EList<Demarcation> getSubdemarcations();

	/**
	 * Returns the value of the '<em><b>Superdemarcations</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSubdemarcations <em>Subdemarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superdemarcations</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_Superdemarcations()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSubdemarcations
	 * @model opposite="subdemarcations"
	 * @generated
	 */
	EList<Demarcation> getSuperdemarcations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getName <em>Name</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained By</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getDemarcation_ConstrainedBy()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation
	 * @model opposite="demarcation"
	 * @generated
	 */
	EList<TemporalGrantRule> getConstrainedBy();

} // Demarcation
