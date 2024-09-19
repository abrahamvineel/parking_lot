import model.*;

public class ParkingSpotManager {

    public static void main(String[] args) {

        //create levels
        //create parkingspots in each level
        //park vehicle and unpark vehicle
        //implement parking strategy
        //factory pattern to return parking strategies

        //reimplement the parking logic

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
