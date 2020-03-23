package com.zsdominik.creational.prototype.factory;

import com.zsdominik.creational.prototype.prototypes.PrototypeCapable;
import com.zsdominik.creational.prototype.prototypes.BeefBurgerProto;
import com.zsdominik.creational.prototype.prototypes.ChickenBurgerProto;

import java.util.Hashtable;

public class PrototypeFactory {
    public static class BurgerType {
        public static final String BEEF = "beef";
        public static final String CHICKEN = "chicken";
    }

    private static Hashtable<String, PrototypeCapable> burgerPrototypes = new Hashtable<>();

    public static void loadCache() {
        burgerPrototypes.put(BurgerType.BEEF, new BeefBurgerProto());
        burgerPrototypes.put(BurgerType.CHICKEN, new ChickenBurgerProto());
    }

    public static PrototypeCapable getPrototypeOf(String type) throws CloneNotSupportedException {
        return burgerPrototypes.get(type).clone();
    }
}
