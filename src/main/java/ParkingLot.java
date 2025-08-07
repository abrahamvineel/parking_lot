
public class ParkingLot {

    private static ParkingLot instance;
    private ParkingLot() {}
    public static ParkingLot getInstance() {
        if (instance == null) {
            return new ParkingLot();
        }
        return instance;
    }
}
