/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Day Of Week Month</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek <em>Valid Day Of Week</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth <em>Valid Day Of Month</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfYear <em>Valid Day Of Year</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeekMonth()
 * @model
 * @generated
 */
public interface ValidDayOfWeekMonth extends ValidDay {
	/**
	 * Returns the value of the '<em><b>Valid Day Of Week</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Of Week</em>' reference.
	 * @see #setValidDayOfWeek(ValidDayOfWeek)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeekMonth_ValidDayOfWeek()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek#getValidDayOfWeekMonth
	 * @model opposite="validDayOfWeekMonth"
	 * @generated
	 */
	ValidDayOfWeek getValidDayOfWeek();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek <em>Valid Day Of Week</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Day Of Week</em>' reference.
	 * @see #getValidDayOfWeek()
	 * @generated
	 */
	void setValidDayOfWeek(ValidDayOfWeek value);

	/**
	 * Returns the value of the '<em><b>Valid Day Of Month</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth#getValidDaysOfWeekMonth <em>Valid Days Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Of Month</em>' reference.
	 * @see #setValidDayOfMonth(ValidDayOfMonth)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeekMonth_ValidDayOfMonth()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth#getValidDaysOfWeekMonth
	 * @model opposite="validDaysOfWeekMonth"
	 * @generated
	 */
	ValidDayOfMonth getValidDayOfMonth();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth <em>Valid Day Of Month</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Day Of Month</em>' reference.
	 * @see #getValidDayOfMonth()
	 * @generated
	 */
	void setValidDayOfMonth(ValidDayOfMonth value);

	/**
	 * Returns the value of the '<em><b>Valid Day Of Year</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Of Year</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfWeekMonth_ValidDayOfYear()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth
	 * @model opposite="validDayOfWeekMonth"
	 * @generated
	 */
	EList<ValidDayOfYear> getValidDayOfYear();

} // ValidDayOfWeekMonth
