package org.example.backup.decorator.giftDecorator;

public class Toy implements Gift{

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return " Toy Car ";
    }
}
