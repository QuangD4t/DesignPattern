package TheAdapterPattern;

public class UKCarPriceAdapter implements PriceCalculator {

    private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator) {
        this.ukCalculator = ukCalculator;
    }

    @Override
    public double calculatePrice() {
        double priceInGBP = ukCalculator.getPrice();

        // giả sử 1 GBP = 1.3 USD
        return priceInGBP * 1.3;
    }
}
