package com.zsdominik.behavioral.factory.factory;

import com.zsdominik.behavioral.factory.abstr.Burger;
import com.zsdominik.behavioral.factory.abstr.MeatType;
import com.zsdominik.behavioral.factory.concrete.BeefBurger;
import com.zsdominik.behavioral.factory.concrete.ChickenBurger;
import com.zsdominik.behavioral.factory.concrete.PorkBurger;

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
