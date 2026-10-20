package kz.aitu.navigation.strategy;

import kz.aitu.navigation.model.Route;

public class CycleStrategy implements RouteStrategy {

    private static final double BIKE_LANE_DISTANCE_FACTOR = 1.2;
    private static final double AVERAGE_SPEED_KMH = 15.0;

    @Override
    public Route buildRoute(double straightLineDistanceKm) {
        double distanceKm = straightLineDistanceKm * BIKE_LANE_DISTANCE_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * 60.0;
        return new Route("Cycling", distanceKm, durationMinutes);
    }
}
