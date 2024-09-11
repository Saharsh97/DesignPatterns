package org.example.strategy;

import org.example.strategy.pathFinders.PathCalculator;

public class GoogleMaps {
    public void findPath(String from, String to, ModeType mode){
        PathCalculator x = PathFactory.getPathCalByMode(mode);
        x.findPath(from, to);
    }

//    public void findTraffic(String from, String to, String mode){
//        PathFactory pathFactory = new PathFactory();
//        PathCalculator x = pathFactory.getPathCalByMode(mode);
//        x.
//    }
}
