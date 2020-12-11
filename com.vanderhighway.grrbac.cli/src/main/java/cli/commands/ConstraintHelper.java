package cli.commands;

import com.vanderhighway.grrbac.model.grrbac.model.*;

public class ConstraintHelper {

    public static String toString(PolicyDependentAuthorizationConstraint constraint) {
        String constraintName = constraint.getClass().getSimpleName();
        String name1="null";
        String name2="null";
        switch (constraintName) {
            case "SoDURConstraintImpl":
                SoDURConstraint c1 = (SoDURConstraint) constraint;
                return "SoD Users/Roles role1=" + c1.getLeft().getName() + ", role2=" + c1.getRight().getName();
            case "SoDUDConstraintImpl":
                SoDUDConstraint c2 = (SoDUDConstraint) constraint;
                return "SoD Users/Demarcations dem1=" + c2.getLeft().getName() + ", dem2=" + c2.getRight().getName();
            case "SoDUPConstraintImpl":
                SoDUPConstraint c3 = (SoDUPConstraint) constraint;
                return "SoD Users/Permissions perm1=" + c3.getLeft().getName() + ", perm2=" + c3.getRight().getName();
            case "SoDRDConstraintImpl":
                SoDRDConstraint c4 = (SoDRDConstraint) constraint;
                return "SoD Roles/Demarcations dem1=" + c4.getLeft().getName() + ", dem2=" + c4.getRight().getName();
            case "SoDRPConstraintImpl":
                SoDRPConstraint c5 = (SoDRPConstraint) constraint;
                return "SoD Roles/Permissions perm1=" + c5.getLeft().getName() + ", perm2=" + c5.getRight().getName();
            case "SoDDPConstraintImpl":
                SoDDPConstraint c6 = (SoDDPConstraint) constraint;
                return "SoD Demarcations/Permissions perm1=" + c6.getLeft().getName() + ", perm2=" + c6.getRight().getName();
            case "PrerequisiteURConstraintImpl":
                PrerequisiteURConstraint c7 = (PrerequisiteURConstraint) constraint;
                return "Prerequisite Users/Demarcations role1=" + c7.getLeft().getName() + ", role2=" + c7.getRight().getName();
            case "PrerequisiteUDConstraintImpl":
                PrerequisiteUDConstraint c8 = (PrerequisiteUDConstraint) constraint;
                return "Prerequisite Users/Demarcations dem1=" + c8.getLeft().getName() + ", dem2=" + c8.getRight().getName();
            case "PrerequisiteUPConstraintImpl":
                PrerequisiteUPConstraint c9 = (PrerequisiteUPConstraint) constraint;
                return "Prerequisite Users/Permissions perm1=" + c9.getLeft().getName() + ", perm2=" + c9.getRight().getName();
            case "PrerequisiteRDConstraintImpl":
                PrerequisiteRDConstraint c10 = (PrerequisiteRDConstraint) constraint;
                return "Prerequisite Roles/Demarcations dem1=" + c10.getLeft().getName() + ", dem2=" + c10.getRight().getName();
            case "PrerequisiteRPConstraintImpl":
                PrerequisiteRPConstraint c11 = (PrerequisiteRPConstraint) constraint;
                return "Prerequisite Roles/Permissions perm1=" + c11.getLeft().getName() + ", perm2=" + c11.getRight().getName();
            case "PrerequisiteDPConstraintImpl":
                PrerequisiteDPConstraint c12 = (PrerequisiteDPConstraint) constraint;
                return "Prerequisite Demarcations/Permissions perm1=" + c12.getLeft().getName() + ", perm2=" + c12.getRight().getName();
            case "BoDURConstraintImpl":
                BoDURConstraint c13 = (BoDURConstraint) constraint;
                return "BoD Users/Roles role1=" + c13.getLeft().getName() + ", role2=" + c13.getRight().getName();
            case "BoDUDConstraintImpl":
                BoDUDConstraint c14 = (BoDUDConstraint) constraint;
                return "BoD Users/Demarcations dem1=" + c14.getLeft().getName() + ", dem2=" + c14.getRight().getName();
            case "BoDUPConstraintImpl":
                BoDUPConstraint c15 = (BoDUPConstraint) constraint;
                return "BoD Users/Permissions perm1=" + c15.getLeft().getName() + ", perm2=" + c15.getRight().getName();
            case "BoDRDConstraintImpl":
                BoDRDConstraint c16 = (BoDRDConstraint) constraint;
                return "BoD Roles/Demarcations dem1=" + c16.getLeft().getName() + ", dem2=" + c16.getRight().getName();
            case "BoDRPConstraintImpl":
                BoDRPConstraint c17 = (BoDRPConstraint) constraint;
                return "BoD Roles/Permissions perm1=" + c17.getLeft().getName() + ", perm2=" + c17.getRight().getName();
            case "BoDDPConstraintImpl":
                BoDDPConstraint c18 = (BoDDPConstraint) constraint;
                return "BoD Demarcations/Permissions perm1=" + c18.getLeft().getName() + ", perm2=" + c18.getRight().getName();
            case "CardinalityURConstraintImpl":
                CardinalityURConstraint c19 = (CardinalityURConstraint) constraint;
                return "Cardinality Users/Roles role=" + c19.getRole().getName() + ", bound=" + c19.getBound();
            case "CardinalityUDConstraintImpl":
                CardinalityUDConstraint c20 = (CardinalityUDConstraint) constraint;
                return "Cardinality Users/Demarcations demarcation=" + c20.getDemarcation().getName() + ", bound=" + c20.getBound();
            case "CardinalityUPConstraintImpl":
                CardinalityUPConstraint c21 = (CardinalityUPConstraint) constraint;
                return "Cardinality Users/Permissions permission=" + c21.getPermission().getName() + ", bound=" + c21.getBound();
            case "CardinalityRDConstraintImpl":
                CardinalityRDConstraint c22 = (CardinalityRDConstraint) constraint;
                return "Cardinality Users/Roles demarcation=" + c22.getDemarcation().getName() + ", bound=" + c22.getBound();
            case "CardinalityRPConstraintImpl":
                CardinalityRPConstraint c23 = (CardinalityRPConstraint) constraint;
                return "Cardinality Users/Roles permission=" + c23.getPermission().getName() + ", bound=" + c23.getBound();
            case "CardinalityDPConstraintImpl":
                CardinalityDPConstraint c24 = (CardinalityDPConstraint) constraint;
                return "Cardinality Users/Roles permission=" + c24.getPermission().getName() + ", bound=" + c24.getBound();
            default:
                return "unkown constraint";
        }
    }
}
