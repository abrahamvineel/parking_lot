import exception.SpotNotAvailableException;
import model.Vehicle;

public class ParkingSpot {
    private final int spotNumber;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, Vehicle parkedVehicle) {
        this.spotNumber = spotNumber;
        this.parkedVehicle = parkedVehicle;
    }

    public boolean isSpotAvailable() {
        return parkedVehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        if(!isSpotAvailable()) {
            throw new SpotNotAvailableException("Vehicle spot already occupied");
        } else {
            parkedVehicle = vehicle;
        }
    }

    public void unparkVehicle() {
        this.parkedVehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
