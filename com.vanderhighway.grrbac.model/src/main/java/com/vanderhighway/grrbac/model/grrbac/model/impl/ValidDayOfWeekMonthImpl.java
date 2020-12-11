/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear;

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
 * An implementation of the model object '<em><b>Valid Day Of Week Month</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl#getValidDayOfWeek <em>Valid Day Of Week</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl#getValidDayOfMonth <em>Valid Day Of Month</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl#getValidDayOfYear <em>Valid Day Of Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidDayOfWeekMonthImpl extends ValidDayImpl implements ValidDayOfWeekMonth {
	/**
	 * The cached value of the '{@link #getValidDayOfWeek() <em>Valid Day Of Week</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected ValidDayOfWeek validDayOfWeek;

	/**
	 * The cached value of the '{@link #getValidDayOfMonth() <em>Valid Day Of Month</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected ValidDayOfMonth validDayOfMonth;

	/**
	 * The cached value of the '{@link #getValidDayOfYear() <em>Valid Day Of Year</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDayOfYear> validDayOfYear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayOfWeekMonthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY_OF_WEEK_MONTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfWeek getValidDayOfWeek() {
		if (validDayOfWeek != null && validDayOfWeek.eIsProxy()) {
			InternalEObject oldValidDayOfWeek = (InternalEObject)validDayOfWeek;
			validDayOfWeek = (ValidDayOfWeek)eResolveProxy(oldValidDayOfWeek);
			if (validDayOfWeek != oldValidDayOfWeek) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK, oldValidDayOfWeek, validDayOfWeek));
			}
		}
		return validDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDayOfWeek basicGetValidDayOfWeek() {
		return validDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidDayOfWeek(ValidDayOfWeek newValidDayOfWeek, NotificationChain msgs) {
		ValidDayOfWeek oldValidDayOfWeek = validDayOfWeek;
		validDayOfWeek = newValidDayOfWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK, oldValidDayOfWeek, newValidDayOfWeek);
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
	public void setValidDayOfWeek(ValidDayOfWeek newValidDayOfWeek) {
		if (newValidDayOfWeek != validDayOfWeek) {
			NotificationChain msgs = null;
			if (validDayOfWeek != null)
				msgs = ((InternalEObject)validDayOfWeek).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH, ValidDayOfWeek.class, msgs);
			if (newValidDayOfWeek != null)
				msgs = ((InternalEObject)newValidDayOfWeek).eInverseAdd(this, GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH, ValidDayOfWeek.class, msgs);
			msgs = basicSetValidDayOfWeek(newValidDayOfWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK, newValidDayOfWeek, newValidDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfMonth getValidDayOfMonth() {
		if (validDayOfMonth != null && validDayOfMonth.eIsProxy()) {
			InternalEObject oldValidDayOfMonth = (InternalEObject)validDayOfMonth;
			validDayOfMonth = (ValidDayOfMonth)eResolveProxy(oldValidDayOfMonth);
			if (validDayOfMonth != oldValidDayOfMonth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH, oldValidDayOfMonth, validDayOfMonth));
			}
		}
		return validDayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDayOfMonth basicGetValidDayOfMonth() {
		return validDayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidDayOfMonth(ValidDayOfMonth newValidDayOfMonth, NotificationChain msgs) {
		ValidDayOfMonth oldValidDayOfMonth = validDayOfMonth;
		validDayOfMonth = newValidDayOfMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH, oldValidDayOfMonth, newValidDayOfMonth);
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
	public void setValidDayOfMonth(ValidDayOfMonth newValidDayOfMonth) {
		if (newValidDayOfMonth != validDayOfMonth) {
			NotificationChain msgs = null;
			if (validDayOfMonth != null)
				msgs = ((InternalEObject)validDayOfMonth).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH, ValidDayOfMonth.class, msgs);
			if (newValidDayOfMonth != null)
				msgs = ((InternalEObject)newValidDayOfMonth).eInverseAdd(this, GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH, ValidDayOfMonth.class, msgs);
			msgs = basicSetValidDayOfMonth(newValidDayOfMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH, newValidDayOfMonth, newValidDayOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDayOfYear> getValidDayOfYear() {
		if (validDayOfYear == null) {
			validDayOfYear = new EObjectWithInverseResolvingEList<ValidDayOfYear>(ValidDayOfYear.class, this, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR, GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH);
		}
		return validDayOfYear;
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				if (validDayOfWeek != null)
					msgs = ((InternalEObject)validDayOfWeek).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH, ValidDayOfWeek.class, msgs);
				return basicSetValidDayOfWeek((ValidDayOfWeek)otherEnd, msgs);
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				if (validDayOfMonth != null)
					msgs = ((InternalEObject)validDayOfMonth).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH, ValidDayOfMonth.class, msgs);
				return basicSetValidDayOfMonth((ValidDayOfMonth)otherEnd, msgs);
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidDayOfYear()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				return basicSetValidDayOfWeek(null, msgs);
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				return basicSetValidDayOfMonth(null, msgs);
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				return ((InternalEList<?>)getValidDayOfYear()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				if (resolve) return getValidDayOfWeek();
				return basicGetValidDayOfWeek();
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				if (resolve) return getValidDayOfMonth();
				return basicGetValidDayOfMonth();
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				return getValidDayOfYear();
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				setValidDayOfWeek((ValidDayOfWeek)newValue);
				return;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				setValidDayOfMonth((ValidDayOfMonth)newValue);
				return;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				getValidDayOfYear().clear();
				getValidDayOfYear().addAll((Collection<? extends ValidDayOfYear>)newValue);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				setValidDayOfWeek((ValidDayOfWeek)null);
				return;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				setValidDayOfMonth((ValidDayOfMonth)null);
				return;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				getValidDayOfYear().clear();
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
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK:
				return validDayOfWeek != null;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH:
				return validDayOfMonth != null;
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR:
				return validDayOfYear != null && !validDayOfYear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidDayOfWeekMonthImpl
