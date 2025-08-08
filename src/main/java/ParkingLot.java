
public class ParkingLot {

    private static ParkingLot instance;
    private ParkingLot() {}
    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }
}
