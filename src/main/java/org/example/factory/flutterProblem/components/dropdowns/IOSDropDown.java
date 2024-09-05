package org.example.factory.flutterProblem.components.dropdowns;

public class IOSDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("IOS DropDown List shown");
    }

    @Override
    public void hideDropDown() {
        System.out.println("IOS DropDown List hidden");
    }
}
