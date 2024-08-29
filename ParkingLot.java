import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Level> levels;

    public ParkingLot(int levels) {
        this.levels = new ArrayList<>(levels);
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            level.parkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            level.unparkVehicle(vehicle);
            return true;
        }
        return false;
    }
}
