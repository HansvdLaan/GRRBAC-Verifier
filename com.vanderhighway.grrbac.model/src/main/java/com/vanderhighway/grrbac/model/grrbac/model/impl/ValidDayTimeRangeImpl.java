/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.TimeRange;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Day Time Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl#getTemporalContextTimeRanges <em>Temporal Context Time Ranges</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidDayTimeRangeImpl extends TimeRangeImpl implements ValidDayTimeRange {
	/**
	 * The cached value of the '{@link #getTemporalContextTimeRanges() <em>Temporal Context Time Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalContextTimeRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeRange> temporalContextTimeRanges;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ValidDayTimeRange next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ValidDayTimeRange previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayTimeRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY_TIME_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeRange> getTemporalContextTimeRanges() {
		if (temporalContextTimeRanges == null) {
			temporalContextTimeRanges = new EObjectWithInverseResolvingEList.ManyInverse<TimeRange>(TimeRange.class, this, GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES, GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES);
		}
		return temporalContextTimeRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayTimeRange getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ValidDayTimeRange)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDayTimeRange basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(ValidDayTimeRange newNext, NotificationChain msgs) {
		ValidDayTimeRange oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(ValidDayTimeRange newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, ValidDayTimeRange.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, ValidDayTimeRange.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayTimeRange getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ValidDayTimeRange)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDayTimeRange basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(ValidDayTimeRange newPrevious, NotificationChain msgs) {
		ValidDayTimeRange oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious(ValidDayTimeRange newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, ValidDayTimeRange.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, ValidDayTimeRange.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemporalContextTimeRanges()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS, ValidDayTimeRange.class, msgs);
				return basicSetNext((ValidDayTimeRange)otherEnd, msgs);
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT, ValidDayTimeRange.class, msgs);
				return basicSetPrevious((ValidDayTimeRange)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				return ((InternalEList<?>)getTemporalContextTimeRanges()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				return basicSetNext(null, msgs);
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				return basicSetPrevious(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				return getTemporalContextTimeRanges();
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				getTemporalContextTimeRanges().clear();
				getTemporalContextTimeRanges().addAll((Collection<? extends TimeRange>)newValue);
				return;
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				setNext((ValidDayTimeRange)newValue);
				return;
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				setPrevious((ValidDayTimeRange)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				getTemporalContextTimeRanges().clear();
				return;
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				setNext((ValidDayTimeRange)null);
				return;
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				setPrevious((ValidDayTimeRange)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES:
				return temporalContextTimeRanges != null && !temporalContextTimeRanges.isEmpty();
			case GRRBACPackage.VALID_DAY_TIME_RANGE__NEXT:
				return next != null;
			case GRRBACPackage.VALID_DAY_TIME_RANGE__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

} //ValidDayTimeRangeImpl
