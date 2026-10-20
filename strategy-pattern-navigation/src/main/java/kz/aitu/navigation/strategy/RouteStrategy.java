package kz.aitu.navigation.strategy;

import kz.aitu.navigation.model.Route;

public interface RouteStrategy {

    Route buildRoute(double straightLineDistanceKm);
}
