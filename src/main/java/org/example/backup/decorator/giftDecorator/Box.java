package org.example.backup.decorator.giftDecorator;

public class Box implements Gift{

    private Gift gift;

    public Box(Gift gift) {
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return gift.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return gift.getDescription() + " Cardboard box ";
    }
}