import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void addSpots(ParkingSpot spot) {
        spots.add(spot);
    }

}
