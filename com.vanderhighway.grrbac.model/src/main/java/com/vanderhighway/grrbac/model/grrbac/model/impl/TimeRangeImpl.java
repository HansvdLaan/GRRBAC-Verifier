/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.TimeRange;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDay;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl#getValidDay <em>Valid Day</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl#getValidDayTimeRanges <em>Valid Day Time Ranges</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeRangeImpl extends MinimalEObjectImpl.Container implements TimeRange {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidDay() <em>Valid Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDay()
	 * @generated
	 * @ordered
	 */
	protected ValidDay validDay;

	/**
	 * The cached value of the '{@link #getValidDayTimeRanges() <em>Valid Day Time Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayTimeRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDayTimeRange> validDayTimeRanges;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.TIME_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TIME_RANGE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TIME_RANGE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDay getValidDay() {
		if (validDay != null && validDay.eIsProxy()) {
			InternalEObject oldValidDay = (InternalEObject)validDay;
			validDay = (ValidDay)eResolveProxy(oldValidDay);
			if (validDay != oldValidDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TIME_RANGE__VALID_DAY, oldValidDay, validDay));
			}
		}
		return validDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDay basicGetValidDay() {
		return validDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidDay(ValidDay newValidDay, NotificationChain msgs) {
		ValidDay oldValidDay = validDay;
		validDay = newValidDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TIME_RANGE__VALID_DAY, oldValidDay, newValidDay);
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
	public void setValidDay(ValidDay newValidDay) {
		if (newValidDay != validDay) {
			NotificationChain msgs = null;
			if (validDay != null)
				msgs = ((InternalEObject)validDay).eInverseRemove(this, GRRBACPackage.VALID_DAY__TIME_RANGES, ValidDay.class, msgs);
			if (newValidDay != null)
				msgs = ((InternalEObject)newValidDay).eInverseAdd(this, GRRBACPackage.VALID_DAY__TIME_RANGES, ValidDay.class, msgs);
			msgs = basicSetValidDay(newValidDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TIME_RANGE__VALID_DAY, newValidDay, newValidDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDayTimeRange> getValidDayTimeRanges() {
		if (validDayTimeRanges == null) {
			validDayTimeRanges = new EObjectWithInverseResolvingEList.ManyInverse<ValidDayTimeRange>(ValidDayTimeRange.class, this, GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES, GRRBACPackage.VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES);
		}
		return validDayTimeRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TIME_RANGE__NAME, oldName, name));
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
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				if (validDay != null)
					msgs = ((InternalEObject)validDay).eInverseRemove(this, GRRBACPackage.VALID_DAY__TIME_RANGES, ValidDay.class, msgs);
				return basicSetValidDay((ValidDay)otherEnd, msgs);
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidDayTimeRanges()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				return basicSetValidDay(null, msgs);
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				return ((InternalEList<?>)getValidDayTimeRanges()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.TIME_RANGE__START:
				return getStart();
			case GRRBACPackage.TIME_RANGE__END:
				return getEnd();
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				if (resolve) return getValidDay();
				return basicGetValidDay();
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				return getValidDayTimeRanges();
			case GRRBACPackage.TIME_RANGE__NAME:
				return getName();
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
			case GRRBACPackage.TIME_RANGE__START:
				setStart((Integer)newValue);
				return;
			case GRRBACPackage.TIME_RANGE__END:
				setEnd((Integer)newValue);
				return;
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				setValidDay((ValidDay)newValue);
				return;
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				getValidDayTimeRanges().clear();
				getValidDayTimeRanges().addAll((Collection<? extends ValidDayTimeRange>)newValue);
				return;
			case GRRBACPackage.TIME_RANGE__NAME:
				setName((String)newValue);
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
			case GRRBACPackage.TIME_RANGE__START:
				setStart(START_EDEFAULT);
				return;
			case GRRBACPackage.TIME_RANGE__END:
				setEnd(END_EDEFAULT);
				return;
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				setValidDay((ValidDay)null);
				return;
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				getValidDayTimeRanges().clear();
				return;
			case GRRBACPackage.TIME_RANGE__NAME:
				setName(NAME_EDEFAULT);
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
			case GRRBACPackage.TIME_RANGE__START:
				return start != START_EDEFAULT;
			case GRRBACPackage.TIME_RANGE__END:
				return end != END_EDEFAULT;
			case GRRBACPackage.TIME_RANGE__VALID_DAY:
				return validDay != null;
			case GRRBACPackage.TIME_RANGE__VALID_DAY_TIME_RANGES:
				return validDayTimeRanges != null && !validDayTimeRanges.isEmpty();
			case GRRBACPackage.TIME_RANGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TimeRangeImpl
