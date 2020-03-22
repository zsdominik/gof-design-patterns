package com.zsdominik.behavioral.factory.concrete;

import com.zsdominik.behavioral.factory.abstr.Burger;
import com.zsdominik.behavioral.factory.abstr.MeatType;

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
