package TheAbstractFactoryPattern;

public class MountainBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }
}
