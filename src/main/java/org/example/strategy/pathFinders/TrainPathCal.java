package org.example.strategy.pathFinders;

public class TrainPathCal implements PathCalculator{
    private static TrainPathCal INSTANCE = new TrainPathCal();
    private TrainPathCal() {}
    public static TrainPathCal getInstance() {
        return INSTANCE;
    }

    @Override
    public void findPath(String from, String to) {
        System.out.println("Take Rajdhani express from " + from + " to " + to);
    }
}
