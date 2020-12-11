/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getTemporalContexts <em>Temporal Contexts</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getValidDays <em>Valid Days</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getMyScenarios <em>My Scenarios</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getContextContainer()
 * @model
 * @generated
 */
public interface ContextContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Temporal Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Contexts</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getContextContainer_TemporalContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalContext> getTemporalContexts();

	/**
	 * Returns the value of the '<em><b>Valid Days</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Days</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getContextContainer_ValidDays()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidDay> getValidDays();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getContextContainer_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>My Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Scenarios</em>' containment reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getContextContainer_MyScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<MyScenario> getMyScenarios();

} // ContextContainer
