/**
 */
package com.vanderhighway.grrbac.model.grrbac.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.vanderhighway.grrbac.model.grrbac.model.GRRBACFactory
 * @model kind="package"
 * @generated
 */
public interface GRRBACPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grrbac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://vanderhighway.com/grrbac/2020";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grrbac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GRRBACPackage eINSTANCE = com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UserImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>UR</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.RoleImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>RU</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RU = 0;

	/**
	 * The feature id for the '<em><b>RD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RD = 1;

	/**
	 * The feature id for the '<em><b>Juniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__JUNIORS = 2;

	/**
	 * The feature id for the '<em><b>Seniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENIORS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Constrained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSTRAINED_BY = 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl <em>Demarcation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getDemarcation()
	 * @generated
	 */
	int DEMARCATION = 2;

	/**
	 * The feature id for the '<em><b>DR</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__DR = 0;

	/**
	 * The feature id for the '<em><b>DP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__DP = 1;

	/**
	 * The feature id for the '<em><b>Subdemarcations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__SUBDEMARCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Superdemarcations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__SUPERDEMARCATIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Constrained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION__CONSTRAINED_BY = 5;

	/**
	 * The number of structural features of the '<em>Demarcation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Demarcation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMARCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>PD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = 1;

	/**
	 * The feature id for the '<em><b>PO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PO = 2;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl <em>Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__END = 1;

	/**
	 * The feature id for the '<em><b>Valid Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__VALID_DAY = 2;

	/**
	 * The feature id for the '<em><b>Valid Day Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__VALID_DAY_TIME_RANGES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl <em>Valid Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDay()
	 * @generated
	 */
	int VALID_DAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY__TIME_RANGES = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY__INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Valid Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Valid Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekImpl <em>Valid Day Of Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfWeek()
	 * @generated
	 */
	int VALID_DAY_OF_WEEK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK__NAME = VALID_DAY__NAME;

	/**
	 * The feature id for the '<em><b>Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK__TIME_RANGES = VALID_DAY__TIME_RANGES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK__INSTANCES = VALID_DAY__INSTANCES;

	/**
	 * The feature id for the '<em><b>Valid Day Of Week Month</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH = VALID_DAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valid Day Of Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_FEATURE_COUNT = VALID_DAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valid Day Of Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_OPERATION_COUNT = VALID_DAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfMonthImpl <em>Valid Day Of Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfMonthImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfMonth()
	 * @generated
	 */
	int VALID_DAY_OF_MONTH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH__NAME = VALID_DAY__NAME;

	/**
	 * The feature id for the '<em><b>Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH__TIME_RANGES = VALID_DAY__TIME_RANGES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH__INSTANCES = VALID_DAY__INSTANCES;

	/**
	 * The feature id for the '<em><b>Valid Days Of Week Month</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH = VALID_DAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valid Day Of Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH_FEATURE_COUNT = VALID_DAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valid Day Of Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_MONTH_OPERATION_COUNT = VALID_DAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl <em>Temporal Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalContext()
	 * @generated
	 */
	int TEMPORAL_CONTEXT = 8;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Temporal Grant Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES = 2;

	/**
	 * The feature id for the '<em><b>Authorization Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Temporal Authentication Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES = 4;

	/**
	 * The feature id for the '<em><b>My Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__MY_SCENARIOS = 5;

	/**
	 * The number of structural features of the '<em>Temporal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Temporal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl <em>Valid Day Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayTimeRange()
	 * @generated
	 */
	int VALID_DAY_TIME_RANGE = 9;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__START = TIME_RANGE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__END = TIME_RANGE__END;

	/**
	 * The feature id for the '<em><b>Valid Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__VALID_DAY = TIME_RANGE__VALID_DAY;

	/**
	 * The feature id for the '<em><b>Valid Day Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__VALID_DAY_TIME_RANGES = TIME_RANGE__VALID_DAY_TIME_RANGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__NAME = TIME_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES = TIME_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__NEXT = TIME_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE__PREVIOUS = TIME_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valid Day Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE_FEATURE_COUNT = TIME_RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valid Day Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_TIME_RANGE_OPERATION_COUNT = TIME_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl <em>Valid Day Of Week Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfWeekMonth()
	 * @generated
	 */
	int VALID_DAY_OF_WEEK_MONTH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__NAME = VALID_DAY__NAME;

	/**
	 * The feature id for the '<em><b>Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__TIME_RANGES = VALID_DAY__TIME_RANGES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__INSTANCES = VALID_DAY__INSTANCES;

	/**
	 * The feature id for the '<em><b>Valid Day Of Week</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK = VALID_DAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Day Of Month</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH = VALID_DAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Day Of Year</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR = VALID_DAY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valid Day Of Week Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH_FEATURE_COUNT = VALID_DAY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valid Day Of Week Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_WEEK_MONTH_OPERATION_COUNT = VALID_DAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl <em>Temporal Grant Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalGrantRule()
	 * @generated
	 */
	int TEMPORAL_GRANT_RULE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Is Grant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__IS_GRANT = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Demarcation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__DEMARCATION = 4;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Temporal Grant Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Temporal Grant Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GRANT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SACSObjectImpl <em>SACS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SACSObjectImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSACSObject()
	 * @generated
	 */
	int SACS_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACS_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>OP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACS_OBJECT__OP = 1;

	/**
	 * The number of structural features of the '<em>SACS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACS_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SACS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACS_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl <em>Site Access Control System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSiteAccessControlSystem()
	 * @generated
	 */
	int SITE_ACCESS_CONTROL_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Authorization Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Authorization Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Context Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Authentication Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY = 5;

	/**
	 * The number of structural features of the '<em>Site Access Control System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Site Access Control System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ACCESS_CONTROL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSecurityZone()
	 * @generated
	 */
	int SECURITY_ZONE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__NAME = SACS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>OP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__OP = SACS_OBJECT__OP;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__PUBLIC = SACS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__REACHABLE = SACS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__CONSTRAINED_BY = SACS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE_FEATURE_COUNT = SACS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE_OPERATION_COUNT = SACS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl <em>Policy Dependent Authorization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPolicyDependentAuthorizationConstraint()
	 * @generated
	 */
	int POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Policy Dependent Authorization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Dependent Authorization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryUserConstraintImpl <em>Unary User Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryUserConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryUserConstraint()
	 * @generated
	 */
	int UNARY_USER_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_USER_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_USER_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_USER_CONSTRAINT__USER = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary User Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_USER_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary User Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_USER_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryUserConstraintImpl <em>Binary User Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryUserConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryUserConstraint()
	 * @generated
	 */
	int BINARY_USER_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT__LEFT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT__RIGHT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary User Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary User Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_USER_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryRoleConstraintImpl <em>Unary Role Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryRoleConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryRoleConstraint()
	 * @generated
	 */
	int UNARY_ROLE_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ROLE_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ROLE_CONSTRAINT__ROLE = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ROLE_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ROLE_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryRoleConstraintImpl <em>Binary Role Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryRoleConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryRoleConstraint()
	 * @generated
	 */
	int BINARY_ROLE_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT__LEFT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT__RIGHT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ROLE_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryDemarcationConstraintImpl <em>Unary Demarcation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryDemarcationConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryDemarcationConstraint()
	 * @generated
	 */
	int UNARY_DEMARCATION_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEMARCATION_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Demarcation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEMARCATION_CONSTRAINT__DEMARCATION = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Demarcation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Demarcation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryDemarcationConstraintImpl <em>Binary Demarcation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryDemarcationConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryDemarcationConstraint()
	 * @generated
	 */
	int BINARY_DEMARCATION_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT__LEFT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT__RIGHT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Demarcation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Demarcation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryPermissionConstraintImpl <em>Unary Permission Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryPermissionConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryPermissionConstraint()
	 * @generated
	 */
	int UNARY_PERMISSION_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PERMISSION_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PERMISSION_CONSTRAINT__PERMISSION = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Permission Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Permission Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PERMISSION_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryPermissionConstraintImpl <em>Binary Permission Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryPermissionConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryPermissionConstraint()
	 * @generated
	 */
	int BINARY_PERMISSION_CONSTRAINT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT__NAME = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT__LEFT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT__RIGHT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Permission Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Permission Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT = POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDURConstraintImpl <em>So DUR Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDURConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDURConstraint()
	 * @generated
	 */
	int SO_DUR_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT__NAME = BINARY_ROLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT__LEFT = BINARY_ROLE_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT__RIGHT = BINARY_ROLE_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DUR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT_FEATURE_COUNT = BINARY_ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DUR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUR_CONSTRAINT_OPERATION_COUNT = BINARY_ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUDConstraintImpl <em>So DUD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDUDConstraint()
	 * @generated
	 */
	int SO_DUD_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DUD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DUD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUPConstraintImpl <em>So DUP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDUPConstraint()
	 * @generated
	 */
	int SO_DUP_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DUP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DUP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DUP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRDConstraintImpl <em>So DRD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDRDConstraint()
	 * @generated
	 */
	int SO_DRD_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DRD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DRD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDDPConstraintImpl <em>So DDP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDDPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDDPConstraint()
	 * @generated
	 */
	int SO_DDP_CONSTRAINT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DDP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DDP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DDP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAuthorizationPolicy()
	 * @generated
	 */
	int AUTHORIZATION_POLICY = 29;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__USERS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Demarcations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__DEMARCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__PERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__NAME = 4;

	/**
	 * The feature id for the '<em><b>Temporal Grant Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES = 5;

	/**
	 * The number of structural features of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteURConstraintImpl <em>Prerequisite UR Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteURConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteURConstraint()
	 * @generated
	 */
	int PREREQUISITE_UR_CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT__NAME = BINARY_ROLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT__LEFT = BINARY_ROLE_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT__RIGHT = BINARY_ROLE_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite UR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT_FEATURE_COUNT = BINARY_ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite UR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UR_CONSTRAINT_OPERATION_COUNT = BINARY_ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUDConstraintImpl <em>Prerequisite UD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteUDConstraint()
	 * @generated
	 */
	int PREREQUISITE_UD_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite UD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite UD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUPConstraintImpl <em>Prerequisite UP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteUPConstraint()
	 * @generated
	 */
	int PREREQUISITE_UP_CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite UP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite UP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_UP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRDConstraintImpl <em>Prerequisite RD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteRDConstraint()
	 * @generated
	 */
	int PREREQUISITE_RD_CONSTRAINT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite RD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite RD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRPConstraintImpl <em>Prerequisite RP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteRPConstraint()
	 * @generated
	 */
	int PREREQUISITE_RP_CONSTRAINT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite RP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite RP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_RP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteDPConstraintImpl <em>Prerequisite DP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteDPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteDPConstraint()
	 * @generated
	 */
	int PREREQUISITE_DP_CONSTRAINT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Prerequisite DP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prerequisite DP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_DP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDURConstraintImpl <em>Bo DUR Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDURConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDURConstraint()
	 * @generated
	 */
	int BO_DUR_CONSTRAINT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT__NAME = BINARY_ROLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT__LEFT = BINARY_ROLE_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT__RIGHT = BINARY_ROLE_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DUR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT_FEATURE_COUNT = BINARY_ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DUR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUR_CONSTRAINT_OPERATION_COUNT = BINARY_ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUDConstraintImpl <em>Bo DUD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDUDConstraint()
	 * @generated
	 */
	int BO_DUD_CONSTRAINT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DUD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DUD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRDConstraintImpl <em>Bo DRD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDRDConstraint()
	 * @generated
	 */
	int BO_DRD_CONSTRAINT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT__NAME = BINARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT__LEFT = BINARY_DEMARCATION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT__RIGHT = BINARY_DEMARCATION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DRD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT_FEATURE_COUNT = BINARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DRD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRD_CONSTRAINT_OPERATION_COUNT = BINARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUPConstraintImpl <em>Bo DUP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDUPConstraint()
	 * @generated
	 */
	int BO_DUP_CONSTRAINT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DUP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DUP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DUP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRPConstraintImpl <em>Bo DRP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDRPConstraint()
	 * @generated
	 */
	int BO_DRP_CONSTRAINT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DRP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DRP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DRP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDDPConstraintImpl <em>Bo DDP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDDPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDDPConstraint()
	 * @generated
	 */
	int BO_DDP_CONSTRAINT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Bo DDP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bo DDP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_DDP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityURConstraintImpl <em>Cardinality UR Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityURConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityURConstraint()
	 * @generated
	 */
	int CARDINALITY_UR_CONSTRAINT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT__NAME = UNARY_ROLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_ROLE_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT__ROLE = UNARY_ROLE_CONSTRAINT__ROLE;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT__BOUND = UNARY_ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality UR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT_FEATURE_COUNT = UNARY_ROLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality UR Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UR_CONSTRAINT_OPERATION_COUNT = UNARY_ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUDConstraintImpl <em>Cardinality UD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityUDConstraint()
	 * @generated
	 */
	int CARDINALITY_UD_CONSTRAINT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT__NAME = UNARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Demarcation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT__DEMARCATION = UNARY_DEMARCATION_CONSTRAINT__DEMARCATION;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT__BOUND = UNARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality UD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT_FEATURE_COUNT = UNARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality UD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UD_CONSTRAINT_OPERATION_COUNT = UNARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRDConstraintImpl <em>Cardinality RD Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRDConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityRDConstraint()
	 * @generated
	 */
	int CARDINALITY_RD_CONSTRAINT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT__NAME = UNARY_DEMARCATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_DEMARCATION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Demarcation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT__DEMARCATION = UNARY_DEMARCATION_CONSTRAINT__DEMARCATION;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT__BOUND = UNARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality RD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT_FEATURE_COUNT = UNARY_DEMARCATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality RD Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RD_CONSTRAINT_OPERATION_COUNT = UNARY_DEMARCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUPConstraintImpl <em>Cardinality UP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityUPConstraint()
	 * @generated
	 */
	int CARDINALITY_UP_CONSTRAINT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT__NAME = UNARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT__PERMISSION = UNARY_PERMISSION_CONSTRAINT__PERMISSION;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT__BOUND = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality UP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT_FEATURE_COUNT = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality UP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_UP_CONSTRAINT_OPERATION_COUNT = UNARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRPConstraintImpl <em>Cardinality RP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityRPConstraint()
	 * @generated
	 */
	int CARDINALITY_RP_CONSTRAINT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT__NAME = UNARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT__PERMISSION = UNARY_PERMISSION_CONSTRAINT__PERMISSION;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT__BOUND = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality RP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT_FEATURE_COUNT = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality RP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RP_CONSTRAINT_OPERATION_COUNT = UNARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityDPConstraintImpl <em>Cardinality DP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityDPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityDPConstraint()
	 * @generated
	 */
	int CARDINALITY_DP_CONSTRAINT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT__NAME = UNARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT__TEMPORAL_CONTEXT = UNARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT__PERMISSION = UNARY_PERMISSION_CONSTRAINT__PERMISSION;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT__BOUND = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality DP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT_FEATURE_COUNT = UNARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality DP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_DP_CONSTRAINT_OPERATION_COUNT = UNARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl <em>Context Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getContextContainer()
	 * @generated
	 */
	int CONTEXT_CONTAINER = 48;

	/**
	 * The feature id for the '<em><b>Temporal Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER__TEMPORAL_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Valid Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER__VALID_DAYS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER__NAME = 2;

	/**
	 * The feature id for the '<em><b>My Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER__MY_SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Context Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Context Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfYearImpl <em>Valid Day Of Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfYearImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfYear()
	 * @generated
	 */
	int VALID_DAY_OF_YEAR = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR__NAME = VALID_DAY__NAME;

	/**
	 * The feature id for the '<em><b>Time Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR__TIME_RANGES = VALID_DAY__TIME_RANGES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR__INSTANCES = VALID_DAY__INSTANCES;

	/**
	 * The feature id for the '<em><b>Valid Day Of Week Month</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH = VALID_DAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valid Day Of Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR_FEATURE_COUNT = VALID_DAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valid Day Of Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_DAY_OF_YEAR_OPERATION_COUNT = VALID_DAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl <em>Authentication Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAuthenticationPolicy()
	 * @generated
	 */
	int AUTHENTICATION_POLICY = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Temporal Authentication Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES = 1;

	/**
	 * The number of structural features of the '<em>Authentication Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authentication Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl <em>Temporal Authentication Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalAuthenticationRule()
	 * @generated
	 */
	int TEMPORAL_AUTHENTICATION_RULE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Security Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE = 4;

	/**
	 * The number of structural features of the '<em>Temporal Authentication Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Temporal Authentication Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_AUTHENTICATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.MyScenarioImpl <em>My Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.MyScenarioImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getMyScenario()
	 * @generated
	 */
	int MY_SCENARIO = 52;

	/**
	 * The feature id for the '<em><b>Temporal Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SCENARIO__TEMPORAL_CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>My Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SCENARIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>My Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AccessControlSystemTopologyImpl <em>Access Control System Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AccessControlSystemTopologyImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAccessControlSystemTopology()
	 * @generated
	 */
	int ACCESS_CONTROL_SYSTEM_TOPOLOGY = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_SYSTEM_TOPOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Security Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_SYSTEM_TOPOLOGY__SECURITY_ZONES = 1;

	/**
	 * The number of structural features of the '<em>Access Control System Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_SYSTEM_TOPOLOGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access Control System Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_SYSTEM_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRPConstraintImpl <em>So DRP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRPConstraintImpl
	 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDRPConstraint()
	 * @generated
	 */
	int SO_DRP_CONSTRAINT = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT__NAME = BINARY_PERMISSION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT__TEMPORAL_CONTEXT = BINARY_PERMISSION_CONSTRAINT__TEMPORAL_CONTEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT__LEFT = BINARY_PERMISSION_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT__RIGHT = BINARY_PERMISSION_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>So DRP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT_FEATURE_COUNT = BINARY_PERMISSION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So DRP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_DRP_CONSTRAINT_OPERATION_COUNT = BINARY_PERMISSION_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.User#getUR <em>UR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UR</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.User#getUR()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UR();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRU <em>RU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RU</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getRU()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RU();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getRD <em>RD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RD</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getRD()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RD();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Juniors</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getJuniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Juniors();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seniors</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getSeniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Seniors();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Role#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained By</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Role#getConstrainedBy()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ConstrainedBy();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demarcation</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation
	 * @generated
	 */
	EClass getDemarcation();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDR <em>DR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DR</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDR()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_DR();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDP <em>DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DP</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getDP()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_DP();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSubdemarcations <em>Subdemarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subdemarcations</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSubdemarcations()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_Subdemarcations();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSuperdemarcations <em>Superdemarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superdemarcations</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getSuperdemarcations()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_Superdemarcations();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getName()
	 * @see #getDemarcation()
	 * @generated
	 */
	EAttribute getDemarcation_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained By</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Demarcation#getConstrainedBy()
	 * @see #getDemarcation()
	 * @generated
	 */
	EReference getDemarcation_ConstrainedBy();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPD <em>PD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PD</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission#getPD()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PD();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Name();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.Permission#getPO <em>PO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PO</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.Permission#getPO()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PO();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Range</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange
	 * @generated
	 */
	EClass getTimeRange();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getStart()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getEnd()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_End();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDay <em>Valid Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Day</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDay()
	 * @see #getTimeRange()
	 * @generated
	 */
	EReference getTimeRange_ValidDay();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDayTimeRanges <em>Valid Day Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Day Time Ranges</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getValidDayTimeRanges()
	 * @see #getTimeRange()
	 * @generated
	 */
	EReference getTimeRange_ValidDayTimeRanges();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TimeRange#getName()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Name();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay <em>Valid Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay
	 * @generated
	 */
	EClass getValidDay();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getName()
	 * @see #getValidDay()
	 * @generated
	 */
	EAttribute getValidDay_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getTimeRanges <em>Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Ranges</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getTimeRanges()
	 * @see #getValidDay()
	 * @generated
	 */
	EReference getValidDay_TimeRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDay#getInstances()
	 * @see #getValidDay()
	 * @generated
	 */
	EReference getValidDay_Instances();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek <em>Valid Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day Of Week</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek
	 * @generated
	 */
	EClass getValidDayOfWeek();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Day Of Week Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek#getValidDayOfWeekMonth()
	 * @see #getValidDayOfWeek()
	 * @generated
	 */
	EReference getValidDayOfWeek_ValidDayOfWeekMonth();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth <em>Valid Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day Of Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth
	 * @generated
	 */
	EClass getValidDayOfMonth();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth#getValidDaysOfWeekMonth <em>Valid Days Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Days Of Week Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth#getValidDaysOfWeekMonth()
	 * @see #getValidDayOfMonth()
	 * @generated
	 */
	EReference getValidDayOfMonth_ValidDaysOfWeekMonth();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Context</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext
	 * @generated
	 */
	EClass getTemporalContext();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getInstances()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_Instances();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getName()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EAttribute getTemporalContext_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalGrantRules <em>Temporal Grant Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Grant Rules</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalGrantRules()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_TemporalGrantRules();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getAuthorizationConstraints <em>Authorization Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authorization Constraints</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getAuthorizationConstraints()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_AuthorizationConstraints();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Authentication Rules</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getTemporalAuthenticationRules()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_TemporalAuthenticationRules();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getMyScenarios <em>My Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Scenarios</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalContext#getMyScenarios()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_MyScenarios();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange <em>Valid Day Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day Time Range</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange
	 * @generated
	 */
	EClass getValidDayTimeRange();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getTemporalContextTimeRanges <em>Temporal Context Time Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Context Time Ranges</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getTemporalContextTimeRanges()
	 * @see #getValidDayTimeRange()
	 * @generated
	 */
	EReference getValidDayTimeRange_TemporalContextTimeRanges();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getNext()
	 * @see #getValidDayTimeRange()
	 * @generated
	 */
	EReference getValidDayTimeRange_Next();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayTimeRange#getPrevious()
	 * @see #getValidDayTimeRange()
	 * @generated
	 */
	EReference getValidDayTimeRange_Previous();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day Of Week Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth
	 * @generated
	 */
	EClass getValidDayOfWeekMonth();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek <em>Valid Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Day Of Week</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfWeek()
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 */
	EReference getValidDayOfWeekMonth_ValidDayOfWeek();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth <em>Valid Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Day Of Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfMonth()
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 */
	EReference getValidDayOfWeekMonth_ValidDayOfMonth();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfYear <em>Valid Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Day Of Year</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth#getValidDayOfYear()
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 */
	EReference getValidDayOfWeekMonth_ValidDayOfYear();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule <em>Temporal Grant Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Grant Rule</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule
	 * @generated
	 */
	EClass getTemporalGrantRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getName()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EAttribute getTemporalGrantRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getPriority()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EAttribute getTemporalGrantRule_Priority();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#isIsGrant <em>Is Grant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Grant</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#isIsGrant()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EAttribute getTemporalGrantRule_IsGrant();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getRole()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EReference getTemporalGrantRule_Role();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demarcation</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getDemarcation()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EReference getTemporalGrantRule_Demarcation();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporal Context</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule#getTemporalContext()
	 * @see #getTemporalGrantRule()
	 * @generated
	 */
	EReference getTemporalGrantRule_TemporalContext();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SACSObject <em>SACS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SACS Object</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SACSObject
	 * @generated
	 */
	EClass getSACSObject();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getName()
	 * @see #getSACSObject()
	 * @generated
	 */
	EAttribute getSACSObject_Name();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getOP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OP</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SACSObject#getOP()
	 * @see #getSACSObject()
	 * @generated
	 */
	EReference getSACSObject_OP();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem <em>Site Access Control System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Access Control System</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem
	 * @generated
	 */
	EClass getSiteAccessControlSystem();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getName()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EAttribute getSiteAccessControlSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationConstraints <em>Authorization Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization Constraints</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationConstraints()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EReference getSiteAccessControlSystem_AuthorizationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization Policy</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthorizationPolicy()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EReference getSiteAccessControlSystem_AuthorizationPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getContextContainer <em>Context Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Container</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getContextContainer()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EReference getSiteAccessControlSystem_ContextContainer();

	/**
	 * Returns the meta object for the containment reference '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthenticationPolicy <em>Authentication Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication Policy</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getAuthenticationPolicy()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EReference getSiteAccessControlSystem_AuthenticationPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem#getTopology()
	 * @see #getSiteAccessControlSystem()
	 * @generated
	 */
	EReference getSiteAccessControlSystem_Topology();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Zone</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone
	 * @generated
	 */
	EClass getSecurityZone();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#isPublic()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EAttribute getSecurityZone_Public();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getReachable()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_Reachable();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained By</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SecurityZone#getConstrainedBy()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_ConstrainedBy();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint <em>Policy Dependent Authorization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Dependent Authorization Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint
	 * @generated
	 */
	EClass getPolicyDependentAuthorizationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getName()
	 * @see #getPolicyDependentAuthorizationConstraint()
	 * @generated
	 */
	EAttribute getPolicyDependentAuthorizationConstraint_Name();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporal Context</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint#getTemporalContext()
	 * @see #getPolicyDependentAuthorizationConstraint()
	 * @generated
	 */
	EReference getPolicyDependentAuthorizationConstraint_TemporalContext();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint <em>Unary User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary User Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint
	 * @generated
	 */
	EClass getUnaryUserConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryUserConstraint#getUser()
	 * @see #getUnaryUserConstraint()
	 * @generated
	 */
	EReference getUnaryUserConstraint_User();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint <em>Binary User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary User Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint
	 * @generated
	 */
	EClass getBinaryUserConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getLeft()
	 * @see #getBinaryUserConstraint()
	 * @generated
	 */
	EReference getBinaryUserConstraint_Left();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryUserConstraint#getRight()
	 * @see #getBinaryUserConstraint()
	 * @generated
	 */
	EReference getBinaryUserConstraint_Right();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint <em>Unary Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Role Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint
	 * @generated
	 */
	EClass getUnaryRoleConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryRoleConstraint#getRole()
	 * @see #getUnaryRoleConstraint()
	 * @generated
	 */
	EReference getUnaryRoleConstraint_Role();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint <em>Binary Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Role Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint
	 * @generated
	 */
	EClass getBinaryRoleConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getLeft()
	 * @see #getBinaryRoleConstraint()
	 * @generated
	 */
	EReference getBinaryRoleConstraint_Left();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryRoleConstraint#getRight()
	 * @see #getBinaryRoleConstraint()
	 * @generated
	 */
	EReference getBinaryRoleConstraint_Right();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint <em>Unary Demarcation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Demarcation Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint
	 * @generated
	 */
	EClass getUnaryDemarcationConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint#getDemarcation <em>Demarcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demarcation</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint#getDemarcation()
	 * @see #getUnaryDemarcationConstraint()
	 * @generated
	 */
	EReference getUnaryDemarcationConstraint_Demarcation();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint <em>Binary Demarcation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Demarcation Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint
	 * @generated
	 */
	EClass getBinaryDemarcationConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getLeft()
	 * @see #getBinaryDemarcationConstraint()
	 * @generated
	 */
	EReference getBinaryDemarcationConstraint_Left();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryDemarcationConstraint#getRight()
	 * @see #getBinaryDemarcationConstraint()
	 * @generated
	 */
	EReference getBinaryDemarcationConstraint_Right();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint <em>Unary Permission Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Permission Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint
	 * @generated
	 */
	EClass getUnaryPermissionConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Permission</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.UnaryPermissionConstraint#getPermission()
	 * @see #getUnaryPermissionConstraint()
	 * @generated
	 */
	EReference getUnaryPermissionConstraint_Permission();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint <em>Binary Permission Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Permission Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint
	 * @generated
	 */
	EClass getBinaryPermissionConstraint();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getLeft()
	 * @see #getBinaryPermissionConstraint()
	 * @generated
	 */
	EReference getBinaryPermissionConstraint_Left();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BinaryPermissionConstraint#getRight()
	 * @see #getBinaryPermissionConstraint()
	 * @generated
	 */
	EReference getBinaryPermissionConstraint_Right();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDURConstraint <em>So DUR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DUR Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDURConstraint
	 * @generated
	 */
	EClass getSoDURConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDUDConstraint <em>So DUD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DUD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDUDConstraint
	 * @generated
	 */
	EClass getSoDUDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDUPConstraint <em>So DUP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DUP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDUPConstraint
	 * @generated
	 */
	EClass getSoDUPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDRDConstraint <em>So DRD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DRD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDRDConstraint
	 * @generated
	 */
	EClass getSoDRDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDDPConstraint <em>So DDP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DDP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDDPConstraint
	 * @generated
	 */
	EClass getSoDDPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Policy</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy
	 * @generated
	 */
	EClass getAuthorizationPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getUsers()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EReference getAuthorizationPolicy_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getRoles()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EReference getAuthorizationPolicy_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getDemarcations <em>Demarcations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demarcations</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getDemarcations()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EReference getAuthorizationPolicy_Demarcations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getPermissions()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EReference getAuthorizationPolicy_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getName()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EAttribute getAuthorizationPolicy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getTemporalGrantRules <em>Temporal Grant Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Grant Rules</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy#getTemporalGrantRules()
	 * @see #getAuthorizationPolicy()
	 * @generated
	 */
	EReference getAuthorizationPolicy_TemporalGrantRules();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteURConstraint <em>Prerequisite UR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite UR Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteURConstraint
	 * @generated
	 */
	EClass getPrerequisiteURConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUDConstraint <em>Prerequisite UD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite UD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUDConstraint
	 * @generated
	 */
	EClass getPrerequisiteUDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUPConstraint <em>Prerequisite UP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite UP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteUPConstraint
	 * @generated
	 */
	EClass getPrerequisiteUPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRDConstraint <em>Prerequisite RD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite RD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRDConstraint
	 * @generated
	 */
	EClass getPrerequisiteRDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRPConstraint <em>Prerequisite RP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite RP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteRPConstraint
	 * @generated
	 */
	EClass getPrerequisiteRPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteDPConstraint <em>Prerequisite DP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite DP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.PrerequisiteDPConstraint
	 * @generated
	 */
	EClass getPrerequisiteDPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDURConstraint <em>Bo DUR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DUR Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDURConstraint
	 * @generated
	 */
	EClass getBoDURConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDUDConstraint <em>Bo DUD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DUD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDUDConstraint
	 * @generated
	 */
	EClass getBoDUDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDRDConstraint <em>Bo DRD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DRD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDRDConstraint
	 * @generated
	 */
	EClass getBoDRDConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDUPConstraint <em>Bo DUP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DUP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDUPConstraint
	 * @generated
	 */
	EClass getBoDUPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDRPConstraint <em>Bo DRP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DRP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDRPConstraint
	 * @generated
	 */
	EClass getBoDRPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.BoDDPConstraint <em>Bo DDP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo DDP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.BoDDPConstraint
	 * @generated
	 */
	EClass getBoDDPConstraint();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint <em>Cardinality UR Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality UR Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint
	 * @generated
	 */
	EClass getCardinalityURConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityURConstraint#getBound()
	 * @see #getCardinalityURConstraint()
	 * @generated
	 */
	EAttribute getCardinalityURConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint <em>Cardinality UD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality UD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint
	 * @generated
	 */
	EClass getCardinalityUDConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUDConstraint#getBound()
	 * @see #getCardinalityUDConstraint()
	 * @generated
	 */
	EAttribute getCardinalityUDConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint <em>Cardinality RD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality RD Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint
	 * @generated
	 */
	EClass getCardinalityRDConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRDConstraint#getBound()
	 * @see #getCardinalityRDConstraint()
	 * @generated
	 */
	EAttribute getCardinalityRDConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint <em>Cardinality UP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality UP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint
	 * @generated
	 */
	EClass getCardinalityUPConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityUPConstraint#getBound()
	 * @see #getCardinalityUPConstraint()
	 * @generated
	 */
	EAttribute getCardinalityUPConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint <em>Cardinality RP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality RP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint
	 * @generated
	 */
	EClass getCardinalityRPConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityRPConstraint#getBound()
	 * @see #getCardinalityRPConstraint()
	 * @generated
	 */
	EAttribute getCardinalityRPConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint <em>Cardinality DP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality DP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint
	 * @generated
	 */
	EClass getCardinalityDPConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.CardinalityDPConstraint#getBound()
	 * @see #getCardinalityDPConstraint()
	 * @generated
	 */
	EAttribute getCardinalityDPConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer <em>Context Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Container</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer
	 * @generated
	 */
	EClass getContextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getTemporalContexts <em>Temporal Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Contexts</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getTemporalContexts()
	 * @see #getContextContainer()
	 * @generated
	 */
	EReference getContextContainer_TemporalContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getValidDays <em>Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valid Days</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getValidDays()
	 * @see #getContextContainer()
	 * @generated
	 */
	EReference getContextContainer_ValidDays();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getName()
	 * @see #getContextContainer()
	 * @generated
	 */
	EAttribute getContextContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getMyScenarios <em>My Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Scenarios</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ContextContainer#getMyScenarios()
	 * @see #getContextContainer()
	 * @generated
	 */
	EReference getContextContainer_MyScenarios();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear <em>Valid Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Day Of Year</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear
	 * @generated
	 */
	EClass getValidDayOfYear();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Day Of Week Month</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfYear#getValidDayOfWeekMonth()
	 * @see #getValidDayOfYear()
	 * @generated
	 */
	EReference getValidDayOfYear_ValidDayOfWeekMonth();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy <em>Authentication Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Policy</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy
	 * @generated
	 */
	EClass getAuthenticationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getName()
	 * @see #getAuthenticationPolicy()
	 * @generated
	 */
	EAttribute getAuthenticationPolicy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Authentication Rules</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy#getTemporalAuthenticationRules()
	 * @see #getAuthenticationPolicy()
	 * @generated
	 */
	EReference getAuthenticationPolicy_TemporalAuthenticationRules();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule <em>Temporal Authentication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Authentication Rule</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule
	 * @generated
	 */
	EClass getTemporalAuthenticationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getName()
	 * @see #getTemporalAuthenticationRule()
	 * @generated
	 */
	EAttribute getTemporalAuthenticationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getPriority()
	 * @see #getTemporalAuthenticationRule()
	 * @generated
	 */
	EAttribute getTemporalAuthenticationRule_Priority();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getStatus()
	 * @see #getTemporalAuthenticationRule()
	 * @generated
	 */
	EAttribute getTemporalAuthenticationRule_Status();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporal Context</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getTemporalContext()
	 * @see #getTemporalAuthenticationRule()
	 * @generated
	 */
	EReference getTemporalAuthenticationRule_TemporalContext();

	/**
	 * Returns the meta object for the reference '{@link com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Zone</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule#getSecurityZone()
	 * @see #getTemporalAuthenticationRule()
	 * @generated
	 */
	EReference getTemporalAuthenticationRule_SecurityZone();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario <em>My Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Scenario</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.MyScenario
	 * @generated
	 */
	EClass getMyScenario();

	/**
	 * Returns the meta object for the reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.MyScenario#getTemporalContexts <em>Temporal Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Contexts</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.MyScenario#getTemporalContexts()
	 * @see #getMyScenario()
	 * @generated
	 */
	EReference getMyScenario_TemporalContexts();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology <em>Access Control System Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control System Topology</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology
	 * @generated
	 */
	EClass getAccessControlSystemTopology();

	/**
	 * Returns the meta object for the attribute '{@link com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology#getName()
	 * @see #getAccessControlSystemTopology()
	 * @generated
	 */
	EAttribute getAccessControlSystemTopology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology#getSecurityZones <em>Security Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Zones</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology#getSecurityZones()
	 * @see #getAccessControlSystemTopology()
	 * @generated
	 */
	EReference getAccessControlSystemTopology_SecurityZones();

	/**
	 * Returns the meta object for class '{@link com.vanderhighway.grrbac.model.grrbac.model.SoDRPConstraint <em>So DRP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So DRP Constraint</em>'.
	 * @see com.vanderhighway.grrbac.model.grrbac.model.SoDRPConstraint
	 * @generated
	 */
	EClass getSoDRPConstraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GRRBACFactory getGRRBACFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UserImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>UR</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__UR = eINSTANCE.getUser_UR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.RoleImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>RU</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RU = eINSTANCE.getRole_RU();

		/**
		 * The meta object literal for the '<em><b>RD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RD = eINSTANCE.getRole_RD();

		/**
		 * The meta object literal for the '<em><b>Juniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__JUNIORS = eINSTANCE.getRole_Juniors();

		/**
		 * The meta object literal for the '<em><b>Seniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SENIORS = eINSTANCE.getRole_Seniors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Constrained By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONSTRAINED_BY = eINSTANCE.getRole_ConstrainedBy();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl <em>Demarcation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getDemarcation()
		 * @generated
		 */
		EClass DEMARCATION = eINSTANCE.getDemarcation();

		/**
		 * The meta object literal for the '<em><b>DR</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__DR = eINSTANCE.getDemarcation_DR();

		/**
		 * The meta object literal for the '<em><b>DP</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__DP = eINSTANCE.getDemarcation_DP();

		/**
		 * The meta object literal for the '<em><b>Subdemarcations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__SUBDEMARCATIONS = eINSTANCE.getDemarcation_Subdemarcations();

		/**
		 * The meta object literal for the '<em><b>Superdemarcations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__SUPERDEMARCATIONS = eINSTANCE.getDemarcation_Superdemarcations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMARCATION__NAME = eINSTANCE.getDemarcation_Name();

		/**
		 * The meta object literal for the '<em><b>Constrained By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMARCATION__CONSTRAINED_BY = eINSTANCE.getDemarcation_ConstrainedBy();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PermissionImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>PD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PD = eINSTANCE.getPermission_PD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '<em><b>PO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PO = eINSTANCE.getPermission_PO();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl <em>Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TimeRangeImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTimeRange()
		 * @generated
		 */
		EClass TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__START = eINSTANCE.getTimeRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__END = eINSTANCE.getTimeRange_End();

		/**
		 * The meta object literal for the '<em><b>Valid Day</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_RANGE__VALID_DAY = eINSTANCE.getTimeRange_ValidDay();

		/**
		 * The meta object literal for the '<em><b>Valid Day Time Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_RANGE__VALID_DAY_TIME_RANGES = eINSTANCE.getTimeRange_ValidDayTimeRanges();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__NAME = eINSTANCE.getTimeRange_Name();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl <em>Valid Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDay()
		 * @generated
		 */
		EClass VALID_DAY = eINSTANCE.getValidDay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_DAY__NAME = eINSTANCE.getValidDay_Name();

		/**
		 * The meta object literal for the '<em><b>Time Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY__TIME_RANGES = eINSTANCE.getValidDay_TimeRanges();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY__INSTANCES = eINSTANCE.getValidDay_Instances();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekImpl <em>Valid Day Of Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfWeek()
		 * @generated
		 */
		EClass VALID_DAY_OF_WEEK = eINSTANCE.getValidDayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Valid Day Of Week Month</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH = eINSTANCE.getValidDayOfWeek_ValidDayOfWeekMonth();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfMonthImpl <em>Valid Day Of Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfMonthImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfMonth()
		 * @generated
		 */
		EClass VALID_DAY_OF_MONTH = eINSTANCE.getValidDayOfMonth();

		/**
		 * The meta object literal for the '<em><b>Valid Days Of Week Month</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH = eINSTANCE.getValidDayOfMonth_ValidDaysOfWeekMonth();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl <em>Temporal Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalContext()
		 * @generated
		 */
		EClass TEMPORAL_CONTEXT = eINSTANCE.getTemporalContext();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__INSTANCES = eINSTANCE.getTemporalContext_Instances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_CONTEXT__NAME = eINSTANCE.getTemporalContext_Name();

		/**
		 * The meta object literal for the '<em><b>Temporal Grant Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES = eINSTANCE.getTemporalContext_TemporalGrantRules();

		/**
		 * The meta object literal for the '<em><b>Authorization Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS = eINSTANCE.getTemporalContext_AuthorizationConstraints();

		/**
		 * The meta object literal for the '<em><b>Temporal Authentication Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES = eINSTANCE.getTemporalContext_TemporalAuthenticationRules();

		/**
		 * The meta object literal for the '<em><b>My Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__MY_SCENARIOS = eINSTANCE.getTemporalContext_MyScenarios();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl <em>Valid Day Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayTimeRangeImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayTimeRange()
		 * @generated
		 */
		EClass VALID_DAY_TIME_RANGE = eINSTANCE.getValidDayTimeRange();

		/**
		 * The meta object literal for the '<em><b>Temporal Context Time Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_TIME_RANGE__TEMPORAL_CONTEXT_TIME_RANGES = eINSTANCE.getValidDayTimeRange_TemporalContextTimeRanges();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_TIME_RANGE__NEXT = eINSTANCE.getValidDayTimeRange_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_TIME_RANGE__PREVIOUS = eINSTANCE.getValidDayTimeRange_Previous();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl <em>Valid Day Of Week Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekMonthImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfWeekMonth()
		 * @generated
		 */
		EClass VALID_DAY_OF_WEEK_MONTH = eINSTANCE.getValidDayOfWeekMonth();

		/**
		 * The meta object literal for the '<em><b>Valid Day Of Week</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK = eINSTANCE.getValidDayOfWeekMonth_ValidDayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Valid Day Of Month</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH = eINSTANCE.getValidDayOfWeekMonth_ValidDayOfMonth();

		/**
		 * The meta object literal for the '<em><b>Valid Day Of Year</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_YEAR = eINSTANCE.getValidDayOfWeekMonth_ValidDayOfYear();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl <em>Temporal Grant Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalGrantRule()
		 * @generated
		 */
		EClass TEMPORAL_GRANT_RULE = eINSTANCE.getTemporalGrantRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GRANT_RULE__NAME = eINSTANCE.getTemporalGrantRule_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GRANT_RULE__PRIORITY = eINSTANCE.getTemporalGrantRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Is Grant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GRANT_RULE__IS_GRANT = eINSTANCE.getTemporalGrantRule_IsGrant();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GRANT_RULE__ROLE = eINSTANCE.getTemporalGrantRule_Role();

		/**
		 * The meta object literal for the '<em><b>Demarcation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GRANT_RULE__DEMARCATION = eINSTANCE.getTemporalGrantRule_Demarcation();

		/**
		 * The meta object literal for the '<em><b>Temporal Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT = eINSTANCE.getTemporalGrantRule_TemporalContext();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SACSObjectImpl <em>SACS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SACSObjectImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSACSObject()
		 * @generated
		 */
		EClass SACS_OBJECT = eINSTANCE.getSACSObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SACS_OBJECT__NAME = eINSTANCE.getSACSObject_Name();

		/**
		 * The meta object literal for the '<em><b>OP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SACS_OBJECT__OP = eINSTANCE.getSACSObject_OP();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl <em>Site Access Control System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSiteAccessControlSystem()
		 * @generated
		 */
		EClass SITE_ACCESS_CONTROL_SYSTEM = eINSTANCE.getSiteAccessControlSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_ACCESS_CONTROL_SYSTEM__NAME = eINSTANCE.getSiteAccessControlSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Authorization Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS = eINSTANCE.getSiteAccessControlSystem_AuthorizationConstraints();

		/**
		 * The meta object literal for the '<em><b>Authorization Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY = eINSTANCE.getSiteAccessControlSystem_AuthorizationPolicy();

		/**
		 * The meta object literal for the '<em><b>Context Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER = eINSTANCE.getSiteAccessControlSystem_ContextContainer();

		/**
		 * The meta object literal for the '<em><b>Authentication Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY = eINSTANCE.getSiteAccessControlSystem_AuthenticationPolicy();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY = eINSTANCE.getSiteAccessControlSystem_Topology();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSecurityZone()
		 * @generated
		 */
		EClass SECURITY_ZONE = eINSTANCE.getSecurityZone();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ZONE__PUBLIC = eINSTANCE.getSecurityZone_Public();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ZONE__REACHABLE = eINSTANCE.getSecurityZone_Reachable();

		/**
		 * The meta object literal for the '<em><b>Constrained By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ZONE__CONSTRAINED_BY = eINSTANCE.getSecurityZone_ConstrainedBy();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl <em>Policy Dependent Authorization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPolicyDependentAuthorizationConstraint()
		 * @generated
		 */
		EClass POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT = eINSTANCE.getPolicyDependentAuthorizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME = eINSTANCE.getPolicyDependentAuthorizationConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Temporal Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT = eINSTANCE.getPolicyDependentAuthorizationConstraint_TemporalContext();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryUserConstraintImpl <em>Unary User Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryUserConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryUserConstraint()
		 * @generated
		 */
		EClass UNARY_USER_CONSTRAINT = eINSTANCE.getUnaryUserConstraint();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_USER_CONSTRAINT__USER = eINSTANCE.getUnaryUserConstraint_User();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryUserConstraintImpl <em>Binary User Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryUserConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryUserConstraint()
		 * @generated
		 */
		EClass BINARY_USER_CONSTRAINT = eINSTANCE.getBinaryUserConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_USER_CONSTRAINT__LEFT = eINSTANCE.getBinaryUserConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_USER_CONSTRAINT__RIGHT = eINSTANCE.getBinaryUserConstraint_Right();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryRoleConstraintImpl <em>Unary Role Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryRoleConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryRoleConstraint()
		 * @generated
		 */
		EClass UNARY_ROLE_CONSTRAINT = eINSTANCE.getUnaryRoleConstraint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_ROLE_CONSTRAINT__ROLE = eINSTANCE.getUnaryRoleConstraint_Role();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryRoleConstraintImpl <em>Binary Role Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryRoleConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryRoleConstraint()
		 * @generated
		 */
		EClass BINARY_ROLE_CONSTRAINT = eINSTANCE.getBinaryRoleConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_ROLE_CONSTRAINT__LEFT = eINSTANCE.getBinaryRoleConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_ROLE_CONSTRAINT__RIGHT = eINSTANCE.getBinaryRoleConstraint_Right();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryDemarcationConstraintImpl <em>Unary Demarcation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryDemarcationConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryDemarcationConstraint()
		 * @generated
		 */
		EClass UNARY_DEMARCATION_CONSTRAINT = eINSTANCE.getUnaryDemarcationConstraint();

		/**
		 * The meta object literal for the '<em><b>Demarcation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_DEMARCATION_CONSTRAINT__DEMARCATION = eINSTANCE.getUnaryDemarcationConstraint_Demarcation();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryDemarcationConstraintImpl <em>Binary Demarcation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryDemarcationConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryDemarcationConstraint()
		 * @generated
		 */
		EClass BINARY_DEMARCATION_CONSTRAINT = eINSTANCE.getBinaryDemarcationConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_DEMARCATION_CONSTRAINT__LEFT = eINSTANCE.getBinaryDemarcationConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_DEMARCATION_CONSTRAINT__RIGHT = eINSTANCE.getBinaryDemarcationConstraint_Right();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryPermissionConstraintImpl <em>Unary Permission Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryPermissionConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getUnaryPermissionConstraint()
		 * @generated
		 */
		EClass UNARY_PERMISSION_CONSTRAINT = eINSTANCE.getUnaryPermissionConstraint();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_PERMISSION_CONSTRAINT__PERMISSION = eINSTANCE.getUnaryPermissionConstraint_Permission();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryPermissionConstraintImpl <em>Binary Permission Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BinaryPermissionConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBinaryPermissionConstraint()
		 * @generated
		 */
		EClass BINARY_PERMISSION_CONSTRAINT = eINSTANCE.getBinaryPermissionConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PERMISSION_CONSTRAINT__LEFT = eINSTANCE.getBinaryPermissionConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PERMISSION_CONSTRAINT__RIGHT = eINSTANCE.getBinaryPermissionConstraint_Right();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDURConstraintImpl <em>So DUR Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDURConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDURConstraint()
		 * @generated
		 */
		EClass SO_DUR_CONSTRAINT = eINSTANCE.getSoDURConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUDConstraintImpl <em>So DUD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDUDConstraint()
		 * @generated
		 */
		EClass SO_DUD_CONSTRAINT = eINSTANCE.getSoDUDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUPConstraintImpl <em>So DUP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDUPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDUPConstraint()
		 * @generated
		 */
		EClass SO_DUP_CONSTRAINT = eINSTANCE.getSoDUPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRDConstraintImpl <em>So DRD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDRDConstraint()
		 * @generated
		 */
		EClass SO_DRD_CONSTRAINT = eINSTANCE.getSoDRDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDDPConstraintImpl <em>So DDP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDDPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDDPConstraint()
		 * @generated
		 */
		EClass SO_DDP_CONSTRAINT = eINSTANCE.getSoDDPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAuthorizationPolicy()
		 * @generated
		 */
		EClass AUTHORIZATION_POLICY = eINSTANCE.getAuthorizationPolicy();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY__USERS = eINSTANCE.getAuthorizationPolicy_Users();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY__ROLES = eINSTANCE.getAuthorizationPolicy_Roles();

		/**
		 * The meta object literal for the '<em><b>Demarcations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY__DEMARCATIONS = eINSTANCE.getAuthorizationPolicy_Demarcations();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY__PERMISSIONS = eINSTANCE.getAuthorizationPolicy_Permissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_POLICY__NAME = eINSTANCE.getAuthorizationPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Temporal Grant Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES = eINSTANCE.getAuthorizationPolicy_TemporalGrantRules();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteURConstraintImpl <em>Prerequisite UR Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteURConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteURConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_UR_CONSTRAINT = eINSTANCE.getPrerequisiteURConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUDConstraintImpl <em>Prerequisite UD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteUDConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_UD_CONSTRAINT = eINSTANCE.getPrerequisiteUDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUPConstraintImpl <em>Prerequisite UP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteUPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteUPConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_UP_CONSTRAINT = eINSTANCE.getPrerequisiteUPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRDConstraintImpl <em>Prerequisite RD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteRDConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_RD_CONSTRAINT = eINSTANCE.getPrerequisiteRDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRPConstraintImpl <em>Prerequisite RP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteRPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteRPConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_RP_CONSTRAINT = eINSTANCE.getPrerequisiteRPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteDPConstraintImpl <em>Prerequisite DP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.PrerequisiteDPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getPrerequisiteDPConstraint()
		 * @generated
		 */
		EClass PREREQUISITE_DP_CONSTRAINT = eINSTANCE.getPrerequisiteDPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDURConstraintImpl <em>Bo DUR Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDURConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDURConstraint()
		 * @generated
		 */
		EClass BO_DUR_CONSTRAINT = eINSTANCE.getBoDURConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUDConstraintImpl <em>Bo DUD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDUDConstraint()
		 * @generated
		 */
		EClass BO_DUD_CONSTRAINT = eINSTANCE.getBoDUDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRDConstraintImpl <em>Bo DRD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDRDConstraint()
		 * @generated
		 */
		EClass BO_DRD_CONSTRAINT = eINSTANCE.getBoDRDConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUPConstraintImpl <em>Bo DUP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDUPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDUPConstraint()
		 * @generated
		 */
		EClass BO_DUP_CONSTRAINT = eINSTANCE.getBoDUPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRPConstraintImpl <em>Bo DRP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDRPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDRPConstraint()
		 * @generated
		 */
		EClass BO_DRP_CONSTRAINT = eINSTANCE.getBoDRPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.BoDDPConstraintImpl <em>Bo DDP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.BoDDPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getBoDDPConstraint()
		 * @generated
		 */
		EClass BO_DDP_CONSTRAINT = eINSTANCE.getBoDDPConstraint();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityURConstraintImpl <em>Cardinality UR Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityURConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityURConstraint()
		 * @generated
		 */
		EClass CARDINALITY_UR_CONSTRAINT = eINSTANCE.getCardinalityURConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_UR_CONSTRAINT__BOUND = eINSTANCE.getCardinalityURConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUDConstraintImpl <em>Cardinality UD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityUDConstraint()
		 * @generated
		 */
		EClass CARDINALITY_UD_CONSTRAINT = eINSTANCE.getCardinalityUDConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_UD_CONSTRAINT__BOUND = eINSTANCE.getCardinalityUDConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRDConstraintImpl <em>Cardinality RD Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRDConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityRDConstraint()
		 * @generated
		 */
		EClass CARDINALITY_RD_CONSTRAINT = eINSTANCE.getCardinalityRDConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_RD_CONSTRAINT__BOUND = eINSTANCE.getCardinalityRDConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUPConstraintImpl <em>Cardinality UP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityUPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityUPConstraint()
		 * @generated
		 */
		EClass CARDINALITY_UP_CONSTRAINT = eINSTANCE.getCardinalityUPConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_UP_CONSTRAINT__BOUND = eINSTANCE.getCardinalityUPConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRPConstraintImpl <em>Cardinality RP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityRPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityRPConstraint()
		 * @generated
		 */
		EClass CARDINALITY_RP_CONSTRAINT = eINSTANCE.getCardinalityRPConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_RP_CONSTRAINT__BOUND = eINSTANCE.getCardinalityRPConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityDPConstraintImpl <em>Cardinality DP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.CardinalityDPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getCardinalityDPConstraint()
		 * @generated
		 */
		EClass CARDINALITY_DP_CONSTRAINT = eINSTANCE.getCardinalityDPConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_DP_CONSTRAINT__BOUND = eINSTANCE.getCardinalityDPConstraint_Bound();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl <em>Context Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getContextContainer()
		 * @generated
		 */
		EClass CONTEXT_CONTAINER = eINSTANCE.getContextContainer();

		/**
		 * The meta object literal for the '<em><b>Temporal Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CONTAINER__TEMPORAL_CONTEXTS = eINSTANCE.getContextContainer_TemporalContexts();

		/**
		 * The meta object literal for the '<em><b>Valid Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CONTAINER__VALID_DAYS = eINSTANCE.getContextContainer_ValidDays();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_CONTAINER__NAME = eINSTANCE.getContextContainer_Name();

		/**
		 * The meta object literal for the '<em><b>My Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CONTAINER__MY_SCENARIOS = eINSTANCE.getContextContainer_MyScenarios();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfYearImpl <em>Valid Day Of Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfYearImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getValidDayOfYear()
		 * @generated
		 */
		EClass VALID_DAY_OF_YEAR = eINSTANCE.getValidDayOfYear();

		/**
		 * The meta object literal for the '<em><b>Valid Day Of Week Month</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_DAY_OF_YEAR__VALID_DAY_OF_WEEK_MONTH = eINSTANCE.getValidDayOfYear_ValidDayOfWeekMonth();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl <em>Authentication Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAuthenticationPolicy()
		 * @generated
		 */
		EClass AUTHENTICATION_POLICY = eINSTANCE.getAuthenticationPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_POLICY__NAME = eINSTANCE.getAuthenticationPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Temporal Authentication Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES = eINSTANCE.getAuthenticationPolicy_TemporalAuthenticationRules();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl <em>Temporal Authentication Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getTemporalAuthenticationRule()
		 * @generated
		 */
		EClass TEMPORAL_AUTHENTICATION_RULE = eINSTANCE.getTemporalAuthenticationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_AUTHENTICATION_RULE__NAME = eINSTANCE.getTemporalAuthenticationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_AUTHENTICATION_RULE__PRIORITY = eINSTANCE.getTemporalAuthenticationRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_AUTHENTICATION_RULE__STATUS = eINSTANCE.getTemporalAuthenticationRule_Status();

		/**
		 * The meta object literal for the '<em><b>Temporal Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT = eINSTANCE.getTemporalAuthenticationRule_TemporalContext();

		/**
		 * The meta object literal for the '<em><b>Security Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE = eINSTANCE.getTemporalAuthenticationRule_SecurityZone();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.MyScenarioImpl <em>My Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.MyScenarioImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getMyScenario()
		 * @generated
		 */
		EClass MY_SCENARIO = eINSTANCE.getMyScenario();

		/**
		 * The meta object literal for the '<em><b>Temporal Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_SCENARIO__TEMPORAL_CONTEXTS = eINSTANCE.getMyScenario_TemporalContexts();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AccessControlSystemTopologyImpl <em>Access Control System Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.AccessControlSystemTopologyImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getAccessControlSystemTopology()
		 * @generated
		 */
		EClass ACCESS_CONTROL_SYSTEM_TOPOLOGY = eINSTANCE.getAccessControlSystemTopology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_SYSTEM_TOPOLOGY__NAME = eINSTANCE.getAccessControlSystemTopology_Name();

		/**
		 * The meta object literal for the '<em><b>Security Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_SYSTEM_TOPOLOGY__SECURITY_ZONES = eINSTANCE.getAccessControlSystemTopology_SecurityZones();

		/**
		 * The meta object literal for the '{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRPConstraintImpl <em>So DRP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.SoDRPConstraintImpl
		 * @see com.vanderhighway.grrbac.model.grrbac.model.impl.GRRBACPackageImpl#getSoDRPConstraint()
		 * @generated
		 */
		EClass SO_DRP_CONSTRAINT = eINSTANCE.getSoDRPConstraint();

	}

} //GRRBACPackage
