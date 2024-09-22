import model.*;

public class ParkingSpotManager {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(2);
        PatternFactory factory = new PatternFactory();
        ParkingStrategy strategy = factory.getStrategy("OddOrEven");
        lot.addLevel(new Level(1,80, strategy));
        lot.addLevel(new Level(2,100, strategy));

        Vehicle car = new Car("ABCD", VehicleType.CAR);
        Vehicle bus = new Bus("ABCD", VehicleType.BUS);
        Vehicle cycle = new MotorCycle("ABCD", VehicleType.MOTORCYCLE);

        lot.parkVehicle(car);
        lot.parkVehicle(bus);
        lot.parkVehicle(cycle);

        lot.unparkVehicle(bus);
    }
}
