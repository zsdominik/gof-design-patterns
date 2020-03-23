package com.zsdominik.creational.factory.factory;

import com.zsdominik.creational.factory.abstr.Burger;
import com.zsdominik.creational.factory.abstr.MeatType;
import com.zsdominik.creational.factory.concrete.BeefBurger;
import com.zsdominik.creational.factory.concrete.ChickenBurger;
import com.zsdominik.creational.factory.concrete.PorkBurger;

public class BurgerFactory {
    public static Burger createBurger(MeatType meatType) {
        Burger burger;
        switch (meatType) {
            case BEEF:
                burger = new BeefBurger();
                break;
            case PORK:
                burger = new PorkBurger();
                break;
            case CHICKEN:
                burger = new ChickenBurger();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return burger;
    }
}
