package com.vanderhighway.grrbac.aggregators;

import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.AggregatorType;
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.BoundAggregator;
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IAggregatorFactory;


/**
 * This aggregator calculates the sum of the values of a selected aggregate parameter of a called pattern. The aggregate
 * parameter is selected with the '#' symbol; the aggregate parameter must not be used outside the aggregator call. The
 * other parameters of the call might be bound or unbound; bound parameters limit the matches to consider for the
 * summation.
 *
 * @since 1.4
 *
 */


@AggregatorType(
        parameterTypes = {Object.class},
        returnTypes = {Scenario.class})
public final class distinct implements IAggregatorFactory {


    @Override
    public BoundAggregator getAggregatorLogic(Class<?> domainClass) {
        return new BoundAggregator(DistinctOperator.INSTANCE, domainClass, Scenario.class);
    }
}

