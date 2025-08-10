
import java.util.List;

public class ParkingLot {

    private static ParkingLot instance;
    private ParkingLot() {}
    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    private List<ParkingFloor> floors;

    public List<ParkingFloor> getParkingFloor() {
        return floors;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        floors.add(parkingFloor);
    }

    public void parkVehicle(Vehicle vehicle) {
        for(ParkingFloor floor : floors) {
            if(floor.canParkVechicle(vehicle)) {
                floor.parkVehicle(vehicle);
            }
        }
    }

    public void unParkVehicle(Vehicle vehicle) {
        int floorId = getVehicleFloorId(vehicle);
        ParkingFloor floor = floors.get(floorId);
        floor.unParkVehicle(vehicle);
    }
}
