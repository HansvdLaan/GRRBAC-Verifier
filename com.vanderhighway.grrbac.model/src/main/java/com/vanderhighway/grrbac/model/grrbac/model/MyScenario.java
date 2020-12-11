/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario#getTemporalContexts <em>Temporal Contexts</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getMyScenario()
 * @model
 * @generated
 */
public interface MyScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Temporal Contexts</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getMyScenarios <em>My Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Contexts</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getMyScenario_TemporalContexts()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getMyScenarios
	 * @model opposite="myScenarios"
	 * @generated
	 */
	EList<TemporalContext> getTemporalContexts();

} // MyScenario
