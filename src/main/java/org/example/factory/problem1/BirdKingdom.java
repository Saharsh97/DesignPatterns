package org.example.factory.problem1;

import org.example.factory.problem1.birds.*;
import org.example.factory.problem1.colors.Black;
import org.example.factory.problem1.colors.Blue;
import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.colors.Red;
import org.example.factory.problem1.sounds.*;

public class BirdKingdom {

    public void makeGivenBirdFly(Bird bird){
        bird.fly();
    }

    public void makeGivenBirdSleep(Bird bird){
        bird.sleep();
    }

    // this methods tries to connect Birds with their Corresponding Sounds
    public void makeGivenBirdMakeSound(Bird bird){
        Sound sound = bird.createSound();
        sound.makeSound();

        //
    }

    public void getColorOfAGivenBird(Bird bird){
        Color color = bird.createColor();
        color.showColor();
    }
}
