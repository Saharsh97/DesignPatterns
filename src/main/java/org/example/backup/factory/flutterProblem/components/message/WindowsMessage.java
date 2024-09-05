package org.example.backup.factory.flutterProblem.components.message;

public class WindowsMessage implements Message {
    @Override
    public void writeText(String text) {
        System.out.println("Windows Message : " + text);
    }
}
