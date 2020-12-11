/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology;
import com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDDPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDRDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDRPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDUDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDUPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.BoDURConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.ContextContainer;
import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACFactory;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.MyScenario;
import com.vanderhighway.grrbac.model.grrbac.model.Permission;
import com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteDPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteURConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.Role;
import com.vanderhighway.grrbac.model.grrbac.model.SACSObject;
import com.vanderhighway.grrbac.model.grrbac.model.SecurityZone;
import com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem;
import com.vanderhighway.grrbac.model.grrbac.model.SoDDPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SoDRDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SoDRPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SoDUDConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SoDUPConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SoDURConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule;
import com.vanderhighway.grrbac.model.grrbac.model.TimeRange;
import com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.User;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDay;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GRRBACPackageImpl extends EPackageImpl implements GRRBACPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demarcationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayOfWeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayOfMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayTimeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayOfWeekMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalGrantRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sacsObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteAccessControlSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDependentAuthorizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryUserConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryUserConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryRoleConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryRoleConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDemarcationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDemarcationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPermissionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPermissionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDURConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDUDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDUPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDRDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDDPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteURConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteUDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteUPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteRDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteRPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteDPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDURConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDUDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDRDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDUPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDRPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boDDPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityURConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityUDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRDConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityUPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityDPConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validDayOfYearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalAuthenticationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlSystemTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soDRPConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GRRBACPackageImpl() {
		super(eNS_URI, GRRBACFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GRRBACPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GRRBACPackage init() {
		if (isInited) return (GRRBACPackage)EPackage.Registry.INSTANCE.getEPackage(GRRBACPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGRRBACPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GRRBACPackageImpl theGRRBACPackage = registeredGRRBACPackage instanceof GRRBACPackageImpl ? (GRRBACPackageImpl)registeredGRRBACPackage : new GRRBACPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGRRBACPackage.createPackageContents();

		// Initialize created meta-data
		theGRRBACPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGRRBACPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GRRBACPackage.eNS_URI, theGRRBACPackage);
		return theGRRBACPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_UR() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_RU() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_RD() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Juniors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Seniors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ConstrainedBy() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDemarcation() {
		return demarcationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemarcation_DR() {
		return (EReference)demarcationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemarcation_DP() {
		return (EReference)demarcationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemarcation_Subdemarcations() {
		return (EReference)demarcationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemarcation_Superdemarcations() {
		return (EReference)demarcationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDemarcation_Name() {
		return (EAttribute)demarcationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemarcation_ConstrainedBy() {
		return (EReference)demarcationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_PD() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Name() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_PO() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeRange() {
		return timeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeRange_Start() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeRange_End() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeRange_ValidDay() {
		return (EReference)timeRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeRange_ValidDayTimeRanges() {
		return (EReference)timeRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeRange_Name() {
		return (EAttribute)timeRangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDay() {
		return validDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidDay_Name() {
		return (EAttribute)validDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDay_TimeRanges() {
		return (EReference)validDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDay_Instances() {
		return (EReference)validDayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDayOfWeek() {
		return validDayOfWeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfWeek_ValidDayOfWeekMonth() {
		return (EReference)validDayOfWeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDayOfMonth() {
		return validDayOfMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfMonth_ValidDaysOfWeekMonth() {
		return (EReference)validDayOfMonthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalContext() {
		return temporalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalContext_Instances() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalContext_Name() {
		return (EAttribute)temporalContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalContext_TemporalGrantRules() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalContext_AuthorizationConstraints() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalContext_TemporalAuthenticationRules() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalContext_MyScenarios() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDayTimeRange() {
		return validDayTimeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayTimeRange_TemporalContextTimeRanges() {
		return (EReference)validDayTimeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayTimeRange_Next() {
		return (EReference)validDayTimeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayTimeRange_Previous() {
		return (EReference)validDayTimeRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDayOfWeekMonth() {
		return validDayOfWeekMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfWeekMonth_ValidDayOfWeek() {
		return (EReference)validDayOfWeekMonthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfWeekMonth_ValidDayOfMonth() {
		return (EReference)validDayOfWeekMonthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfWeekMonth_ValidDayOfYear() {
		return (EReference)validDayOfWeekMonthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalGrantRule() {
		return temporalGrantRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalGrantRule_Name() {
		return (EAttribute)temporalGrantRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalGrantRule_Priority() {
		return (EAttribute)temporalGrantRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalGrantRule_IsGrant() {
		return (EAttribute)temporalGrantRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalGrantRule_Role() {
		return (EReference)temporalGrantRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalGrantRule_Demarcation() {
		return (EReference)temporalGrantRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalGrantRule_TemporalContext() {
		return (EReference)temporalGrantRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSACSObject() {
		return sacsObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSACSObject_Name() {
		return (EAttribute)sacsObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSACSObject_OP() {
		return (EReference)sacsObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSiteAccessControlSystem() {
		return siteAccessControlSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSiteAccessControlSystem_Name() {
		return (EAttribute)siteAccessControlSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteAccessControlSystem_AuthorizationConstraints() {
		return (EReference)siteAccessControlSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteAccessControlSystem_AuthorizationPolicy() {
		return (EReference)siteAccessControlSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteAccessControlSystem_ContextContainer() {
		return (EReference)siteAccessControlSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteAccessControlSystem_AuthenticationPolicy() {
		return (EReference)siteAccessControlSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteAccessControlSystem_Topology() {
		return (EReference)siteAccessControlSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityZone() {
		return securityZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityZone_Public() {
		return (EAttribute)securityZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityZone_Reachable() {
		return (EReference)securityZoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityZone_ConstrainedBy() {
		return (EReference)securityZoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyDependentAuthorizationConstraint() {
		return policyDependentAuthorizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDependentAuthorizationConstraint_Name() {
		return (EAttribute)policyDependentAuthorizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyDependentAuthorizationConstraint_TemporalContext() {
		return (EReference)policyDependentAuthorizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryUserConstraint() {
		return unaryUserConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryUserConstraint_User() {
		return (EReference)unaryUserConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryUserConstraint() {
		return binaryUserConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryUserConstraint_Left() {
		return (EReference)binaryUserConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryUserConstraint_Right() {
		return (EReference)binaryUserConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryRoleConstraint() {
		return unaryRoleConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryRoleConstraint_Role() {
		return (EReference)unaryRoleConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryRoleConstraint() {
		return binaryRoleConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryRoleConstraint_Left() {
		return (EReference)binaryRoleConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryRoleConstraint_Right() {
		return (EReference)binaryRoleConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryDemarcationConstraint() {
		return unaryDemarcationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryDemarcationConstraint_Demarcation() {
		return (EReference)unaryDemarcationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryDemarcationConstraint() {
		return binaryDemarcationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryDemarcationConstraint_Left() {
		return (EReference)binaryDemarcationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryDemarcationConstraint_Right() {
		return (EReference)binaryDemarcationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryPermissionConstraint() {
		return unaryPermissionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryPermissionConstraint_Permission() {
		return (EReference)unaryPermissionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryPermissionConstraint() {
		return binaryPermissionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryPermissionConstraint_Left() {
		return (EReference)binaryPermissionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryPermissionConstraint_Right() {
		return (EReference)binaryPermissionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDURConstraint() {
		return soDURConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDUDConstraint() {
		return soDUDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDUPConstraint() {
		return soDUPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDRDConstraint() {
		return soDRDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDDPConstraint() {
		return soDDPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizationPolicy() {
		return authorizationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationPolicy_Users() {
		return (EReference)authorizationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationPolicy_Roles() {
		return (EReference)authorizationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationPolicy_Demarcations() {
		return (EReference)authorizationPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationPolicy_Permissions() {
		return (EReference)authorizationPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationPolicy_Name() {
		return (EAttribute)authorizationPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationPolicy_TemporalGrantRules() {
		return (EReference)authorizationPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteURConstraint() {
		return prerequisiteURConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteUDConstraint() {
		return prerequisiteUDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteUPConstraint() {
		return prerequisiteUPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteRDConstraint() {
		return prerequisiteRDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteRPConstraint() {
		return prerequisiteRPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteDPConstraint() {
		return prerequisiteDPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDURConstraint() {
		return boDURConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDUDConstraint() {
		return boDUDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDRDConstraint() {
		return boDRDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDUPConstraint() {
		return boDUPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDRPConstraint() {
		return boDRPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoDDPConstraint() {
		return boDDPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityURConstraint() {
		return cardinalityURConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityURConstraint_Bound() {
		return (EAttribute)cardinalityURConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityUDConstraint() {
		return cardinalityUDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityUDConstraint_Bound() {
		return (EAttribute)cardinalityUDConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityRDConstraint() {
		return cardinalityRDConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityRDConstraint_Bound() {
		return (EAttribute)cardinalityRDConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityUPConstraint() {
		return cardinalityUPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityUPConstraint_Bound() {
		return (EAttribute)cardinalityUPConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityRPConstraint() {
		return cardinalityRPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityRPConstraint_Bound() {
		return (EAttribute)cardinalityRPConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityDPConstraint() {
		return cardinalityDPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityDPConstraint_Bound() {
		return (EAttribute)cardinalityDPConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextContainer() {
		return contextContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextContainer_TemporalContexts() {
		return (EReference)contextContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextContainer_ValidDays() {
		return (EReference)contextContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextContainer_Name() {
		return (EAttribute)contextContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextContainer_MyScenarios() {
		return (EReference)contextContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidDayOfYear() {
		return validDayOfYearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidDayOfYear_ValidDayOfWeekMonth() {
		return (EReference)validDayOfYearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationPolicy() {
		return authenticationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationPolicy_Name() {
		return (EAttribute)authenticationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthenticationPolicy_TemporalAuthenticationRules() {
		return (EReference)authenticationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalAuthenticationRule() {
		return temporalAuthenticationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalAuthenticationRule_Name() {
		return (EAttribute)temporalAuthenticationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalAuthenticationRule_Priority() {
		return (EAttribute)temporalAuthenticationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalAuthenticationRule_Status() {
		return (EAttribute)temporalAuthenticationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalAuthenticationRule_TemporalContext() {
		return (EReference)temporalAuthenticationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalAuthenticationRule_SecurityZone() {
		return (EReference)temporalAuthenticationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMyScenario() {
		return myScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMyScenario_TemporalContexts() {
		return (EReference)myScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControlSystemTopology() {
		return accessControlSystemTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlSystemTopology_Name() {
		return (EAttribute)accessControlSystemTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlSystemTopology_SecurityZones() {
		return (EReference)accessControlSystemTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoDRPConstraint() {
		return soDRPConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GRRBACFactory getGRRBACFactory() {
		return (GRRBACFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEReference(userEClass, USER__UR);
		createEAttribute(userEClass, USER__NAME);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__RU);
		createEReference(roleEClass, ROLE__RD);
		createEReference(roleEClass, ROLE__JUNIORS);
		createEReference(roleEClass, ROLE__SENIORS);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__CONSTRAINED_BY);

		demarcationEClass = createEClass(DEMARCATION);
		createEReference(demarcationEClass, DEMARCATION__DR);
		createEReference(demarcationEClass, DEMARCATION__DP);
		createEReference(demarcationEClass, DEMARCATION__SUBDEMARCATIONS);
		createEReference(demarcationEClass, DEMARCATION__SUPERDEMARCATIONS);
		createEAttribute(demarcationEClass, DEMARCATION__NAME);
		createEReference(demarcationEClass, DEMARCATION__CONSTRAINED_BY);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__PD);
		createEAttribute(permissionEClass, PERMISSION__NAME);
		createEReference(permissionEClass, PERMISSION__PO);

		timeRangeEClass = createEClass(TIME_RANGE);
		createEAttribute(timeRangeEClass, TIME_RANGE__START);
		createEAttribute(timeRangeEClass, TIME_RANGE__END);
		createEReference(timeRangeEClass, TIME_RANGE__VALID_DAY);
		createEReference(timeRangeEClass, TIME_RANGE__VALID_DAY_TIME_RANGES);
		createEAttribute(timeRangeEClass, TIME_RANGE__NAME);

		validDayEClass = createEClass(VALID_DAY);
		createEAttribute(validDayEClass, VALID_DAY__NAME);
		createEReference(validDayEClass, VALID_DAY__TIME_RANGES);
		createEReference(validDayEClass, VALID_DAY__INSTANCES);

		validDayOfWeekEClass = createEClass(VALID_DAY_OF_WEEK);
		createEReference(validDayOfWeekEClass, VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH);

		validDayOfMonthEClass = createEClass(VALID_DAY_OF_MONTH);
		createEReference(validDayOfMonthEClass, VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH);

		temporalContextEClass = createEClass(TEMPORAL_CONTEXT);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__INSTANCES);
		createEAttribute(temporalContextEClass, TEMPORAL_CONTEXT__NAME);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__MY_SCENARIOS);

		validDayTimeRangeEClass = createEClass(VALID_DAY_TIME_RANGE);
		createEReference(validDayTimeRangeEClass, VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES);
		createEReference(validDayTimeRangeEClass, VALID_DAY_TIME_RANGE__NEXT);
		createEReference(validDayTimeRangeEClass, VALID_DAY_TIME_RANGE__PREVIOUS);

		validDayOfWeekMonthEClass = createEClass(VALID_DAY_OF_WEEK_MONTH);
		createEReference(validDayOfWeekMonthEClass, VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK);
		createEReference(validDayOfWeekMonthEClass, VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH);
		createEReference(validDayOfWeekMonthEClass, VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR);

		temporalGrantRuleEClass = createEClass(TEMPORAL_GRANT_RULE);
		createEAttribute(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__NAME);
		createEAttribute(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__PRIORITY);
		createEAttribute(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__IS_GRANT);
		createEReference(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__ROLE);
		createEReference(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__DEMARCATION);
		createEReference(temporalGrantRuleEClass, TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT);

		sacsObjectEClass = createEClass(SACS_OBJECT);
		createEAttribute(sacsObjectEClass, SACS_OBJECT__NAME);
		createEReference(sacsObjectEClass, SACS_OBJECT__OP);

		siteAccessControlSystemEClass = createEClass(SITE_ACCESS_CONTROL_SYSTEM);
		createEAttribute(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__NAME);
		createEReference(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS);
		createEReference(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY);
		createEReference(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER);
		createEReference(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY);
		createEReference(siteAccessControlSystemEClass, SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY);

		securityZoneEClass = createEClass(SECURITY_ZONE);
		createEAttribute(securityZoneEClass, SECURITY_ZONE__PUBLIC);
		createEReference(securityZoneEClass, SECURITY_ZONE__REACHABLE);
		createEReference(securityZoneEClass, SECURITY_ZONE__CONSTRAINED_BY);

		policyDependentAuthorizationConstraintEClass = createEClass(POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT);
		createEAttribute(policyDependentAuthorizationConstraintEClass, POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME);
		createEReference(policyDependentAuthorizationConstraintEClass, POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT);

		unaryUserConstraintEClass = createEClass(UNARY_USER_CONSTRAINT);
		createEReference(unaryUserConstraintEClass, UNARY_USER_CONSTRAINT__USER);

		binaryUserConstraintEClass = createEClass(BINARY_USER_CONSTRAINT);
		createEReference(binaryUserConstraintEClass, BINARY_USER_CONSTRAINT__LEFT);
		createEReference(binaryUserConstraintEClass, BINARY_USER_CONSTRAINT__RIGHT);

		unaryRoleConstraintEClass = createEClass(UNARY_ROLE_CONSTRAINT);
		createEReference(unaryRoleConstraintEClass, UNARY_ROLE_CONSTRAINT__ROLE);

		binaryRoleConstraintEClass = createEClass(BINARY_ROLE_CONSTRAINT);
		createEReference(binaryRoleConstraintEClass, BINARY_ROLE_CONSTRAINT__LEFT);
		createEReference(binaryRoleConstraintEClass, BINARY_ROLE_CONSTRAINT__RIGHT);

		unaryDemarcationConstraintEClass = createEClass(UNARY_DEMARCATION_CONSTRAINT);
		createEReference(unaryDemarcationConstraintEClass, UNARY_DEMARCATION_CONSTRAINT__DEMARCATION);

		binaryDemarcationConstraintEClass = createEClass(BINARY_DEMARCATION_CONSTRAINT);
		createEReference(binaryDemarcationConstraintEClass, BINARY_DEMARCATION_CONSTRAINT__LEFT);
		createEReference(binaryDemarcationConstraintEClass, BINARY_DEMARCATION_CONSTRAINT__RIGHT);

		unaryPermissionConstraintEClass = createEClass(UNARY_PERMISSION_CONSTRAINT);
		createEReference(unaryPermissionConstraintEClass, UNARY_PERMISSION_CONSTRAINT__PERMISSION);

		binaryPermissionConstraintEClass = createEClass(BINARY_PERMISSION_CONSTRAINT);
		createEReference(binaryPermissionConstraintEClass, BINARY_PERMISSION_CONSTRAINT__LEFT);
		createEReference(binaryPermissionConstraintEClass, BINARY_PERMISSION_CONSTRAINT__RIGHT);

		soDURConstraintEClass = createEClass(SO_DUR_CONSTRAINT);

		soDUDConstraintEClass = createEClass(SO_DUD_CONSTRAINT);

		soDUPConstraintEClass = createEClass(SO_DUP_CONSTRAINT);

		soDRDConstraintEClass = createEClass(SO_DRD_CONSTRAINT);

		soDDPConstraintEClass = createEClass(SO_DDP_CONSTRAINT);

		authorizationPolicyEClass = createEClass(AUTHORIZATION_POLICY);
		createEReference(authorizationPolicyEClass, AUTHORIZATION_POLICY__USERS);
		createEReference(authorizationPolicyEClass, AUTHORIZATION_POLICY__ROLES);
		createEReference(authorizationPolicyEClass, AUTHORIZATION_POLICY__DEMARCATIONS);
		createEReference(authorizationPolicyEClass, AUTHORIZATION_POLICY__PERMISSIONS);
		createEAttribute(authorizationPolicyEClass, AUTHORIZATION_POLICY__NAME);
		createEReference(authorizationPolicyEClass, AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES);

		prerequisiteURConstraintEClass = createEClass(PREREQUISITE_UR_CONSTRAINT);

		prerequisiteUDConstraintEClass = createEClass(PREREQUISITE_UD_CONSTRAINT);

		prerequisiteUPConstraintEClass = createEClass(PREREQUISITE_UP_CONSTRAINT);

		prerequisiteRDConstraintEClass = createEClass(PREREQUISITE_RD_CONSTRAINT);

		prerequisiteRPConstraintEClass = createEClass(PREREQUISITE_RP_CONSTRAINT);

		prerequisiteDPConstraintEClass = createEClass(PREREQUISITE_DP_CONSTRAINT);

		boDURConstraintEClass = createEClass(BO_DUR_CONSTRAINT);

		boDUDConstraintEClass = createEClass(BO_DUD_CONSTRAINT);

		boDRDConstraintEClass = createEClass(BO_DRD_CONSTRAINT);

		boDUPConstraintEClass = createEClass(BO_DUP_CONSTRAINT);

		boDRPConstraintEClass = createEClass(BO_DRP_CONSTRAINT);

		boDDPConstraintEClass = createEClass(BO_DDP_CONSTRAINT);

		cardinalityURConstraintEClass = createEClass(CARDINALITY_UR_CONSTRAINT);
		createEAttribute(cardinalityURConstraintEClass, CARDINALITY_UR_CONSTRAINT__BOUND);

		cardinalityUDConstraintEClass = createEClass(CARDINALITY_UD_CONSTRAINT);
		createEAttribute(cardinalityUDConstraintEClass, CARDINALITY_UD_CONSTRAINT__BOUND);

		cardinalityRDConstraintEClass = createEClass(CARDINALITY_RD_CONSTRAINT);
		createEAttribute(cardinalityRDConstraintEClass, CARDINALITY_RD_CONSTRAINT__BOUND);

		cardinalityUPConstraintEClass = createEClass(CARDINALITY_UP_CONSTRAINT);
		createEAttribute(cardinalityUPConstraintEClass, CARDINALITY_UP_CONSTRAINT__BOUND);

		cardinalityRPConstraintEClass = createEClass(CARDINALITY_RP_CONSTRAINT);
		createEAttribute(cardinalityRPConstraintEClass, CARDINALITY_RP_CONSTRAINT__BOUND);

		cardinalityDPConstraintEClass = createEClass(CARDINALITY_DP_CONSTRAINT);
		createEAttribute(cardinalityDPConstraintEClass, CARDINALITY_DP_CONSTRAINT__BOUND);

		contextContainerEClass = createEClass(CONTEXT_CONTAINER);
		createEReference(contextContainerEClass, CONTEXT_CONTAINER__TEMPORAL_CONTEXTS);
		createEReference(contextContainerEClass, CONTEXT_CONTAINER__VALID_DAYS);
		createEAttribute(contextContainerEClass, CONTEXT_CONTAINER__NAME);
		createEReference(contextContainerEClass, CONTEXT_CONTAINER__MY_SCENARIOS);

		validDayOfYearEClass = createEClass(VALID_DAY_OF_YEAR);
		createEReference(validDayOfYearEClass, VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH);

		authenticationPolicyEClass = createEClass(AUTHENTICATION_POLICY);
		createEAttribute(authenticationPolicyEClass, AUTHENTICATION_POLICY__NAME);
		createEReference(authenticationPolicyEClass, AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES);

		temporalAuthenticationRuleEClass = createEClass(TEMPORAL_AUTHENTICATION_RULE);
		createEAttribute(temporalAuthenticationRuleEClass, TEMPORAL_AUTHENTICATION_RULE__NAME);
		createEAttribute(temporalAuthenticationRuleEClass, TEMPORAL_AUTHENTICATION_RULE__PRIORITY);
		createEAttribute(temporalAuthenticationRuleEClass, TEMPORAL_AUTHENTICATION_RULE__STATUS);
		createEReference(temporalAuthenticationRuleEClass, TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT);
		createEReference(temporalAuthenticationRuleEClass, TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE);

		myScenarioEClass = createEClass(MY_SCENARIO);
		createEReference(myScenarioEClass, MY_SCENARIO__TEMPORAL_CONTEXTS);

		accessControlSystemTopologyEClass = createEClass(ACCESS_CONTROL_SYSTEM_TOPOLOGY);
		createEAttribute(accessControlSystemTopologyEClass, ACCESS_CONTROL_SYSTEM_TOPOLOGY__NAME);
		createEReference(accessControlSystemTopologyEClass, ACCESS_CONTROL_SYSTEM_TOPOLOGY__SECURITY_ZONES);

		soDRPConstraintEClass = createEClass(SO_DRP_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		validDayOfWeekEClass.getESuperTypes().add(this.getValidDay());
		validDayOfMonthEClass.getESuperTypes().add(this.getValidDay());
		validDayTimeRangeEClass.getESuperTypes().add(this.getTimeRange());
		validDayOfWeekMonthEClass.getESuperTypes().add(this.getValidDay());
		securityZoneEClass.getESuperTypes().add(this.getSACSObject());
		unaryUserConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		binaryUserConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		unaryRoleConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		binaryRoleConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		unaryDemarcationConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		binaryDemarcationConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		unaryPermissionConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		binaryPermissionConstraintEClass.getESuperTypes().add(this.getPolicyDependentAuthorizationConstraint());
		soDURConstraintEClass.getESuperTypes().add(this.getBinaryRoleConstraint());
		soDUDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		soDUPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		soDRDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		soDDPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		prerequisiteURConstraintEClass.getESuperTypes().add(this.getBinaryRoleConstraint());
		prerequisiteUDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		prerequisiteUPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		prerequisiteRDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		prerequisiteRPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		prerequisiteDPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		boDURConstraintEClass.getESuperTypes().add(this.getBinaryRoleConstraint());
		boDUDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		boDRDConstraintEClass.getESuperTypes().add(this.getBinaryDemarcationConstraint());
		boDUPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		boDRPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		boDDPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());
		cardinalityURConstraintEClass.getESuperTypes().add(this.getUnaryRoleConstraint());
		cardinalityUDConstraintEClass.getESuperTypes().add(this.getUnaryDemarcationConstraint());
		cardinalityRDConstraintEClass.getESuperTypes().add(this.getUnaryDemarcationConstraint());
		cardinalityUPConstraintEClass.getESuperTypes().add(this.getUnaryPermissionConstraint());
		cardinalityRPConstraintEClass.getESuperTypes().add(this.getUnaryPermissionConstraint());
		cardinalityDPConstraintEClass.getESuperTypes().add(this.getUnaryPermissionConstraint());
		validDayOfYearEClass.getESuperTypes().add(this.getValidDay());
		soDRPConstraintEClass.getESuperTypes().add(this.getBinaryPermissionConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_UR(), this.getRole(), this.getRole_RU(), "UR", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_RU(), this.getUser(), this.getUser_UR(), "RU", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RD(), this.getDemarcation(), this.getDemarcation_DR(), "RD", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Juniors(), this.getRole(), this.getRole_Seniors(), "juniors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Seniors(), this.getRole(), this.getRole_Juniors(), "seniors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ConstrainedBy(), this.getTemporalGrantRule(), this.getTemporalGrantRule_Role(), "constrainedBy", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demarcationEClass, Demarcation.class, "Demarcation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemarcation_DR(), this.getRole(), this.getRole_RD(), "DR", null, 0, -1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemarcation_DP(), this.getPermission(), this.getPermission_PD(), "DP", null, 0, -1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemarcation_Subdemarcations(), this.getDemarcation(), this.getDemarcation_Superdemarcations(), "subdemarcations", null, 0, -1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemarcation_Superdemarcations(), this.getDemarcation(), this.getDemarcation_Subdemarcations(), "superdemarcations", null, 0, -1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDemarcation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemarcation_ConstrainedBy(), this.getTemporalGrantRule(), this.getTemporalGrantRule_Demarcation(), "constrainedBy", null, 0, -1, Demarcation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_PD(), this.getDemarcation(), this.getDemarcation_DP(), "PD", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_PO(), this.getSACSObject(), this.getSACSObject_OP(), "PO", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRangeEClass, TimeRange.class, "TimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRange_Start(), ecorePackage.getEInt(), "start", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_End(), ecorePackage.getEInt(), "end", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeRange_ValidDay(), this.getValidDay(), this.getValidDay_TimeRanges(), "validDay", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeRange_ValidDayTimeRanges(), this.getValidDayTimeRange(), this.getValidDayTimeRange_TemporalContextTimeRanges(), "validDayTimeRanges", null, 0, -1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRange_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayEClass, ValidDay.class, "ValidDay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidDay_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValidDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDay_TimeRanges(), this.getTimeRange(), this.getTimeRange_ValidDay(), "timeRanges", null, 0, -1, ValidDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDay_Instances(), this.getValidDayTimeRange(), null, "instances", null, 0, -1, ValidDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayOfWeekEClass, ValidDayOfWeek.class, "ValidDayOfWeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidDayOfWeek_ValidDayOfWeekMonth(), this.getValidDayOfWeekMonth(), this.getValidDayOfWeekMonth_ValidDayOfWeek(), "validDayOfWeekMonth", null, 0, -1, ValidDayOfWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayOfMonthEClass, ValidDayOfMonth.class, "ValidDayOfMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidDayOfMonth_ValidDaysOfWeekMonth(), this.getValidDayOfWeekMonth(), this.getValidDayOfWeekMonth_ValidDayOfMonth(), "validDaysOfWeekMonth", null, 0, -1, ValidDayOfMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalContextEClass, TemporalContext.class, "TemporalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalContext_Instances(), this.getTimeRange(), null, "instances", null, 0, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalContext_TemporalGrantRules(), this.getTemporalGrantRule(), this.getTemporalGrantRule_TemporalContext(), "temporalGrantRules", null, 0, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalContext_AuthorizationConstraints(), this.getPolicyDependentAuthorizationConstraint(), this.getPolicyDependentAuthorizationConstraint_TemporalContext(), "authorizationConstraints", null, 0, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalContext_TemporalAuthenticationRules(), this.getTemporalAuthenticationRule(), this.getTemporalAuthenticationRule_TemporalContext(), "temporalAuthenticationRules", null, 0, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalContext_MyScenarios(), this.getMyScenario(), this.getMyScenario_TemporalContexts(), "myScenarios", null, 0, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayTimeRangeEClass, ValidDayTimeRange.class, "ValidDayTimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidDayTimeRange_TemporalContextTimeRanges(), this.getTimeRange(), this.getTimeRange_ValidDayTimeRanges(), "temporalContextTimeRanges", null, 0, -1, ValidDayTimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDayTimeRange_Next(), this.getValidDayTimeRange(), this.getValidDayTimeRange_Previous(), "next", null, 0, 1, ValidDayTimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDayTimeRange_Previous(), this.getValidDayTimeRange(), this.getValidDayTimeRange_Next(), "previous", null, 0, 1, ValidDayTimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayOfWeekMonthEClass, ValidDayOfWeekMonth.class, "ValidDayOfWeekMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidDayOfWeekMonth_ValidDayOfWeek(), this.getValidDayOfWeek(), this.getValidDayOfWeek_ValidDayOfWeekMonth(), "validDayOfWeek", null, 0, 1, ValidDayOfWeekMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDayOfWeekMonth_ValidDayOfMonth(), this.getValidDayOfMonth(), this.getValidDayOfMonth_ValidDaysOfWeekMonth(), "validDayOfMonth", null, 0, 1, ValidDayOfWeekMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidDayOfWeekMonth_ValidDayOfYear(), this.getValidDayOfYear(), this.getValidDayOfYear_ValidDayOfWeekMonth(), "validDayOfYear", null, 0, -1, ValidDayOfWeekMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalGrantRuleEClass, TemporalGrantRule.class, "TemporalGrantRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalGrantRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalGrantRule_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalGrantRule_IsGrant(), theXMLTypePackage.getBoolean(), "isGrant", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalGrantRule_Role(), this.getRole(), this.getRole_ConstrainedBy(), "role", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalGrantRule_Demarcation(), this.getDemarcation(), this.getDemarcation_ConstrainedBy(), "demarcation", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalGrantRule_TemporalContext(), this.getTemporalContext(), this.getTemporalContext_TemporalGrantRules(), "temporalContext", null, 0, 1, TemporalGrantRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sacsObjectEClass, SACSObject.class, "SACSObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSACSObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, SACSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSACSObject_OP(), this.getPermission(), this.getPermission_PO(), "OP", null, 0, 1, SACSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteAccessControlSystemEClass, SiteAccessControlSystem.class, "SiteAccessControlSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSiteAccessControlSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteAccessControlSystem_AuthorizationConstraints(), this.getPolicyDependentAuthorizationConstraint(), null, "authorizationConstraints", null, 0, -1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteAccessControlSystem_AuthorizationPolicy(), this.getAuthorizationPolicy(), null, "authorizationPolicy", null, 0, 1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteAccessControlSystem_ContextContainer(), this.getContextContainer(), null, "contextContainer", null, 0, 1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteAccessControlSystem_AuthenticationPolicy(), this.getAuthenticationPolicy(), null, "authenticationPolicy", null, 0, 1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteAccessControlSystem_Topology(), this.getAccessControlSystemTopology(), null, "topology", null, 0, 1, SiteAccessControlSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityZoneEClass, SecurityZone.class, "SecurityZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityZone_Public(), theXMLTypePackage.getBoolean(), "public", null, 0, 1, SecurityZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityZone_Reachable(), this.getSecurityZone(), null, "reachable", null, 0, -1, SecurityZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityZone_ConstrainedBy(), this.getTemporalAuthenticationRule(), this.getTemporalAuthenticationRule_SecurityZone(), "constrainedBy", null, 0, -1, SecurityZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDependentAuthorizationConstraintEClass, PolicyDependentAuthorizationConstraint.class, "PolicyDependentAuthorizationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDependentAuthorizationConstraint_Name(), theXMLTypePackage.getName_(), "name", null, 0, 1, PolicyDependentAuthorizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyDependentAuthorizationConstraint_TemporalContext(), this.getTemporalContext(), this.getTemporalContext_AuthorizationConstraints(), "temporalContext", null, 0, 1, PolicyDependentAuthorizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryUserConstraintEClass, UnaryUserConstraint.class, "UnaryUserConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryUserConstraint_User(), this.getUser(), null, "user", null, 0, 1, UnaryUserConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryUserConstraintEClass, BinaryUserConstraint.class, "BinaryUserConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryUserConstraint_Left(), this.getUser(), null, "left", null, 0, 1, BinaryUserConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryUserConstraint_Right(), this.getUser(), null, "right", null, 0, 1, BinaryUserConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryRoleConstraintEClass, UnaryRoleConstraint.class, "UnaryRoleConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryRoleConstraint_Role(), this.getRole(), null, "role", null, 0, 1, UnaryRoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryRoleConstraintEClass, BinaryRoleConstraint.class, "BinaryRoleConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryRoleConstraint_Left(), this.getRole(), null, "left", null, 0, 1, BinaryRoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryRoleConstraint_Right(), this.getRole(), null, "right", null, 0, 1, BinaryRoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryDemarcationConstraintEClass, UnaryDemarcationConstraint.class, "UnaryDemarcationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryDemarcationConstraint_Demarcation(), this.getDemarcation(), null, "demarcation", null, 0, 1, UnaryDemarcationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryDemarcationConstraintEClass, BinaryDemarcationConstraint.class, "BinaryDemarcationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryDemarcationConstraint_Left(), this.getDemarcation(), null, "left", null, 0, 1, BinaryDemarcationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryDemarcationConstraint_Right(), this.getDemarcation(), null, "right", null, 0, 1, BinaryDemarcationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryPermissionConstraintEClass, UnaryPermissionConstraint.class, "UnaryPermissionConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryPermissionConstraint_Permission(), this.getPermission(), null, "permission", null, 0, 1, UnaryPermissionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryPermissionConstraintEClass, BinaryPermissionConstraint.class, "BinaryPermissionConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryPermissionConstraint_Left(), this.getPermission(), null, "left", null, 0, 1, BinaryPermissionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryPermissionConstraint_Right(), this.getPermission(), null, "right", null, 0, 1, BinaryPermissionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soDURConstraintEClass, SoDURConstraint.class, "SoDURConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soDUDConstraintEClass, SoDUDConstraint.class, "SoDUDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soDUPConstraintEClass, SoDUPConstraint.class, "SoDUPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soDRDConstraintEClass, SoDRDConstraint.class, "SoDRDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soDDPConstraintEClass, SoDDPConstraint.class, "SoDDPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationPolicyEClass, AuthorizationPolicy.class, "AuthorizationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationPolicy_Users(), this.getUser(), null, "users", null, 0, -1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationPolicy_Roles(), this.getRole(), null, "roles", null, 0, -1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationPolicy_Demarcations(), this.getDemarcation(), null, "demarcations", null, 0, -1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationPolicy_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationPolicy_TemporalGrantRules(), this.getTemporalGrantRule(), null, "temporalGrantRules", null, 0, -1, AuthorizationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteURConstraintEClass, PrerequisiteURConstraint.class, "PrerequisiteURConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prerequisiteUDConstraintEClass, PrerequisiteUDConstraint.class, "PrerequisiteUDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prerequisiteUPConstraintEClass, PrerequisiteUPConstraint.class, "PrerequisiteUPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prerequisiteRDConstraintEClass, PrerequisiteRDConstraint.class, "PrerequisiteRDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prerequisiteRPConstraintEClass, PrerequisiteRPConstraint.class, "PrerequisiteRPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prerequisiteDPConstraintEClass, PrerequisiteDPConstraint.class, "PrerequisiteDPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDURConstraintEClass, BoDURConstraint.class, "BoDURConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDUDConstraintEClass, BoDUDConstraint.class, "BoDUDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDRDConstraintEClass, BoDRDConstraint.class, "BoDRDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDUPConstraintEClass, BoDUPConstraint.class, "BoDUPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDRPConstraintEClass, BoDRPConstraint.class, "BoDRPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boDDPConstraintEClass, BoDDPConstraint.class, "BoDDPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityURConstraintEClass, CardinalityURConstraint.class, "CardinalityURConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityURConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityURConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityUDConstraintEClass, CardinalityUDConstraint.class, "CardinalityUDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityUDConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityUDConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityRDConstraintEClass, CardinalityRDConstraint.class, "CardinalityRDConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityRDConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityRDConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityUPConstraintEClass, CardinalityUPConstraint.class, "CardinalityUPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityUPConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityUPConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityRPConstraintEClass, CardinalityRPConstraint.class, "CardinalityRPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityRPConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityRPConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityDPConstraintEClass, CardinalityDPConstraint.class, "CardinalityDPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityDPConstraint_Bound(), theXMLTypePackage.getIntObject(), "bound", null, 0, 1, CardinalityDPConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextContainerEClass, ContextContainer.class, "ContextContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextContainer_TemporalContexts(), this.getTemporalContext(), null, "temporalContexts", null, 0, -1, ContextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextContainer_ValidDays(), this.getValidDay(), null, "validDays", null, 0, -1, ContextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextContainer_MyScenarios(), this.getMyScenario(), null, "myScenarios", null, 0, -1, ContextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validDayOfYearEClass, ValidDayOfYear.class, "ValidDayOfYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidDayOfYear_ValidDayOfWeekMonth(), this.getValidDayOfWeekMonth(), this.getValidDayOfWeekMonth_ValidDayOfYear(), "validDayOfWeekMonth", null, 0, 1, ValidDayOfYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationPolicyEClass, AuthenticationPolicy.class, "AuthenticationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuthenticationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticationPolicy_TemporalAuthenticationRules(), this.getTemporalAuthenticationRule(), null, "temporalAuthenticationRules", null, 0, -1, AuthenticationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalAuthenticationRuleEClass, TemporalAuthenticationRule.class, "TemporalAuthenticationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalAuthenticationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemporalAuthenticationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalAuthenticationRule_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, TemporalAuthenticationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalAuthenticationRule_Status(), ecorePackage.getEInt(), "status", null, 0, 1, TemporalAuthenticationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalAuthenticationRule_TemporalContext(), this.getTemporalContext(), this.getTemporalContext_TemporalAuthenticationRules(), "temporalContext", null, 0, 1, TemporalAuthenticationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalAuthenticationRule_SecurityZone(), this.getSecurityZone(), this.getSecurityZone_ConstrainedBy(), "securityZone", null, 0, 1, TemporalAuthenticationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myScenarioEClass, MyScenario.class, "MyScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMyScenario_TemporalContexts(), this.getTemporalContext(), this.getTemporalContext_MyScenarios(), "temporalContexts", null, 0, -1, MyScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlSystemTopologyEClass, AccessControlSystemTopology.class, "AccessControlSystemTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessControlSystemTopology_Name(), ecorePackage.getEString(), "name", null, 0, 1, AccessControlSystemTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlSystemTopology_SecurityZones(), this.getSecurityZone(), null, "securityZones", null, 0, -1, AccessControlSystemTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soDRPConstraintEClass, SoDRPConstraint.class, "SoDRPConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GRRBACPackageImpl
