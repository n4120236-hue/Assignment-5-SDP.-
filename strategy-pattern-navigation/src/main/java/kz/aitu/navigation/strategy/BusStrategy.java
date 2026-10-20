package kz.aitu.navigation.strategy;

import kz.aitu.navigation.model.Route;

public class BusStrategy implements RouteStrategy {

    private static final double ROAD_DISTANCE_FACTOR = 1.2;
    private static final double AVERAGE_SPEED_KMH = 25.0;
    private static final double WAITING_TIME_MINUTES = 10.0;

    @Override
    public Route buildRoute(double straightLineDistanceKm) {
        double distanceKm = straightLineDistanceKm * ROAD_DISTANCE_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * 60.0 + WAITING_TIME_MINUTES;
        return new Route("Bus", distanceKm, durationMinutes);
    }
}
