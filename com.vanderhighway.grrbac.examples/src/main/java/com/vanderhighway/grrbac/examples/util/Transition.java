package com.vanderhighway.grrbac.examples.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transition{
    public String id;
    public String name;
    public Side[] sides;
    public int floorID;

    public void setFloorID(int floorID) {
        this.floorID = floorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
