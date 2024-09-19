public class PatternFactory {

    public ParkingStrategy getStrategy(String strategyName) {
        if(strategyName.equals("Linear")) {
            return new LinearParkingStrategy();
        } else if (strategyName.equals("OddOrEven")) {
            return new OddEvenParkingStrategy();
        } else {
            throw new UnsupportedOperationException("Strategy Not found");
        }
    }
}
