package kz.aitu.navigation;

import kz.aitu.navigation.strategy.BusStrategy;
import kz.aitu.navigation.strategy.CarStrategy;
import kz.aitu.navigation.strategy.CycleStrategy;
import kz.aitu.navigation.strategy.WalkStrategy;

public class Main {

    private static final double STRAIGHT_LINE_DISTANCE_KM = 8.0;

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.planRoute(STRAIGHT_LINE_DISTANCE_KM));

        navigator.setRouteStrategy(new WalkStrategy());
        System.out.println(navigator.planRoute(STRAIGHT_LINE_DISTANCE_KM));

        navigator.setRouteStrategy(new CycleStrategy());
        System.out.println(navigator.planRoute(STRAIGHT_LINE_DISTANCE_KM));

        navigator.setRouteStrategy(new BusStrategy());
        System.out.println(navigator.planRoute(STRAIGHT_LINE_DISTANCE_KM));
    }
}
