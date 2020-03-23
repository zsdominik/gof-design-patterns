package com.zsdominik.creational.builder;

import java.util.List;

public class Burger {

    // Burger attributes
    private String meatType; // required
    private List<String> toppings;
    private List<String> sauce;
    private String bun; // required

    public Burger(BurgerBuilder burgerBuilder) {
        this.meatType = burgerBuilder.meatType;
        this.toppings = burgerBuilder.toppings;
        this.sauce = burgerBuilder.sauce;
        this.bun = burgerBuilder.bun;
    }

    // Getters only to guarantee immutability
    public String getMeatType() {
        return meatType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public String getBun() {
        return bun;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "meatType='" + meatType + '\'' +
                ", toppings=" + toppings +
                ", sauce=" + sauce +
                ", bun='" + bun + '\'' +
                '}';
    }

    public static class BurgerBuilder {

        // Burger attributes
        private String meatType; // required
        private List<String> toppings;
        private List<String> sauce;
        private String bun; // required

        public BurgerBuilder(String meatType, String bun) {
            this.meatType = meatType;
            this.bun = bun;
        }

        public BurgerBuilder toppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder sauce(List<String> sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return validateBurger(new Burger(this));
        }

        private Burger validateBurger(Burger burger) {
            //TODO do building validation steps
            return burger;
        }
    }
}
