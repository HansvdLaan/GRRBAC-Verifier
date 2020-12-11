package com.vanderhighway.grrbac.core.modifier;

import com.brein.time.timeintervals.indexes.IntervalTree;
import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.DayOfWeekInstanceP;
import com.vanderhighway.grrbac.patterns.TimeRangeP;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.xtext.xbase.lib.Extension;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class IntervalUtil {

    @Extension
    private static final GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;



    // ---------- Process the adding/removing of ranges ----------
    
    public static void processAddRange(PolicyModifier modifier, IntervalTree tree, TimeRangeP.Match match) throws ModelManipulationException {
        //System.out.println("Process AddRange called with:" + match.toString());
            TimeRange timeRange = match.getInstance();
            IntegerInterval rangeInterval = new IntegerInterval(timeRange.getStart(), timeRange.getEnd());
            List<IntegerInterval> overlaps = tree.overlap(rangeInterval).stream().map(x -> (IntegerInterval) x).collect(toList());
            ValidDay validDay = timeRange.getValidDay();

            //Two possible cases, either one overlap or two or more overlaps!
            if (overlaps.size() == 1) {
                IntegerInterval overlap = overlaps.get(0);
                // interval and overlap are equal
                if (timeRange.getStart() == overlap.getStart() && timeRange.getEnd() == overlap.getEnd()) {
                    addRangeReference(modifier, validDay, overlap, match.getInstance());
                }
                //no overlapping bounds and interval proper subset of overlap
                else if (timeRange.getStart() > overlap.getStart() && timeRange.getEnd() < overlap.getEnd()) {
                    IntegerInterval resizedOverlap = new IntegerInterval(overlap.getStart(), timeRange.getStart() - 1);
                    resizeValidDayTimeRange(modifier, tree, validDay, overlap, resizedOverlap);

                    IntegerInterval resizedOverlap2 = new IntegerInterval(timeRange.getEnd() + 1, overlap.getEnd());
                    addValidDayTimeRange(modifier, tree, validDay , modifier.getUniqueID(validDay.getName()), resizedOverlap2);
                    copyAllRangeReferences(modifier, validDay, resizedOverlap, resizedOverlap2);

                    updateNextValidDayTimeRange(modifier, validDay, resizedOverlap, resizedOverlap2);

                    IntegerInterval newValidDayTimeRangeInterval = new IntegerInterval(timeRange.getStart(), timeRange.getEnd());
                    addValidDayTimeRange(modifier, tree, validDay, modifier.getUniqueID(validDay.getName()), newValidDayTimeRangeInterval);
                    copyAllRangeReferences(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                    addRangeReference(modifier, validDay, newValidDayTimeRangeInterval, match.getInstance());

                    updateNextValidDayTimeRange(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                }
                // non-overlapping end-time and interval proper subset of overlap
                else if (timeRange.getEnd() < overlap.getEnd()) {
                    IntegerInterval resizedOverlap = new IntegerInterval(timeRange.getEnd() + 1, overlap.getEnd());
                    resizeValidDayTimeRange(modifier, tree, validDay, overlap, resizedOverlap);

                    IntegerInterval newValidDayTimeRangeInterval = new IntegerInterval(timeRange.getStart(), timeRange.getEnd());
                    addValidDayTimeRange(modifier, tree, validDay, modifier.getUniqueID(validDay.getName()), newValidDayTimeRangeInterval);
                    copyAllRangeReferences(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                    addRangeReference(modifier, validDay, newValidDayTimeRangeInterval, match.getInstance());

                    updatePreviousValidDayTimeRange(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                }
                // non-overlapping start-time and interval proper subset of overlap
                else if (timeRange.getStart() > overlap.getStart()) {
                    IntegerInterval resizedOverlap = new IntegerInterval(overlap.getStart(), timeRange.getStart() - 1);
                    resizeValidDayTimeRange(modifier, tree, validDay, overlap, resizedOverlap);

                    IntegerInterval newValidDayTimeRangeInterval = new IntegerInterval(timeRange.getStart(), timeRange.getEnd());
                    addValidDayTimeRange(modifier, tree, validDay, modifier.getUniqueID(validDay.getName()), newValidDayTimeRangeInterval);
                    copyAllRangeReferences(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                    addRangeReference(modifier, validDay, newValidDayTimeRangeInterval, match.getInstance());

                    updateNextValidDayTimeRange(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                for (IntegerInterval overlap : overlaps) {
                    if(overlap.getStart() < timeRange.getStart()) {
                        IntegerInterval resizedOverlap = new IntegerInterval(overlap.getStart(), timeRange.getStart() - 1);
                        resizeValidDayTimeRange(modifier, tree, validDay, overlap, resizedOverlap);

                        IntegerInterval newValidDayTimeRangeInterval = new IntegerInterval(timeRange.getStart(), overlap.getEnd());
                        addValidDayTimeRange(modifier, tree, validDay, modifier.getUniqueID(validDay.getName()), newValidDayTimeRangeInterval);
                        copyAllRangeReferences(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                        addRangeReference(modifier, validDay, newValidDayTimeRangeInterval, match.getInstance());

                        updateNextValidDayTimeRange(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                    }
                    else if(overlap.getEnd() > timeRange.getEnd()) {
                        IntegerInterval resizedOverlap = new IntegerInterval(timeRange.getEnd() + 1, overlap.getEnd());
                        resizeValidDayTimeRange(modifier, tree, validDay, overlap, resizedOverlap);

                        IntegerInterval newValidDayTimeRangeInterval = new IntegerInterval(overlap.getStart(), timeRange.getEnd());
                        addValidDayTimeRange(modifier, tree, validDay, modifier.getUniqueID(validDay.getName()), newValidDayTimeRangeInterval);
                        copyAllRangeReferences(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                        addRangeReference(modifier, validDay, newValidDayTimeRangeInterval, match.getInstance());

                        updatePreviousValidDayTimeRange(modifier, validDay, resizedOverlap, newValidDayTimeRangeInterval);
                    }
                    else {
                        addRangeReference(modifier, validDay, overlap, match.getInstance());
                    }
                }
            }
    }

    public static void processRemoveRange(PolicyModifier modifier, IntervalTree tree,
                                                          TimeRangeP.Match match) throws ModelManipulationException{
        //System.out.println("Process RemoveRange called with:" + match.toString());
        EList<ValidDayTimeRange> ValidDayTimeRanges = match.getInstance().getValidDayTimeRanges();
        ECollections.sort(ValidDayTimeRanges, new ValidDayTimeRangeComperator()); //Note: regular Collections.sort can not be used! see: https://www.eclipse.org/forums/index.php?t=msg&th=127964/

        ValidDay validDay = match.getValidDay();

        ValidDayTimeRange first = ValidDayTimeRanges.get(0);
        ValidDayTimeRange last = ValidDayTimeRanges.get(ValidDayTimeRanges.size() - 1);
        modifier.getManipulation().remove(first, ePackage.getValidDayTimeRange_TemporalContextTimeRanges(), match.getInstance());
        if(first.getPrevious() != null && containSameRanges(first.getTemporalContextTimeRanges(), first.getPrevious().getTemporalContextTimeRanges())) {
            mergeValidDayTimeRanges(modifier, tree, validDay, first.getPrevious(), first);
        }


        modifier.getManipulation().remove(last, ePackage.getValidDayTimeRange_TemporalContextTimeRanges(), match.getInstance());
        if(last.getNext() != null && containSameRanges(last.getTemporalContextTimeRanges(), last.getNext().getTemporalContextTimeRanges())) {
            mergeValidDayTimeRanges(modifier, tree, validDay, last, last.getNext());
        }

        List<ValidDayTimeRange> list = new ArrayList<>(match.getInstance().getValidDayTimeRanges());
		for(ValidDayTimeRange sr: list) {
			modifier.getManipulation().remove(sr, ePackage.getValidDayTimeRange_TemporalContextTimeRanges(), match.getInstance());
		}
		modifier.getManipulation().remove(validDay, ePackage.getValidDay_TimeRanges(), match.getInstance());
    }

    // ----------------------------------------------------------



    // ---------- Reference Management ----------

    private static void addRangeReference(PolicyModifier modifier, ValidDay validDay,
                                                             IntegerInterval ValidDayTimeRange, TimeRange timeRange) throws ModelManipulationException {
        ValidDayTimeRange sr = findValidDayTimeRangeByValidDayAndInterval(validDay, ValidDayTimeRange);
        modifier.manipulation.addTo(sr, ePackage.getValidDayTimeRange_TemporalContextTimeRanges(), timeRange);
    }

    private static void copyAllRangeReferences(PolicyModifier modifier, ValidDay validDay, IntegerInterval from, IntegerInterval to) throws ModelManipulationException {
        ValidDayTimeRange ValidDayTimeRangeFrom = findValidDayTimeRangeByValidDayAndInterval(validDay, from);
        ValidDayTimeRange ValidDayTimeRangeTo = findValidDayTimeRangeByValidDayAndInterval(validDay, to);
        for (TimeRange timeRange : ValidDayTimeRangeFrom.getTemporalContextTimeRanges()) {
            modifier.manipulation.addTo(ValidDayTimeRangeTo, ePackage.getValidDayTimeRange_TemporalContextTimeRanges(), timeRange);
        }
    }

    // ------------------------------------------



    // ---------- Schedule Range Methods ----------

    public static ValidDayTimeRange addValidDayTimeRange(PolicyModifier modifier, IntervalTree tree, ValidDay validDay, String name, IntegerInterval interval) throws ModelManipulationException {
        //System.out.println("add " + interval.toString() );
        ValidDayTimeRange sr = (ValidDayTimeRange) modifier.getManipulation().createChild(validDay, ePackage.getValidDay_Instances(), ePackage.getValidDayTimeRange());
        modifier.getManipulation().set(sr, ePackage.getTimeRange_Name(), name);
        modifier.getManipulation().set(sr, ePackage.getTimeRange_Start(), interval.getStart());
        modifier.getManipulation().set(sr, ePackage.getTimeRange_End(), interval.getEnd());
        tree.add(interval);
        return sr;
    }

    private static void resizeValidDayTimeRange(PolicyModifier modifier, IntervalTree tree, ValidDay validDay, IntegerInterval originalInterval, IntegerInterval newInterval) throws ModelManipulationException {
        //System.out.println("resize " + originalInterval.toString() + " to " + newInterval  );
        ValidDayTimeRange sr =  findValidDayTimeRangeByValidDayAndInterval(validDay, originalInterval);
        modifier.getManipulation().set(sr, ePackage.getTimeRange_Start(), newInterval.getStart());
        modifier.getManipulation().set(sr, ePackage.getTimeRange_End(), newInterval.getEnd());
        tree.remove(originalInterval);
        tree.add(newInterval);
    }

    private static void mergeValidDayTimeRanges(PolicyModifier modifier, IntervalTree tree, ValidDay validDay, ValidDayTimeRange left, ValidDayTimeRange right) throws ModelManipulationException {
        modifier.getManipulation().set(right, ePackage.getValidDayTimeRange_Previous(), left.getPrevious());
        removeValidDayTimeRange(modifier, tree, validDay, new IntegerInterval(left.getStart(), left.getEnd()));
        resizeValidDayTimeRange(modifier, tree, validDay, new IntegerInterval(right.getStart(), right.getEnd()),
                new IntegerInterval(left.getStart(), right.getEnd()));
    }

    private static void removeValidDayTimeRange(PolicyModifier modifier, IntervalTree tree, ValidDay validDay, IntegerInterval interval) throws ModelManipulationException {
        ValidDayTimeRange sr = findValidDayTimeRangeByValidDayAndInterval(validDay, interval);
        modifier.getManipulation().remove(validDay, ePackage.getValidDay_Instances(), sr);
        modifier.getManipulation().remove(sr, ePackage.getValidDayTimeRange_TemporalContextTimeRanges());
        modifier.getManipulation().remove(sr);
        tree.remove(interval);
    }
    
    private static void updateNextValidDayTimeRange(PolicyModifier modifier, ValidDay validDay, IntegerInterval fromInterval, IntegerInterval toInterval) throws ModelManipulationException {
        ValidDayTimeRange fromValidDayTimeRange = findValidDayTimeRangeByValidDayAndInterval(validDay, fromInterval);
        ValidDayTimeRange toValidDayTimeRange = findValidDayTimeRangeByValidDayAndInterval(validDay, toInterval);
        if(fromValidDayTimeRange.getNext() == null) {
            //System.out.println("next from: " + fromValidDayTimeRange.toString() + " to: " + toValidDayTimeRange.toString() );
            modifier.getManipulation().set(fromValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), toValidDayTimeRange);
        } else {
            ValidDayTimeRange originalToValidDayTimeRange = fromValidDayTimeRange.getNext();
            //System.out.println("next from: " + fromValidDayTimeRange.toString() + " to: " + toValidDayTimeRange );
            modifier.getManipulation().set(fromValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), toValidDayTimeRange);
            //System.out.println("next from: " + fromValidDayTimeRange.toString() + " to: " + originalToValidDayTimeRange.toString() );
            modifier.getManipulation().set(toValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), originalToValidDayTimeRange);
        }
    }

    private static void updatePreviousValidDayTimeRange(PolicyModifier modifier, ValidDay validDay, IntegerInterval toInterval, IntegerInterval fromInterval) throws ModelManipulationException {
        ValidDayTimeRange toValidDayTimeRange = findValidDayTimeRangeByValidDayAndInterval(validDay, toInterval);
        ValidDayTimeRange fromValidDayTimeRange = findValidDayTimeRangeByValidDayAndInterval(validDay, fromInterval);

        if(toValidDayTimeRange.getPrevious() == null) {
            //System.out.println("next from: " + fromValidDayTimeRange.toString() + " to: " + toValidDayTimeRange.toString() );
            modifier.getManipulation().set(fromValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), toValidDayTimeRange);
        } else {
            ValidDayTimeRange originalFromValidDayTimeRange = toValidDayTimeRange.getPrevious();

            //System.out.println("next from: " + fromValidDayTimeRange.toString() + " to: " + toValidDayTimeRange );
            modifier.getManipulation().set(fromValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), toValidDayTimeRange);
            //System.out.println("next from: " + originalFromValidDayTimeRange.toString() + " to: " + fromValidDayTimeRange.toString() );
            modifier.getManipulation().set(originalFromValidDayTimeRange, ePackage.getValidDayTimeRange_Next(), fromValidDayTimeRange);
        }
    }

    // --------------------------------------------



    // ---------- Find Ranges / Schedule Ranges ----------

    public static ValidDayTimeRange findValidDayTimeRangeByValidDayAndInterval(ValidDay validDay, IntegerInterval interval) {
        for(ValidDayTimeRange sr: validDay.getInstances()) {
            if(interval.getStart() == sr.getStart() && interval.getEnd() == sr.getEnd()) {
                return sr;
            }
        }
        return null;
    }

    // ---------------------------------------------------

    public static boolean containSameRanges(EList<TimeRange> list1, EList<TimeRange> list2) {
        RangeComperator comperator = new RangeComperator();
        ECollections.sort(list1, comperator);
        ECollections.sort(list2, comperator);
        return list1.equals(list2);
    }

    public static class ValidDayTimeRangeComperator implements Comparator<ValidDayTimeRange> {
        @Override
        public int compare(ValidDayTimeRange o1, ValidDayTimeRange o2) {
            return Integer.compare(o1.getStart(),o2.getStart());
        }
    }

    public static class RangeComperator implements Comparator<TimeRange> {
        @Override
        public int compare(TimeRange o1, TimeRange o2) {
            return Integer.compare(o1.getStart(),o2.getStart());
        }
    }

}
