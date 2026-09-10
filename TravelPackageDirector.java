public class TravelPackageDirector {
    public void makeBeachVacation(TravelPackageBuilder b){
        b.setDestination("Bali").setHotel("Beach Resort 5*").setFlight("Direct,Business").setNights(7);
    }
    public void makeAdventureTrip(TravelPackageBuilder b) {
        b.setDestination("Seoul, South Korea").setHotel("Myeongdong City Hotel").setFlight("Direct, Economy").setNights(5);
    }
}
