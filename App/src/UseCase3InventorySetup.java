public class UseCase3InventorySetup {
    public static void main(String[] args) {
        // Initialize the centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Creating room objects (from UC2)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Registering rooms into the HashMap
        inventory.registerRoomType("Single", 5);
        inventory.registerRoomType("Double", 3);
        inventory.registerRoomType("Suite", 2);

        System.out.println("--- Use Case 3: Centralized Inventory (Refactored) ---");

        System.out.println("Single Room:");
        single.displayRoomInfo();
        System.out.println("Available Rooms: " + inventory.getAvailableCount("Single") + "\n");

        System.out.println("Double Room:");
        doubleRoom.displayRoomInfo();
        System.out.println("Available Rooms: " + inventory.getAvailableCount("Double") + "\n");
    }
}