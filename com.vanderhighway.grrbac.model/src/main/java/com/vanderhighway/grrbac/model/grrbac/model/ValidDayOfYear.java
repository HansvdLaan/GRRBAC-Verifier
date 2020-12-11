/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Day Of Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfYear()
 * @model
 * @generated
 */
public interface ValidDayOfYear extends ValidDay {
	/**
	 * Returns the value of the '<em><b>Valid Day Of Week Month</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfYear <em>Valid Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Of Week Month</em>' reference.
	 * @see #setValidDayOfWeekMonth(ValidDayOfWeekMonth)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayOfYear_ValidDayOfWeekMonth()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfYear
	 * @model opposite="validDayOfYear"
	 * @generated
	 */
	ValidDayOfWeekMonth getValidDayOfWeekMonth();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Day Of Week Month</em>' reference.
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 */
	void setValidDayOfWeekMonth(ValidDayOfWeekMonth value);

} // ValidDayOfYear
