package com.github.kjit.jdk25.stream;

public class VehicleBuilder {

    static VehicleBuilder of() {
        return new VehicleBuilder();
    }

    Vehicle parse(String[] csvPayload) {
        var v = switch (csvPayload[0]) {
            case "CAR" -> new Car(Integer.parseInt(csvPayload[2]));
            case "AIRPLANE" -> new Airplane(Integer.parseInt(csvPayload[2]), Integer.parseInt(csvPayload[4]));
            case "BIKE" -> new Bike(Integer.parseInt(csvPayload[2]), DriveType.valueOf(csvPayload[3]));
            default -> throw new IllegalStateException("Unexpected value: " + csvPayload[0]);
        };
        v.setName(csvPayload[1]);
        return v;
    }

}
