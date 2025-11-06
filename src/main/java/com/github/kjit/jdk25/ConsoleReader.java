package com.github.kjit.jdk25;

///
/// ### Console reader - tool for reading data from console
///
///  - read method is designed to read and validate input
///  - readInt method reading only integer values
///
///
///
public class ConsoleReader {

    ///
    ///
    /// @param current expected integer to be added to provided value
    public int read(int current) {
        String nextNumber = IO.readln("Add to %d: ".formatted(current));
        int forCalculate = 0;
        try {
            forCalculate = Integer.parseInt(nextNumber);
        } catch (NumberFormatException _) {
           IO.println("Cannot parse %s to integer".formatted(nextNumber));
        }
        return forCalculate - 100;
    }
}
