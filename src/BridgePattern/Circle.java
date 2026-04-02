package BridgePattern;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Circle with ");
        color.applyColor();
    }
}