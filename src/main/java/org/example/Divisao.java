package org.example;

public class Divisao {
    // Criei o método static p/ não precisar instanciar um objeto
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN;
        }
        return num1 / num2;
    }
}