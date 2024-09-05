package org.example.factory.flutterSolution.factories;

import org.example.factory.flutterSolution.components.buttons.Button;
import org.example.factory.flutterSolution.components.buttons.WindowsButton;
import org.example.factory.flutterSolution.components.dropdowns.DropDown;
import org.example.factory.flutterSolution.components.dropdowns.WindowDropDown;
import org.example.factory.flutterSolution.components.message.Message;
import org.example.factory.flutterSolution.components.message.WindowsMessage;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowDropDown();
    }

    @Override
    public Message createMessage() {
        return new WindowsMessage();
    }
}
