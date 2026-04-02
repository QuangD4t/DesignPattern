package TheAdapterPattern;

public class Main {
    public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator();
        PriceCalculator truck = new TruckPriceCalculator();

        // dùng adapter cho UK car
        UKCarPriceCalculator ukService = new UKCarPriceCalculator();
        PriceCalculator ukCar = new UKCarPriceAdapter(ukService);

        System.out.println("Car price: " + car.calculatePrice() + " USD");
        System.out.println("Truck price: " + truck.calculatePrice() + " USD");
        System.out.println("UK Car price: " + ukCar.calculatePrice() + " USD");
    }
}
