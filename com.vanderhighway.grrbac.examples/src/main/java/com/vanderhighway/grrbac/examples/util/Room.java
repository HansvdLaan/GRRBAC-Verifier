package com.vanderhighway.grrbac.examples.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room{
    public int id;
    private String name;
    public boolean isOutside;
    public int floorID;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name.replace("&", " and ").replace(" ", "_");
    }

    public Room setFloorID(int floorID) {
        this.floorID = floorID;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id &&
                isOutside == room.isOutside &&
                floorID == room.floorID &&
                Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isOutside, floorID);
    }

}
