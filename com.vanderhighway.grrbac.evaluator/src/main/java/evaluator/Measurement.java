package evaluator;

import java.util.List;

public class Measurement {

    private double time;
    private double memory;

    public Measurement() {

    }

    public Measurement(double time, double memory) {
        this.time = time;
        this.memory = memory;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return time + "ms/" + memory + "MB";
    }
}
