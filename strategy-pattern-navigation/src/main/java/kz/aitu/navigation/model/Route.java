package kz.aitu.navigation.model;

public record Route(String transportMode, double distanceKm, double durationMinutes) {

    @Override
    public String toString() {
        return String.format("%s route: %.1f km, %.0f min", transportMode, distanceKm, durationMinutes);
    }
}
