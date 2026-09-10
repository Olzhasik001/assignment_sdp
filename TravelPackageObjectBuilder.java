public class TravelPackageObjectBuilder implements TravelPackageBuilder {
    private String destination,hotel,flight;
    private int nights;
    public TravelPackageObjectBuilder setDestination(String destination){
        this.destination=destination;
        return this;
    }
    public TravelPackageObjectBuilder setHotel(String hotel){
        this.hotel=hotel;
        return this;
    }
    public TravelPackageObjectBuilder setFlight(String flight) {
        this.flight = flight;
        return this;
    }
    public TravelPackageObjectBuilder setNights(int nights) {
        this.nights = nights;
        return this;
    }
    public TravelPackage getResult(){
        return new TravelPackage(destination,hotel,flight,nights);
    }
}
