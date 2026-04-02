package BridgePattern;

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Triangle with ");
        color.applyColor();
    }
}
