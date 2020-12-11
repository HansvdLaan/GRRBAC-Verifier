/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.Permission;
import com.vanderhighway.grrbac.model.grrbac.model.SACSObject;

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
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl#getPD <em>PD</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl#getPO <em>PO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The cached value of the '{@link #getPD() <em>PD</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPD()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> pd;

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
	 * The cached value of the '{@link #getPO() <em>PO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPO()
	 * @generated
	 * @ordered
	 */
	protected SACSObject po;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getPD() {
		if (pd == null) {
			pd = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this, GRRBACPackage.PERMISSION__PD, GRRBACPackage.DEMARCATION__DP);
		}
		return pd;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.PERMISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SACSObject getPO() {
		if (po != null && po.eIsProxy()) {
			InternalEObject oldPO = (InternalEObject)po;
			po = (SACSObject)eResolveProxy(oldPO);
			if (po != oldPO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.PERMISSION__PO, oldPO, po));
			}
		}
		return po;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SACSObject basicGetPO() {
		return po;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPO(SACSObject newPO, NotificationChain msgs) {
		SACSObject oldPO = po;
		po = newPO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.PERMISSION__PO, oldPO, newPO);
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
	public void setPO(SACSObject newPO) {
		if (newPO != po) {
			NotificationChain msgs = null;
			if (po != null)
				msgs = ((InternalEObject)po).eInverseRemove(this, GRRBACPackage.SACS_OBJECT__OP, SACSObject.class, msgs);
			if (newPO != null)
				msgs = ((InternalEObject)newPO).eInverseAdd(this, GRRBACPackage.SACS_OBJECT__OP, SACSObject.class, msgs);
			msgs = basicSetPO(newPO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.PERMISSION__PO, newPO, newPO));
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
			case GRRBACPackage.PERMISSION__PD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPD()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.PERMISSION__PO:
				if (po != null)
					msgs = ((InternalEObject)po).eInverseRemove(this, GRRBACPackage.SACS_OBJECT__OP, SACSObject.class, msgs);
				return basicSetPO((SACSObject)otherEnd, msgs);
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
			case GRRBACPackage.PERMISSION__PD:
				return ((InternalEList<?>)getPD()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.PERMISSION__PO:
				return basicSetPO(null, msgs);
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
			case GRRBACPackage.PERMISSION__PD:
				return getPD();
			case GRRBACPackage.PERMISSION__NAME:
				return getName();
			case GRRBACPackage.PERMISSION__PO:
				if (resolve) return getPO();
				return basicGetPO();
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
			case GRRBACPackage.PERMISSION__PD:
				getPD().clear();
				getPD().addAll((Collection<? extends Demarcation>)newValue);
				return;
			case GRRBACPackage.PERMISSION__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.PERMISSION__PO:
				setPO((SACSObject)newValue);
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
			case GRRBACPackage.PERMISSION__PD:
				getPD().clear();
				return;
			case GRRBACPackage.PERMISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.PERMISSION__PO:
				setPO((SACSObject)null);
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
			case GRRBACPackage.PERMISSION__PD:
				return pd != null && !pd.isEmpty();
			case GRRBACPackage.PERMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.PERMISSION__PO:
				return po != null;
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

} //PermissionImpl
