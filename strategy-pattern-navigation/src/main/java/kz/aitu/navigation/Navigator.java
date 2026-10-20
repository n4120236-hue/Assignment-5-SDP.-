package kz.aitu.navigation;

import kz.aitu.navigation.model.Route;
import kz.aitu.navigation.strategy.RouteStrategy;

import java.util.Objects;

public class Navigator {

    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        setRouteStrategy(routeStrategy);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = Objects.requireNonNull(routeStrategy, "routeStrategy must not be null");
    }

    public Route planRoute(double straightLineDistanceKm) {
        return routeStrategy.buildRoute(straightLineDistanceKm);
    }
}
