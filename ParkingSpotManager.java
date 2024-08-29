import model.*;

public class ParkingSpotManager {

    public static void main(String[] args) {

        //create levels
        //create parkingspots in each level
        //park vehicle and unpark vehicle
        //implement parking strategy
        //factory pattern to return parking strategies

        ParkingLot lot = new ParkingLot(2);
        lot.addLevel(new Level(1,80));
        lot.addLevel(new Level(2,100));

        Vehicle car = new Car("ABCD", VehicleType.CAR);
        Vehicle bus = new Bus("ABCD", VehicleType.BUS);
        Vehicle cycle = new MotorCycle("ABCD", VehicleType.MOTORCYCLE);

        lot.parkVehicle(car);
        lot.parkVehicle(bus);
        lot.parkVehicle(cycle);

        lot.unparkVehicle(bus);
    }
}
