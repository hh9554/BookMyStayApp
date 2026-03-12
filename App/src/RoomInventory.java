import java.util.HashMap;
import java.util.Map;

/**
 * Use Case 3: Centralized Room Inventory Management
 * Manages room availability using a HashMap.
 */
public class RoomInventory {
    // Maps Room Type Name -> Available Count
    private Map<String, Integer> inventory = new HashMap<>();

    /**
     * Registers a room type with its initial availability.
     */
    public void registerRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    /**
     * Retrieves the current available count for a specific room type.
     */
    public int getAvailableCount(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
}