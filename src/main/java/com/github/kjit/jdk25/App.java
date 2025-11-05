package com.github.kjit.jdk25;

import com.github.kjit.jdk25.stream.CarsCollector;

public class App
{
    public static void main( String[] args )
    {
        IO.println();
        IO.println( "Hello JDK 25" );
        CarsCollector cc = new CarsCollector();
        IO.println(cc.getList());
    }
}
