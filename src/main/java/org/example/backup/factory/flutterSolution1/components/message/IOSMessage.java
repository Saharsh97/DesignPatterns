package org.example.backup.factory.flutterSolution1.components.message;

public class IOSMessage implements Message{
    @Override
    public void writeText(String text) {
        System.out.println("IOS Message : " + text);
    }
}
