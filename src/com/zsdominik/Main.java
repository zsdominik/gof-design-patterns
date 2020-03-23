package com.zsdominik;

import com.zsdominik.creational.builder.BuilderPatternCaller;
import com.zsdominik.creational.factory.FactoryPatternCaller;
import com.zsdominik.creational.prototype.PrototypePatternCaller;

public class Main {

    public static void main(String[] args) {

        /*
          Creational patterns
         */

        new BuilderPatternCaller().callExample();
        new FactoryPatternCaller().callExample();
        new PrototypePatternCaller().callExample();
    }
}
