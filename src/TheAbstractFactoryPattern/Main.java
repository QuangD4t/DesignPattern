package TheAbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        BikeFactory mountainFactory = new MountainBikeFactory();
        BikeBuilder builder1 = new BikeBuilder(mountainFactory);
        builder1.buildBike();

        BikeFactory roadFactory = new RoadBikeFactory();
        BikeBuilder builder2 = new BikeBuilder(roadFactory);
        builder2.buildBike();
    }
}
