import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ParkingLotTest {

    @Test
    public void testGetParkingLotInstance_success() {
        ParkingLot parkingLot1 = ParkingLot.getInstance();
        ParkingLot parkingLot2 = ParkingLot.getInstance();

        assertNotNull(parkingLot1);
        assertSame(parkingLot1, parkingLot2);
    }
}
