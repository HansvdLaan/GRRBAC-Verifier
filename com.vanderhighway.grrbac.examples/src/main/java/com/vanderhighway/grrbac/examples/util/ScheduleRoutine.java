package com.vanderhighway.grrbac.examples.util;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleRoutine {

    public int id;
    private int floorID;
    public List<ScheduleRoutineDay> schedule;

    public ScheduleRoutine() {
        this.floorID = 0;
    }

    public void setFloorID(int id){
        this.floorID = id;
    }

    public int getFloorID() {
        return floorID;
    }

}
