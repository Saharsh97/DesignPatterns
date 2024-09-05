package org.example.backup.factory.flutterSolution2.components.message;

public class WindowsMessage implements Message {
    @Override
    public void writeText(String text) {
        System.out.println("Windows Message : " + text);
    }
}
