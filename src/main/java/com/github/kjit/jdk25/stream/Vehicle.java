package com.github.kjit.jdk25.stream;

import java.util.StringJoiner;

public class Vehicle {
    private final int maxSpeed;
    private String name;

    Vehicle (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("maxSpeed=" + maxSpeed)
                .toString();
    }
}
