# Travel Package Builder

Java implementation of the **Builder** design pattern.

The same building steps (destination, hotel, flight, nights) are used to
produce two different representations of a travel package:
1. A `TravelPackage` object (immutable data model)
2. A text `Itinerary` (human-readable trip summary)

## Structure

- `TravelPackage` — immutable product; created only through a builder,
  validates required fields (`destination`, `nights`) in its constructor
- `TravelPackageBuilder` — builder interface with fluent (chainable) steps:
  `setDestination`, `setHotel`, `setFlight`, `setNights`
- `TravelPackageObjectBuilder` — concrete builder that produces a
  `TravelPackage` object
- `ItineraryBuilder` — concrete builder that produces a text itinerary
  (`String`)
- `TravelPackageDirector` — reusable configurations built on top of the
  builder interface: `makeBeachVacation()` and `makeAdventureTrip()`
- `Main` — client code demonstrating both directors' recipes through both
  builders

## How it works

The `Director` only depends on the `TravelPackageBuilder` interface, so the
exact same sequence of steps can be replayed on any concrete builder to get
a different kind of output:

```java
TravelPackageDirector director = new TravelPackageDirector();

TravelPackageObjectBuilder objBuilder = new TravelPackageObjectBuilder();
director.makeBeachVacation(objBuilder);
TravelPackage pkg = objBuilder.getResult();       

ItineraryBuilder itineraryBuilder = new ItineraryBuilder();
director.makeBeachVacation(itineraryBuilder);
String itinerary = itineraryBuilder.getResult();  
```

## Run

```bash
javac *.java
java Main
```

## Sample output

```
TravelPackage[Bali,7nights,Beach Resort 5*,Direct,Business]
=== Travel Itinerary ===
Destination:Bali
Hotel:Beach Resort 5*
Flight:Direct,Business
Nights:7

TravelPackage[Seoul, South Korea,5nights,Myeongdong City Hotel,Direct, Economy]
=== Travel Itinerary ===
Destination:Seoul, South Korea
Hotel:Myeongdong City Hotel
Flight:Direct, Economy
Nights:5
```
