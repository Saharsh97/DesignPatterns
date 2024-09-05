package org.example.factory.flutterSolution.factories;

import org.example.factory.flutterSolution.components.buttons.Button;
import org.example.factory.flutterSolution.components.buttons.LinuxButton;
import org.example.factory.flutterSolution.components.dropdowns.DropDown;
import org.example.factory.flutterSolution.components.dropdowns.LinuxDropDown;
import org.example.factory.flutterSolution.components.message.LinuxMessage;
import org.example.factory.flutterSolution.components.message.Message;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public DropDown createDropDown() {
        return new LinuxDropDown();
    }

    @Override
    public Message createMessage() {
        return new LinuxMessage();
    }
}
