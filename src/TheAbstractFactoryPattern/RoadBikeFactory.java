package TheAbstractFactoryPattern;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }
}
