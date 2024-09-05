package org.example.factory.problem1.birds;

import org.example.factory.problem1.colors.Blue;
import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.sounds.PigeonSound;
import org.example.factory.problem1.sounds.Sound;

public class Pigeon implements Bird {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public Sound createSound() {
        return new PigeonSound();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
