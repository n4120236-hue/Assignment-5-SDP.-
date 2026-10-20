package kz.aitu.navigation.strategy;

import kz.aitu.navigation.model.Route;

public class WalkStrategy implements RouteStrategy {

    private static final double PEDESTRIAN_DISTANCE_FACTOR = 1.1;
    private static final double AVERAGE_SPEED_KMH = 5.0;

    @Override
    public Route buildRoute(double straightLineDistanceKm) {
        double distanceKm = straightLineDistanceKm * PEDESTRIAN_DISTANCE_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * 60.0;
        return new Route("Walking", distanceKm, durationMinutes);
    }
}
