package org.example.factory.flutterProblem.components.buttons;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Android Button displayed");
    }

    @Override
    public void clickButton() {
        System.out.println("Android Button clicked");
    }
}
