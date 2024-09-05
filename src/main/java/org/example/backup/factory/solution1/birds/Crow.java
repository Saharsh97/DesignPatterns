package org.example.backup.factory.solution1.birds;

import org.example.backup.factory.solution1.sounds.CrowSound;
import org.example.backup.factory.solution1.sounds.Sound;

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
}
