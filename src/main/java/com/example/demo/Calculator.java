package com.example.demo;

public class Calculator {

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        if (value2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return -1; // Vous pouvez renvoyer une valeur spéciale pour indiquer une erreur, par exemple -1.
        }
        return value1 / value2;
    }

    public static void main(String[] args) {
        // Créez une instance de la classe Calculator
        Calculator myCalculator = new Calculator();

        // Appelez les méthodes sur cette instance
        int resultAdd = myCalculator.add(10, 5);
        int resultSubtract = myCalculator.subtract(10, 5);
        int resultMultiply = myCalculator.multiply(10, 5);
        int resultDivide = myCalculator.divide(10, 5);

        // Affichez les résultats
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
