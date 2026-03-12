public abstract class Room {
    private int beds;
    private int sizeSqft;
    private double pricePerNight;

    public Room(int beds, int sizeSqft, double pricePerNight) {
        this.beds = beds;
        this.sizeSqft = sizeSqft;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomInfo() {
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + sizeSqft + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}