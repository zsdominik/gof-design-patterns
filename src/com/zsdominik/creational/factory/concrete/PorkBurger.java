package com.zsdominik.creational.factory.concrete;

import com.zsdominik.creational.factory.abstr.Burger;
import com.zsdominik.creational.factory.abstr.MeatType;

public class PorkBurger extends Burger {
    public PorkBurger() {
        super(MeatType.PORK);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Creating pork burger");
    }
}
