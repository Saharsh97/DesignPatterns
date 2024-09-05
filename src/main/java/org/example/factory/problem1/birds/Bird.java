package org.example.factory.problem1.birds;

import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.sounds.Sound;

public interface Bird {
    void eat();
    void sleep();
    void fly();
    // these two methods are giving the
    // corresponding implemented objects
    // factory methods!
    // Factory method: I will give you back a corresponding object!
    Sound createSound();
    Color createColor();

    // DRY : dont repeat yourself!
//    void makeSound();
//    void showColor();
}
