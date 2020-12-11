package com.vanderhighway.grrbac.aggregators;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IMultisetAggregationOperator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctOperator<D> implements IMultisetAggregationOperator<D, Multiset<D>, Scenario> {

    public static final DistinctOperator INSTANCE = new DistinctOperator();

    private DistinctOperator() {
        // Singleton, do not call.
    }

    @Override
    public String getShortDescription() {
        return "collect<Integer> incrementally computes the sum of java.lang.Integer values";
    }
    @Override
    public String getName() {
        return "collect<Integer>";
    }

    @Override
    public Multiset<D> createNeutral() {
        return HashMultiset.create();
    }

    @Override
    public boolean isNeutral(Multiset<D> result) {
        return createNeutral().equals(result);
    }

    @Override
    public Multiset<D> update(Multiset<D> oldResult, D updateValue, boolean isInsertion) {
        if(isInsertion) {
            oldResult.add(updateValue);
        } else {
            oldResult.remove(updateValue);
        }
        return oldResult;
    }

    @Override
    public Scenario getAggregate(Multiset<D> result) {
        return new Scenario(result.elementSet());
    }

    @Override
    public Scenario aggregateStream(Stream<D> stream) {
        return new Scenario(stream.collect(Collectors.toSet()));
    }


}

