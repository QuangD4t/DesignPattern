package TheAbstractFactoryPattern;

public class RoadBikeWheel implements Wheel {
    @Override
    public void create() {
        System.out.println("Road Bike Wheel created");
    }
}
