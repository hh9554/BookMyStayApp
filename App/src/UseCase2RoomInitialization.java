public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Using static variables as per UC2 requirements
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("--- HOTEL ROOM INITIALIZATION ---");

        System.out.println("Single Room:");
        single.displayRoomInfo();
        System.out.println("Available: " + singleAvailable + "\n");

        System.out.println("Double Room:");
        doubleRoom.displayRoomInfo();
        System.out.println("Available: " + doubleAvailable + "\n");

        System.out.println("Suite Room:");
        suite.displayRoomInfo();
        System.out.println("Available: " + suiteAvailable);
    }
}