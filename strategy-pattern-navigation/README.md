# Strategy Pattern - Navigation / Route Planning

Course: ShP-2216 Software Design Patterns - Assignment #5
Author: Yershadi Nurassyl, group SE-2523
Language: Java 17

## Idea

`Navigator` (Context) plans a route through a `RouteStrategy`. Each transport mode is a separate
concrete strategy, so the Context contains no `if` / `switch` on the transport type, and the
strategy can be replaced at runtime.

## Structure

```
src/main/java/kz/aitu/navigation
|-- Main.java                      Client
|-- Navigator.java                 Context
|-- model/Route.java               Result of planning
`-- strategy
    |-- RouteStrategy.java         Strategy interface
    |-- CarStrategy.java
    |-- WalkStrategy.java
    |-- CycleStrategy.java
    `-- BusStrategy.java
```

## Build and run

```
mkdir out
javac -d out $(find src -name "*.java")
java -cp out kz.aitu.navigation.Main
```

On Windows PowerShell:

```
mkdir out
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
java -cp out kz.aitu.navigation.Main
```

Or open the folder in IntelliJ IDEA (JDK 17) and run `Main`.

## Expected output

```
Car route: 10.4 km, 12 min
Walking route: 8.8 km, 106 min
Cycling route: 9.6 km, 38 min
Bus route: 9.6 km, 33 min
```

## How to add a new strategy

1. Create a class in `kz.aitu.navigation.strategy` that implements `RouteStrategy`.
2. Implement `buildRoute(double straightLineDistanceKm)` and return a `Route`.
3. In the client pass it to the navigator: `navigator.setRouteStrategy(new YourStrategy());`

`Navigator`, `RouteStrategy` and the existing strategies are not modified.
