package org.example.decorator.giftDecorator;

// also an AddOn
public class Ribbon implements Gift {

    private Gift gift;

    public Ribbon(Gift gift) {
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return gift.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return gift.getDescription() + ", Beautiful Ribbon ";
    }
}
