package com.zsdominik.behavioral.factory.concrete;

import com.zsdominik.behavioral.factory.abstr.Burger;
import com.zsdominik.behavioral.factory.abstr.MeatType;

public class ChickenBurger extends Burger {
    public ChickenBurger() {
        super(MeatType.CHICKEN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Creating chicken burger");
    }
}
