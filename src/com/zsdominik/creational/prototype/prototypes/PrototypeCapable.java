package com.zsdominik.creational.prototype.prototypes;

public interface PrototypeCapable extends Cloneable {

    PrototypeCapable clone() throws CloneNotSupportedException;

}
