package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            double x = (-b) / (2 * a);
            return "Один действительный корень: " + x;
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Два действительных корня: " + x1 + ", " + x2;
        } else {
            return "Нет целого решения так как дискриминант меньше нуля.";
        }
    }
}