package kz.aitu.navigation.strategy;

import kz.aitu.navigation.model.Route;

public class CarStrategy implements RouteStrategy {

    private static final double ROAD_DISTANCE_FACTOR = 1.3;
    private static final double AVERAGE_SPEED_KMH = 50.0;

    @Override
    public Route buildRoute(double straightLineDistanceKm) {
        double distanceKm = straightLineDistanceKm * ROAD_DISTANCE_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * 60.0;
        return new Route("Car", distanceKm, durationMinutes);
    }
}
