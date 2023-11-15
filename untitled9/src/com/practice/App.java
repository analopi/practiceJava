package com.practice;
import equation.QuadraticEquation;

public class App {
    public static void main(String[] args) {
        demoQuadraticEquation();
    }

    public static void demoQuadraticEquation() {
        QuadraticEquation equation1 = new QuadraticEquation(2, -3, 1);
        System.out.println("Уравнение 1: " + equation1.toString());
        System.out.println("Оно квадратное? " + equation1.isQuadratic());
        System.out.println();

        QuadraticEquation equation2 = new QuadraticEquation(0, 4, 5);
        System.out.println("Уравнение 2: " + equation2.toString());
        System.out.println("Оно квадратное? " + equation2.isQuadratic());
        System.out.println();

        QuadraticEquation equation3 = new QuadraticEquation(3, 0, 7);
        System.out.println("Уравнение  3: " + equation3.toString());
        System.out.println("Оно квадратное? " + equation3.isQuadratic());
        System.out.println();

        QuadraticEquation equation4 = new QuadraticEquation(0, 0, 0);
        System.out.println("Уравнение 4: " + equation4.toString());
        System.out.println("Оно квадратное? " + equation4.isQuadratic());
        System.out.println();

        // Другие произвольные варианты
        QuadraticEquation equation5 = new QuadraticEquation(-1, 2, -1);
        System.out.println("Уравнение 5: " + equation5.toString());
        System.out.println("Оно квадратное? " + equation5.isQuadratic());
    }
}
