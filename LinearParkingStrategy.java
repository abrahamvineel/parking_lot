import java.util.List;

public class LinearParkingStrategy implements ParkingStrategy {

    @Override
    public int getSpotNumber(List<ParkingSpot> parkingSpots) {
        for(int i = 0; i < parkingSpots.size(); i++) {
            if(parkingSpots.get(i).isSpotAvailable()) {
                return i;
            }
        }
        return -1;
    }
}
