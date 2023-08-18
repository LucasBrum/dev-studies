package br.dev.brum.javadesignpatterns.creational.singleton;

public class Singleton {
    // private static variable to hold the single instance
    private static Singleton uniqueInstance;

    // Private constructor to prevent instantiation from another classes
    private Singleton() {}

    // Public static method to get the single instance
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}