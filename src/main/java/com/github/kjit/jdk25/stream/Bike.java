package com.github.kjit.jdk25.stream;

public class Bike extends Vehicle {
    private final DriveType driveType;
    Bike(int maxSpeed, DriveType driveType) {
        super(maxSpeed);
        this.driveType = driveType;
    }

    public DriveType getDriveType() {
        return driveType;
    }
}
