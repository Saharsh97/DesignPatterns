package org.example.factory.flutterSolution.components.message;


public class AndroidMessage implements Message {
    @Override
    public void writeText(String text) {
        System.out.println("Android Message " + text);
    }
}
