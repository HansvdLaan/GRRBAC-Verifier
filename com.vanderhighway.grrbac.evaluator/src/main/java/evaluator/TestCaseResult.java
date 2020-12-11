package evaluator;

import generators.datatypes.CompoundAction;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCaseResult {

    private String name;
    private List<CompoundMeasurement> measurements;

    public TestCaseResult() {
    }

    public TestCaseResult(String name, List<CompoundMeasurement> measurements) {
        this.name = name;
        this.measurements = measurements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompoundMeasurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<CompoundMeasurement> measurements) {
        this.measurements = measurements;
    }
}
