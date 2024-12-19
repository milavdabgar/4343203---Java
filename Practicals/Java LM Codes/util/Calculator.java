// File: util/Calculator.java
package util;

public class Calculator {
    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}