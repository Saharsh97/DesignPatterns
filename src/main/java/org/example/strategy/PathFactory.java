package org.example.strategy;

import org.example.strategy.pathFinders.BikePathCal;
import org.example.strategy.pathFinders.CarPathCal;
import org.example.strategy.pathFinders.PathCalculator;
import org.example.strategy.pathFinders.TrainPathCal;

public class PathFactory {

    public static PathCalculator getPathCalByMode(ModeType mode){
        if(mode.equals(ModeType.CAR)){
            return CarPathCal.getInstance();
        }
        if(mode.equals(ModeType.BIKE)){
            return BikePathCal.getInstance();
        }
        if(mode.equals(ModeType.TRAIN)){
            return TrainPathCal.getInstance();
        }
        return null;
    }
}
