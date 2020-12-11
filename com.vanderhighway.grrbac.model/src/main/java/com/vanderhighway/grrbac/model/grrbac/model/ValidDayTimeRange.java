/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Day Time Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getTemporalContextTimeRanges <em>Temporal Context Time Ranges</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext <em>Next</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayTimeRange()
 * @model
 * @generated
 */
public interface ValidDayTimeRange extends TimeRange {
	/**
	 * Returns the value of the '<em><b>Temporal Context Time Ranges</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDayTimeRanges <em>Valid Day Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Context Time Ranges</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayTimeRange_TemporalContextTimeRanges()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDayTimeRanges
	 * @model opposite="validDayTimeRanges"
	 * @generated
	 */
	EList<TimeRange> getTemporalContextTimeRanges();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ValidDayTimeRange)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayTimeRange_Next()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	ValidDayTimeRange getNext();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ValidDayTimeRange value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(ValidDayTimeRange)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getValidDayTimeRange_Previous()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext
	 * @model opposite="next"
	 * @generated
	 */
	ValidDayTimeRange getPrevious();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(ValidDayTimeRange value);

} // ValidDayTimeRange
