package org.example.backup.factory.flutterProblem.components.dropdowns;

public class AndroidDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Android DropDown List shown");
    }

    @Override
    public void hideDropDown() {
        System.out.println("Android DropDown List hidden");
    }
}
