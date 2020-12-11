package com.vanderhighway.grrbac.aggregators;

import java.util.*;
import java.util.stream.Collectors;

import com.vanderhighway.grrbac.model.grrbac.model.MyScenario;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;

public class Scenario extends HashSet<TemporalContext> {

    public <D> Scenario(Collection<D> collect) {
    	super();
        this.addAll(collect.stream().map(x -> ((TemporalContext) x)).collect(Collectors.toSet()));
    }
    
    @Override
    public String toString() {
    	  List<String> contextList = this.stream().map(x -> x.getName()).collect(Collectors.toList());
          Collections.sort(contextList);
          String prettyString = contextList.toString();
          return prettyString;
    }


    public static Scenario toScenario(Object myScenario) {
    	MyScenario sc = (MyScenario) myScenario;
    	return new Scenario(sc.getTemporalContexts());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
