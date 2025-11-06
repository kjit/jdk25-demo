package com.github.kjit.jdk25.stream;

public class Car extends Vehicle {
    Car(int maxSpeed) {
        // prologue
        if (maxSpeed <=0) {
            throw new IllegalArgumentException("Speed has to be positive value");
        }

        super(maxSpeed);

        // epilogue
    }

}
