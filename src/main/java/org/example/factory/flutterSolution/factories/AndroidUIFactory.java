package org.example.factory.flutterSolution.factories;

import org.example.factory.flutterSolution.components.buttons.AndroidButton;
import org.example.factory.flutterSolution.components.buttons.Button;
import org.example.factory.flutterSolution.components.dropdowns.AndroidDropDown;
import org.example.factory.flutterSolution.components.dropdowns.DropDown;
import org.example.factory.flutterSolution.components.message.AndroidMessage;
import org.example.factory.flutterSolution.components.message.Message;

public class AndroidUIFactory implements UIFactory{

    @Override
    // this is a factory method
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Message createMessage() {
        return new AndroidMessage();
    }
}
