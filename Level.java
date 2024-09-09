import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {

    private List<ParkingSpot> parkingSpots;
    private int levelId;
    private ParkingStrategy parkingStrategy;
    public Level(int levelId, int numOfParkingSpots, ParkingStrategy parkingStrategy) {
        this.levelId = levelId;
        this.parkingSpots = new ArrayList<>();
        this.parkingStrategy = parkingStrategy;
        for(int i = 0; i <= numOfParkingSpots; i++) {
            parkingSpots.add(new ParkingSpot(i, null));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        int parkingSpotNumber = this.parkingStrategy.getSpotNumber(parkingSpots);
        ParkingSpot spot = parkingSpots.get(parkingSpotNumber);
            if(spot.isSpotAvailable()) {
                spot.parkVehicle(vehicle);
                return true;
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
