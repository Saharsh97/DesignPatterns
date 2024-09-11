package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Mumbai", "Delhi", ModeType.CAR);
    }
}
