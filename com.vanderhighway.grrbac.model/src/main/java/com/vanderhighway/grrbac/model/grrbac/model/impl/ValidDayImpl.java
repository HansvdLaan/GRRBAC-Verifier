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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl#getTimeRanges <em>Time Ranges</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValidDayImpl extends MinimalEObjectImpl.Container implements ValidDay {
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
	 * The cached value of the '{@link #getTimeRanges() <em>Time Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeRange> timeRanges;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDayTimeRange> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.VALID_DAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeRange> getTimeRanges() {
		if (timeRanges == null) {
			timeRanges = new EObjectWithInverseResolvingEList<TimeRange>(TimeRange.class, this, GRRBACPackage.VALID_DAY__TIME_RANGES, GRRBACPackage.TIME_RANGE__VALID_DAY);
		}
		return timeRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDayTimeRange> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ValidDayTimeRange>(ValidDayTimeRange.class, this, GRRBACPackage.VALID_DAY__INSTANCES);
		}
		return instances;
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
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeRanges()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				return ((InternalEList<?>)getTimeRanges()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.VALID_DAY__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY__NAME:
				return getName();
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				return getTimeRanges();
			case GRRBACPackage.VALID_DAY__INSTANCES:
				return getInstances();
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
			case GRRBACPackage.VALID_DAY__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				getTimeRanges().clear();
				getTimeRanges().addAll((Collection<? extends TimeRange>)newValue);
				return;
			case GRRBACPackage.VALID_DAY__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ValidDayTimeRange>)newValue);
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
			case GRRBACPackage.VALID_DAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				getTimeRanges().clear();
				return;
			case GRRBACPackage.VALID_DAY__INSTANCES:
				getInstances().clear();
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
			case GRRBACPackage.VALID_DAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.VALID_DAY__TIME_RANGES:
				return timeRanges != null && !timeRanges.isEmpty();
			case GRRBACPackage.VALID_DAY__INSTANCES:
				return instances != null && !instances.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValidDayImpl
