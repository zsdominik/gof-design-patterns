package com.zsdominik.behavioral.factory.concrete;

import com.zsdominik.behavioral.factory.abstr.Burger;
import com.zsdominik.behavioral.factory.abstr.MeatType;

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
