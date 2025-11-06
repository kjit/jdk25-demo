package com.github.kjit.jdk25;

import com.github.kjit.jdk25.stream.CarsCollector;
import com.github.kjit.jdk25.stream.Vehicle;

import java.util.List;

public class App
{
    static void main()
    {
        IO.println();
        IO.println( "Hello JDK 25" );
        CarsCollector cc = new CarsCollector();
        List<Vehicle> vehicles = cc.readingListFromFile();

        var speedChange = cc.speedIncreaseForCars(vehicles);

        IO.println("Speed trend: " + speedChange);
    }
}
