package com.github.kjit.jdk25.stream;

import module java.base;

public class CarsCollector {

    public List<Vehicle> readingListFromFile () {
        try (Reader reader = new FileReader("vehicles.csv")) {
            return reader.readAllLines()
                    .stream().map(mapToVehicle()).toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Integer> speedIncreaseForCars(List<Vehicle> vehicles) {
        return vehicles.stream().filter(vehicle -> vehicle instanceof Car)
                .gather(new SpeedTrendAnalyzer()).findFirst().orElseThrow();
    }

    private Function<? super String, Vehicle> mapToVehicle() {
        return s -> VehicleBuilder.of().parse(s.split(","));
    }


}
