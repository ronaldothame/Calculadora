package org.example;

public class Divisao {
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN;
        }
        return num1 / num2;
    }
}