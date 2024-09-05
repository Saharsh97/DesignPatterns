package org.example.backup.factory.flutterSolution2.uiFactories;

import org.example.backup.factory.flutterSolution1.components.buttons.Button;
import org.example.backup.factory.flutterSolution1.components.buttons.WindowsButton;
import org.example.backup.factory.flutterSolution1.components.dropdowns.DropDown;
import org.example.backup.factory.flutterSolution1.components.dropdowns.WindowDropDown;
import org.example.backup.factory.flutterSolution1.components.message.Message;
import org.example.backup.factory.flutterSolution1.components.message.WindowsMessage;

public class WindowsUIFactory implements UIFactory {
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
