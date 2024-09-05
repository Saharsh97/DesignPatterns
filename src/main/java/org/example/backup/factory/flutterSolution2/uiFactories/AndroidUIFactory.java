package org.example.backup.factory.flutterSolution2.uiFactories;

import org.example.backup.factory.flutterSolution1.components.buttons.AndroidButton;
import org.example.backup.factory.flutterSolution1.components.buttons.Button;
import org.example.backup.factory.flutterSolution1.components.dropdowns.AndroidDropDown;
import org.example.backup.factory.flutterSolution1.components.dropdowns.DropDown;
import org.example.backup.factory.flutterSolution1.components.message.AndroidMessage;
import org.example.backup.factory.flutterSolution1.components.message.Message;

public class AndroidUIFactory implements UIFactory {

    @Override
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
