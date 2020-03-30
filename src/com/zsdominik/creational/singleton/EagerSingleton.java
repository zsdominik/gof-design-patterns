package com.zsdominik.creational.singleton;

/**
 * This is a design pattern where an instance of a class is created much before it is actually required.
 * Mostly it is done on system startup. In an eager initialization singleton pattern, the singleton instance
 * is created irrespective of whether any other class actually asked for its instance or not.
 */
public class EagerSingleton {
    private static volatile EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton created");
    }

    public static EagerSingleton getInstance() {
        System.out.println("EagerSingleton getInstance called");
        return INSTANCE;
    }

}
