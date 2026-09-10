public class TravelPackage {
    private final String destination;
    private final String hotel;
    private final String flight;
    private final int nights;

    TravelPackage(String destination,String hotel,String flight,int nights){
        if(destination == null || nights <= 0) {
            throw new IllegalStateException("Destination and nights are required");
        }
        this.destination=destination;
        this.hotel=hotel;
        this.flight=flight;
        this.nights=nights;

    }

    @Override
    public String toString() {
        return "TravelPackage[" + destination + "," + nights + "nights," + hotel + "," + flight + "]";
    }
}
