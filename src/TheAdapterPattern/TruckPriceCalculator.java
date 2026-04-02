package TheAdapterPattern;

public class TruckPriceCalculator implements  PriceCalculator {
    @Override
    public double calculatePrice() {
        return 40000 * 1.2;
    }
}
