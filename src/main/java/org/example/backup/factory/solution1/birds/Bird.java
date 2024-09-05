package org.example.backup.factory.solution1.birds;

import org.example.backup.factory.solution1.sounds.Sound;

public interface Bird {
    void eat();
    void sleep();
    void fly();
    Sound createSound();
}
