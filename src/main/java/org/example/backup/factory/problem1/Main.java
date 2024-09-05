package org.example.backup.factory.problem1;

import org.example.backup.factory.problem1.birds.Crow;
import org.example.backup.factory.problem1.birds.Pigeon;
import org.example.backup.factory.problem1.birds.Sparrow;
import org.example.backup.factory.problem1.sounds.CrowSound;
import org.example.backup.factory.problem1.sounds.PigeonSound;
import org.example.backup.factory.problem1.sounds.Sound;
import org.example.backup.factory.problem1.sounds.SparrowSound;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // someone is using Sound specifically.
        // hence, cannot keep Sound inside Bird
        List<Sound> soundsList = new ArrayList<>();
        soundsList.add(new PigeonSound());
        soundsList.add(new CrowSound());
        soundsList.add(new SparrowSound());

        Pigeon pigeon = new Pigeon();
        Sparrow sparrow = new Sparrow();
        Crow crow = new Crow();

        BirdKingdom birdKingdom = new BirdKingdom();
        birdKingdom.makeGivenBirdMakeSound(pigeon);
        birdKingdom.makeGivenBirdMakeSound(sparrow);
    }
}
