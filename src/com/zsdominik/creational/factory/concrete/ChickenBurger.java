package com.zsdominik.creational.factory.concrete;

import com.zsdominik.creational.factory.abstr.Burger;
import com.zsdominik.creational.factory.abstr.MeatType;

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
