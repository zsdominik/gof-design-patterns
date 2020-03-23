package com.zsdominik.creational.prototype;

import com.zsdominik.caller.PatternCaller;
import com.zsdominik.creational.prototype.factory.PrototypeFactory;
import com.zsdominik.creational.prototype.prototypes.BeefBurgerProto;
import com.zsdominik.creational.prototype.prototypes.PrototypeCapable;
import com.zsdominik.util.Timer;

import java.util.LinkedList;
import java.util.List;

public class PrototypePatternCaller implements PatternCaller {

    private static final int NUMBER_OF_OBJECTS_TO_CREATE = 100000;

    @Override
    public void callExample() {
        Timer.runWithTimer(createObjectsUsingPrototype(), "createObjectsUsingPrototype");
        Timer.runWithTimer(createObjectsUsingNew(), "createObjectsUsingNew");
    }

    private Runnable createObjectsUsingPrototype() {
        PrototypeFactory.loadCache();
        return () -> {
            List<PrototypeCapable> listOfObjects = new LinkedList<>();
            for (int i = 0; i < NUMBER_OF_OBJECTS_TO_CREATE; i++) {
                try {
                    listOfObjects.add(PrototypeFactory.getPrototypeOf(PrototypeFactory.BurgerType.BEEF));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(listOfObjects.size() + " object created");
        };
    }

    private Runnable createObjectsUsingNew() {
        return () -> {
            List<PrototypeCapable> listOfObjects = new LinkedList<>();
            for (int i = 0; i < NUMBER_OF_OBJECTS_TO_CREATE; i++) {
                listOfObjects.add(new BeefBurgerProto());
            }
            System.out.println(listOfObjects.size() + " object created");
        };
    }
}
