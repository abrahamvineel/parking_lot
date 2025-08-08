import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void testGetParkingLotInstance_success() {
        ParkingLot parkingLot1 = ParkingLot.getInstance();
        ParkingLot parkingLot2 = ParkingLot.getInstance();

        assertNotNull(parkingLot1);
        assertSame(parkingLot1, parkingLot2);
    }

    @Test(expected = AssertionError.class)
    public void testGetParkingLotInstance_failure() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ParkingLot parkingLot1 = ParkingLot.getInstance();
        Constructor<ParkingLot> constructor = ParkingLot.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        ParkingLot parkingLot2 = constructor.newInstance();

        assertSame(parkingLot1, parkingLot2);
    }
}
