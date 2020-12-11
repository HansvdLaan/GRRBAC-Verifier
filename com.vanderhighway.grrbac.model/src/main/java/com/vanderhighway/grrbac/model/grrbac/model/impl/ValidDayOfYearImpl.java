/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Day Of Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfYearImpl#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidDayOfYearImpl extends ValidDayImpl implements ValidDayOfYear {
	/**
	 * The cached value of the '{@link #getValidDayOfWeekMonth() <em>Valid Day Of Week Month</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 * @ordered
	 */
	protected ValidDayOfWeekMonth validDayOfWeekMonth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayOfYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY_OF_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfWeekMonth getValidDayOfWeekMonth() {
		if (validDayOfWeekMonth != null && validDayOfWeekMonth.eIsProxy()) {
			InternalEObject oldValidDayOfWeekMonth = (InternalEObject)validDayOfWeekMonth;
			validDayOfWeekMonth = (ValidDayOfWeekMonth)eResolveProxy(oldValidDayOfWeekMonth);
			if (validDayOfWeekMonth != oldValidDayOfWeekMonth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH, oldValidDayOfWeekMonth, validDayOfWeekMonth));
			}
		}
		return validDayOfWeekMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidDayOfWeekMonth basicGetValidDayOfWeekMonth() {
		return validDayOfWeekMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidDayOfWeekMonth(ValidDayOfWeekMonth newValidDayOfWeekMonth, NotificationChain msgs) {
		ValidDayOfWeekMonth oldValidDayOfWeekMonth = validDayOfWeekMonth;
		validDayOfWeekMonth = newValidDayOfWeekMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH, oldValidDayOfWeekMonth, newValidDayOfWeekMonth);
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
	public void setValidDayOfWeekMonth(ValidDayOfWeekMonth newValidDayOfWeekMonth) {
		if (newValidDayOfWeekMonth != validDayOfWeekMonth) {
			NotificationChain msgs = null;
			if (validDayOfWeekMonth != null)
				msgs = ((InternalEObject)validDayOfWeekMonth).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR, ValidDayOfWeekMonth.class, msgs);
			if (newValidDayOfWeekMonth != null)
				msgs = ((InternalEObject)newValidDayOfWeekMonth).eInverseAdd(this, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR, ValidDayOfWeekMonth.class, msgs);
			msgs = basicSetValidDayOfWeekMonth(newValidDayOfWeekMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH, newValidDayOfWeekMonth, newValidDayOfWeekMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				if (validDayOfWeekMonth != null)
					msgs = ((InternalEObject)validDayOfWeekMonth).eInverseRemove(this, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR, ValidDayOfWeekMonth.class, msgs);
				return basicSetValidDayOfWeekMonth((ValidDayOfWeekMonth)otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				return basicSetValidDayOfWeekMonth(null, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				if (resolve) return getValidDayOfWeekMonth();
				return basicGetValidDayOfWeekMonth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				setValidDayOfWeekMonth((ValidDayOfWeekMonth)newValue);
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
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				setValidDayOfWeekMonth((ValidDayOfWeekMonth)null);
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
			case GRRBACPackage.VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH:
				return validDayOfWeekMonth != null;
		}
		return super.eIsSet(featureID);
	}

} //ValidDayOfYearImpl
