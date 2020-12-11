/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Day Of Month</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth#getValidDaysOfWeekMonth <em>Valid Days Of Week Month</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfMonth()
 * @model
 * @generated
 */
public interface ValidDayOfMonth extends ValidDay {
	/**
	 * Returns the value of the '<em><b>Valid Days Of Week Month</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth <em>Valid Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Days Of Week Month</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfMonth_ValidDaysOfWeekMonth()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth
	 * @model opposite="validDayOfMonth"
	 * @generated
	 */
	EList<ValidDayOfWeekMonth> getValidDaysOfWeekMonth();

} // ValidDayOfMonth
