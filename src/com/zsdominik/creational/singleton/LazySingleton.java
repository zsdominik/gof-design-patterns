package com.zsdominik.creational.singleton;

public class LazySingleton {
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("LazySingleton created");
    }

    public static LazySingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (LazySingleton.class) {
                // double check to prevent multiple  threads creating the same instance
                if (null == INSTANCE) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        System.out.println("LazySingleton getInstance called");
        return INSTANCE;
    }
}
