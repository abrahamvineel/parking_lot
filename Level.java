import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {

    private List<ParkingSpot> parkingSpots;
    private int levelId;
    public Level(int levelId, int numOfParkingSpots) {
        this.levelId = levelId;
        this.parkingSpots = new ArrayList<>(numOfParkingSpots);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if(spot.isSpotAvailable()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot : parkingSpots) {
            if(!spot.isSpotAvailable()) {
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
}
