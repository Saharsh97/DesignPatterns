package org.example.backup.decorator.icecreamDecorator;

// can be base or a add-on
public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    public ChocolateCone() {}

    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) return 50;
        return iceCream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) return "Chocolate Cone";
        return iceCream.getDescription() + ", Chocolate Cone";
    }
}
