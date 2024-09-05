package org.example.factory.flutterSolution.components.buttons;


public class IOSButton implements Button {
    @Override
    public void showButton() {
        System.out.println("IOS Button displayed");

    }

    @Override
    public void clickButton() {
        System.out.println("IOS Button clicked");

    }
}
