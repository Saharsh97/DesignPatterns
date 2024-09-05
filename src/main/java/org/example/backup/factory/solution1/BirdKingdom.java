package org.example.backup.factory.solution1;

import org.example.backup.factory.solution1.birds.Bird;
import org.example.backup.factory.solution1.birds.Crow;
import org.example.backup.factory.solution1.birds.Pigeon;
import org.example.backup.factory.solution1.birds.Sparrow;
import org.example.backup.factory.solution1.sounds.CrowSound;
import org.example.backup.factory.solution1.sounds.PigeonSound;
import org.example.backup.factory.solution1.sounds.Sound;
import org.example.backup.factory.solution1.sounds.SparrowSound;

public class BirdKingdom {

    public void makeGivenBirdFly(Bird bird){
        bird.fly();
    }

    public void makeGivenBirdSleep(Bird bird){
        bird.sleep();
    }

    public void makeGivenBirdMakeSound(Bird bird){
        Sound sound = bird.createSound();
        sound.makeSound();
    }
}
