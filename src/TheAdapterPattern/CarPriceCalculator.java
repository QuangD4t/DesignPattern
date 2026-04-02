package TheAdapterPattern;

public class CarPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice() {
        return 20000 * 1.1;
    }
}
