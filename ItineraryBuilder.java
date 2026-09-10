public class ItineraryBuilder implements TravelPackageBuilder {
    private final StringBuilder sb = new StringBuilder("=== Travel Itinerary ===\n");
    public ItineraryBuilder setDestination(String destination){
        sb.append("Destination:").append(destination).append("\n");
        return this;
    }
    public ItineraryBuilder setHotel(String hotel){
        sb.append("Hotel:").append(hotel).append("\n");
        return this;
    }
    public ItineraryBuilder setFlight(String flight){
        sb.append("Flight:").append(flight).append("\n");
        return this;
    }
    public ItineraryBuilder setNights(int nights){
        sb.append("Nights:").append(nights).append("\n");
        return this;
    }
    public String getResult(){
        return sb.toString();
    }
}
