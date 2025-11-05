package com.github.kjit.jdk25.stream;

import module java.base;
import java.util.List;

public class CarsCollector {

    public List<Car> getList() {
        Car c = new Car(20);
        List<Car> cars = new ArrayList<>();
        cars.add(c);
        return cars;
    }
}
