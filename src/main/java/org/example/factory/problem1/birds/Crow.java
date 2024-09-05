package org.example.factory.problem1.birds;

import org.example.factory.problem1.colors.Black;
import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.sounds.CrowSound;
import org.example.factory.problem1.sounds.Sound;

public class Crow implements Bird {
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
        return new CrowSound();
    }

    @Override
    public Color createColor() {
        return new Black();
    }
}
