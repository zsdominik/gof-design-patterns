package com.zsdominik.creational.factory.abstr;

public abstract class Burger {

    // Burger attributes
    private MeatType meatType;

    public Burger(MeatType meatType) {
        this.meatType = meatType;
        doSomeCustomConstructionLogic();
    }

    protected void doSomeCustomConstructionLogic() {
        // TODO
    }

    protected abstract void construct();

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }
}
