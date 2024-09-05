package org.example.factory.flutterSolution.factories;

import org.example.factory.flutterSolution.components.buttons.Button;
import org.example.factory.flutterSolution.components.dropdowns.DropDown;
import org.example.factory.flutterSolution.components.message.Message;

// contains all the factory methods for the UI => UIFactory
public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Message createMessage();
}
