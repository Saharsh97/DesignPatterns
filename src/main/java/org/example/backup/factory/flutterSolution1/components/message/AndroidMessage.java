package org.example.backup.factory.flutterSolution1.components.message;

public class AndroidMessage implements Message{
    @Override
    public void writeText(String text) {
        System.out.println("Android Message " + text);
    }
}
