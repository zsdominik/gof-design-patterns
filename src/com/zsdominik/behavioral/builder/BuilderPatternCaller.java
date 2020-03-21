package com.zsdominik.behavioral.builder;

import com.zsdominik.caller.PatternCaller;

import java.util.List;

public class BuilderPatternCaller implements PatternCaller {
    @Override
    public void callExample() {
        Burger burger = new Burger.BurgerBuilder("Beef", "Whole grain")
                    .sauce(List.of("Ketchup", "Mustard", "Chili"))
                    .toppings(List.of("Salad", "Tomato", "Onion"))
                    .build();

        System.out.println("Burger is built using builder: " + burger.toString());
    }
}
