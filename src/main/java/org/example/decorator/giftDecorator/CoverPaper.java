package org.example.decorator.giftDecorator;

// also an AddOn
public class CoverPaper implements Gift {

    private Gift gift;

    public CoverPaper(Gift gift) {
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return gift.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return gift.getDescription() + ", Red Cover Paper";
    }
}
