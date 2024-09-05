package org.example.backup.factory.flutterProblem.components.buttons;

public class WindowsButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Windows Button displayed");
    }

    @Override
    public void clickButton() {
        System.out.println("Windows Button clicked");
    }
}
