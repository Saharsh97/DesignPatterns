package org.example.factory.flutterSolution.components.dropdowns;


public class WindowDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Windows DropDown List shown");

    }

    @Override
    public void hideDropDown() {
        System.out.println("Windows DropDown List hidden");
    }
}
