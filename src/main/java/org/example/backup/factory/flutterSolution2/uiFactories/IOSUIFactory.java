package org.example.backup.factory.flutterSolution2.uiFactories;

import org.example.backup.factory.flutterSolution1.components.buttons.Button;
import org.example.backup.factory.flutterSolution1.components.buttons.IOSButton;
import org.example.backup.factory.flutterSolution1.components.dropdowns.DropDown;
import org.example.backup.factory.flutterSolution1.components.dropdowns.IOSDropDown;
import org.example.backup.factory.flutterSolution1.components.message.IOSMessage;
import org.example.backup.factory.flutterSolution1.components.message.Message;

public class IOSUIFactory implements UIFactory {
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
