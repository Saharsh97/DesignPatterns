package org.example.backup.decorator.icecreamDecorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new Cherry(
                                    new ChocoChips(
                                            new VanillaScoop(
                                                    new ChocolateCone(
                                                            new StrawberryScoop(
                                                                    new ChocolateCone()
                                                            )
                                                    )
                                            )
                                    )
                            );
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
