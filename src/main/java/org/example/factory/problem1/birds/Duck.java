package org.example.factory.problem1.birds;

import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.colors.Red;
import org.example.factory.problem1.sounds.DefaultSound;
import org.example.factory.problem1.sounds.Sound;

public class Duck implements Bird{
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
        return new DefaultSound();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
