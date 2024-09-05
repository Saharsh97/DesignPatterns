package org.example.backup.factory.solution1.birds;

import org.example.backup.factory.solution1.sounds.PigeonSound;
import org.example.backup.factory.solution1.sounds.Sound;

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
}
