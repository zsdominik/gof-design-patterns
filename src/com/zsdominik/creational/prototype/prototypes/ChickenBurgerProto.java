package com.zsdominik.creational.prototype.prototypes;

import java.util.List;

public class ChickenBurgerProto implements PrototypeCapable {
    private List<String> toppings;
    private List<String> sauce;
    private String bun;

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public void setSauce(List<String> sauce) {
        this.sauce = sauce;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (ChickenBurgerProto) super.clone();
    }
}
