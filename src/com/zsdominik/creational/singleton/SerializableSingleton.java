package com.zsdominik.creational.singleton;

import java.io.Serializable;

/**
 *  We need to include a readResolve() method in our SerializableSingleton class.
 *  This method will be invoked when you will de-serialize the object. Inside of this method,
 *  you must return the existing instance to ensure a single instance application wide.
 */
public class SerializableSingleton implements Serializable {

    private volatile static SerializableSingleton INSTANCE;
    private int value = 100;

    private SerializableSingleton() {
        System.out.println("SerializableSingleton created");
    }

    public static SerializableSingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new SerializableSingleton();
        }
        System.out.println("SerializableSingleton getInstance called");
        return INSTANCE;
    }

    protected Object readResolve() {
        System.out.println("SerializableSingleton readResolver called");
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
