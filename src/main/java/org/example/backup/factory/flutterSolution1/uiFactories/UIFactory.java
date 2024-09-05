package org.example.backup.factory.flutterSolution1.uiFactories;

import org.example.backup.factory.flutterSolution1.components.buttons.Button;
import org.example.backup.factory.flutterSolution1.components.dropdowns.DropDown;
import org.example.backup.factory.flutterSolution1.components.message.Message;

public interface UIFactory {
    public Button createButton();

    public DropDown createDropDown();

    public Message createMessage();
}
