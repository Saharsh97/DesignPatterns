package org.example.backup.factory.problem1;

import org.example.backup.factory.problem1.birds.Bird;
import org.example.backup.factory.problem1.birds.Crow;
import org.example.backup.factory.problem1.birds.Pigeon;
import org.example.backup.factory.problem1.birds.Sparrow;
import org.example.backup.factory.problem1.sounds.CrowSound;
import org.example.backup.factory.problem1.sounds.PigeonSound;
import org.example.backup.factory.problem1.sounds.SparrowSound;

public class BirdKingdom {

    public void makeGivenBirdFly(Bird bird){
        bird.fly();
    }

    public void makeGivenBirdSleep(Bird bird){
        bird.sleep();
    }

    public void makeGivenBirdMakeSound(Bird bird){
        if(bird instanceof Pigeon){
            new PigeonSound();
        }
        if(bird instanceof Sparrow){
            new SparrowSound();
        }
        if(bird instanceof Crow){
            new CrowSound();
        }
    }
}
