package org.example.decorator.icecreamDecorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new Cherry(
                                    new ChocoChips(
                                            new VanillaScoop(
                                                    new ChocolateCone(
                                                            new StrawberryScoop(
                                                                    new NormalCone()
                                                            )
                                                    )
                                            )
                                    )
                            );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
