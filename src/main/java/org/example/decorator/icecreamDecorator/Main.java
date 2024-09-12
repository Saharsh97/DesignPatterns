package org.example.decorator.icecreamDecorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateCone();
        iceCream = new VanillaScoop(iceCream);
        iceCream = new ChocolateCone(iceCream);
        iceCream = new StrawberryScoop(iceCream);
        iceCream = new ChocolateCone(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
