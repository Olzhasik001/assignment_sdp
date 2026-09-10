public class Main {
    public static void main(String[] args) {
        TravelPackageDirector director = new TravelPackageDirector();
        TravelPackageObjectBuilder objBuilder = new TravelPackageObjectBuilder();
        director.makeBeachVacation(objBuilder);
        TravelPackage pkg = objBuilder.getResult();
        ItineraryBuilder ItineraryBuilder = new ItineraryBuilder();
        director.makeBeachVacation(ItineraryBuilder);
        String itineraryText = ItineraryBuilder.getResult();
        System.out.println(pkg);
        System.out.println(itineraryText);

        TravelPackageObjectBuilder objBuilder2 = new TravelPackageObjectBuilder();
        director.makeAdventureTrip(objBuilder2);
        TravelPackage pkg2 = objBuilder2.getResult();
        ItineraryBuilder ItineraryBuilder2 = new ItineraryBuilder();
        director.makeAdventureTrip(ItineraryBuilder2);
        String itineraryText2 = ItineraryBuilder2.getResult();
        System.out.println(pkg2);
        System.out.println(itineraryText2);
    }
}
