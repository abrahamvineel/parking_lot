import java.util.List;

public class OddEvenParkingStrategy implements ParkingStrategy {
    private static boolean isEven = true;
    @Override
    public int getSpotNumber(List<ParkingSpot> parkingSpots) {
        for (int i = 0; i < parkingSpots.size(); i++) {
            if(isEven && parkingSpots.get(i).isSpotAvailable()) {
                isEven = false;
                return i;
            } else if (!isEven && parkingSpots.get(i).isSpotAvailable()) {
                isEven = true;
                return i;
            }
        }
        return -1;
    }
}
