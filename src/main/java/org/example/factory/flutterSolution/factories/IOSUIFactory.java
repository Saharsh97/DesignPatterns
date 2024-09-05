package org.example.factory.flutterSolution.factories;

import org.example.factory.flutterSolution.components.buttons.Button;
import org.example.factory.flutterSolution.components.buttons.IOSButton;
import org.example.factory.flutterSolution.components.dropdowns.DropDown;
import org.example.factory.flutterSolution.components.dropdowns.IOSDropDown;
import org.example.factory.flutterSolution.components.message.IOSMessage;
import org.example.factory.flutterSolution.components.message.Message;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Message createMessage() {
        return new IOSMessage();
    }
}
