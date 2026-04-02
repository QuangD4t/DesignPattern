package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(new Red());
        Shape s2 = new Triangle(new Blue());
        Shape s3 = new Circle(new Blue());

        s1.draw(); // Circle with Red
        s2.draw();
        s3.draw();// Triangle with Blue
    }
}
