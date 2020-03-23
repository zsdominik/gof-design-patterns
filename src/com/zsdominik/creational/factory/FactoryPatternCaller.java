package com.zsdominik.creational.factory;

import com.zsdominik.creational.factory.abstr.MeatType;
import com.zsdominik.creational.factory.factory.BurgerFactory;
import com.zsdominik.caller.PatternCaller;

public class FactoryPatternCaller implements PatternCaller {
    @Override
    public void callExample() {
        BurgerFactory.createBurger(MeatType.BEEF);
        BurgerFactory.createBurger(MeatType.CHICKEN);
        BurgerFactory.createBurger(MeatType.PORK);
    }
}
