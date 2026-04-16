package DecoratorPattern;

class RedBorderDecorator extends ShapeDecorator {

    public RedBorderDecorator(Component component) {
        super(component);
    }

    public void draw() {
        component.draw(); // gọi gốc
        setRedBorder();   // thêm chức năng
    }

    private void setRedBorder() {
        System.out.println("Add red border");
    }
}
