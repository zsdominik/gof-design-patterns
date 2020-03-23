package com.zsdominik.creational.factory.concrete;

import com.zsdominik.creational.factory.abstr.Burger;
import com.zsdominik.creational.factory.abstr.MeatType;

public class BeefBurger extends Burger {
    public BeefBurger() {
        super(MeatType.BEEF);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Creating beef burger");
    }
}
