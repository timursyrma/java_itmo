package ru.serialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Move {
    private String name;
    private int accuracy;
    @JsonProperty("pp")
    private int power_points;

    @Override
    public String toString() {
        return "Move: " + name + ", " + ", " + accuracy + ", " + power_points;
    }
}
