package org.example.backup.decorator.icecreamDecorator;

public class OrangeScoop implements IceCream{

    private IceCream iceCream;

    public OrangeScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Orange Scoop";
    }
}
