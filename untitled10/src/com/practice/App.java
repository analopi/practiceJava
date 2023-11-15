package com.practice;
import generator.*;

public class App {
    public static void main(String[] args) {
        demoIntGenerator();
    }

    public static void demoIntGenerator() {
        IntGenerator[] generators = {
                new RandomIntGenerator(),
                new TimeDependentIntGenerator(),
                new SerialIntGenerator()
        };

        for (IntGenerator generator : generators) {
            System.out.println("Это генератор: " + generator.getName());
            for (int i = 0; i < 10; i++) {
                System.out.println(generator.nextPositive());
            }
            System.out.println();
        }
    }
}
