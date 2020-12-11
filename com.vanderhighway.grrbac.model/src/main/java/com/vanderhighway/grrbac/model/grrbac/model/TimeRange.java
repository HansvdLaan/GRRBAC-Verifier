/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getStart <em>Start</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getEnd <em>End</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDay <em>Valid Day</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDayTimeRanges <em>Valid Day Time Ranges</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange()
 * @model
 * @generated
 */
public interface TimeRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange_End()
	 * @model
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Valid Day</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getTimeRanges <em>Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day</em>' reference.
	 * @see #setValidDay(ValidDay)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange_ValidDay()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getTimeRanges
	 * @model opposite="timeRanges"
	 * @generated
	 */
	ValidDay getValidDay();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDay <em>Valid Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Day</em>' reference.
	 * @see #getValidDay()
	 * @generated
	 */
	void setValidDay(ValidDay value);

	/**
	 * Returns the value of the '<em><b>Valid Day Time Ranges</b></em>' reference list.
	 * The list contents are of type {@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange}.
	 * It is bidirectional and its opposite is '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getTemporalContextTimeRanges <em>Temporal Context Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Day Time Ranges</em>' reference list.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange_ValidDayTimeRanges()
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getTemporalContextTimeRanges
	 * @model opposite="temporalContextTimeRanges"
	 * @generated
	 */
	EList<ValidDayTimeRange> getValidDayTimeRanges();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#getTimeRange_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TimeRange
