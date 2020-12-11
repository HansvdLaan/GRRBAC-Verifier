/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Day Of Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeek()
 * @model
 * @generated
 */
public interface ValidDayOfWeek extends ValidDay {
	/**
	 * Returns the value of the '<em><b>Valid Day Of Week Month</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek <em>Valid Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Of Week Month</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeek_ValidDayOfWeekMonth()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek
	 * @model opposite="validDayOfWeek"
	 * @generated
	 */
	EList<ValidDayOfWeekMonth> getValidDayOfWeekMonth();

} // ValidDayOfWeek
