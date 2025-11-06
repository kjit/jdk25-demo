package com.github.kjit.jdk25.stream;

public class Airplane extends Vehicle {
    private final int length;

    Airplane(int maxSpeed, int length) {
        super(maxSpeed);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
