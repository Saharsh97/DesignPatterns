package org.example.decorator.icecreamDecorator;

// can be base or a add-on
public class ChocolateCone implements IceCream {

    private IceCream iceCream;

    public ChocolateCone() {}   // for base

    public ChocolateCone(IceCream iceCream){    // like a addon
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) return 50; // if this cone is a base
        return iceCream.getCost() + 50; // if this cone is a add-on
    }

    @Override
    public String getDescription() {
        if(iceCream == null) return "Chocolate Cone";
        return iceCream.getDescription() + ", Chocolate Cone";
    }
}
