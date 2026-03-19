package TheAbstractFactoryPattern;

public class MountainBikeWheel implements Wheel {
    @Override
    public void create() {
        System.out.println("Mountain Bike Wheel created");
    }
}
