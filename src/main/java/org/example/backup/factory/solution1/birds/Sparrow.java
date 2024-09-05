package org.example.backup.factory.solution1.birds;

import org.example.backup.factory.solution1.sounds.Sound;
import org.example.backup.factory.solution1.sounds.SparrowSound;

public class Sparrow implements Bird {
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
        return new SparrowSound();
    }
}
