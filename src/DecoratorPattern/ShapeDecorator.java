package DecoratorPattern;

abstract class ShapeDecorator implements Component {
    protected Component component;

    public ShapeDecorator(Component component) {
        this.component = component;
    }
}
