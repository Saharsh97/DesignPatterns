package org.example.decorator.icecreamDecorator;

// add-on
public class ChocoChips implements IceCream {

    private IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco Chips";
    }
}
