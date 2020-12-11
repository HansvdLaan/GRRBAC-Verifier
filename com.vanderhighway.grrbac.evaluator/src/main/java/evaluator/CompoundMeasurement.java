package evaluator;

import com.google.common.collect.ComputationException;

import java.util.*;

public class CompoundMeasurement {

    private List<Measurement> measurements;

    public CompoundMeasurement() { }

    public CompoundMeasurement(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    public CompoundMeasurement(Measurement... measurements) {
        this.measurements = Arrays.asList(measurements);
    }

    public void addMeasurement(Measurement measurement) {
        this.measurements.add(measurement);
    }

    public void addMeasurements(List<Measurement> measurements) {
        this.measurements.addAll(measurements);
    }

    public void addMeasurements(Measurement... measurements) {
        this.measurements.addAll(Arrays.asList(measurements));
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }
}
