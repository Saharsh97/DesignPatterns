package org.example.decorator.giftDecorator;

// base only!
public class Toy implements Gift {

    public Toy() {

    }

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Toy Car";
    }
}
