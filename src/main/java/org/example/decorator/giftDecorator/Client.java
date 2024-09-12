package org.example.decorator.giftDecorator;

public class Client {
//    public static void main(String[] args) {
//        Gift gift = new Toy();
//        System.out.println("Simple Gift ");
//        System.out.println(gift.getCost());
//        System.out.println(gift.getDescription());
//
//        gift = new Box(gift);
//        System.out.println("Simple Gift with box");
//        System.out.println(gift.getCost());
//        System.out.println(gift.getDescription());
//
//        gift = new Ribbon(gift);
//        System.out.println("Final Gift ...");
//        System.out.println(gift.getCost());
//        System.out.println(gift.getDescription());
//    }

    public static void main(String[] args) {
        Gift gift = new Ribbon(
                            new CoverPaper(
                                    new Box(
                                            new Toy()
                                    )
                            )
                    );

        System.out.println(gift.getCost());
        System.out.println(gift.getDescription());
    }
}
