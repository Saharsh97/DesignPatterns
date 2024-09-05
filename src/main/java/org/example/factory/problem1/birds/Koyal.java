package org.example.factory.problem1.birds;

import org.example.factory.problem1.colors.Black;
import org.example.factory.problem1.colors.Blue;
import org.example.factory.problem1.colors.Color;
import org.example.factory.problem1.sounds.Koo;
import org.example.factory.problem1.sounds.Sound;

public class Koyal implements Bird{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

//    @Override
//    public void makeSound() {
//        System.out.println("kooooo koo");
//    }
//
//    @Override
//    public void showColor() {
//        System.out.println("black");
//    }

    @Override
    public Sound createSound() {
        return new Koo();
    }

    @Override
    public Color createColor() {
        return new Black();
    }


}
