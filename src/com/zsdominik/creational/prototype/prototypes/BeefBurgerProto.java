package com.zsdominik.creational.prototype.prototypes;

import java.text.SimpleDateFormat;
import java.util.List;

public class BeefBurgerProto implements PrototypeCapable {
    private List<String> toppings;
    private List<String> sauce;
    private String bun;
    private SimpleDateFormat dateFormat;

    public BeefBurgerProto() {
        // this is for demonstration purposes only. the difference between the a mass object creation is significant
        // only if there is another heavy object in the prototype. with this the cloning is much faster than new keyword
        dateFormat = new SimpleDateFormat();
    }

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
        return (BeefBurgerProto) super.clone();
    }
}
