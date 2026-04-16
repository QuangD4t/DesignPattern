package DecoratorPattern;

public class Canvas {
    public static void main(String[] args) {

        Component circle1 = new Circle();

        Component circle2 = new RedBorderDecorator(new Circle());

        System.out.println("Circle 1:");
        circle1.draw();

        System.out.println("\nCircle 2 (decorated):");
        circle2.draw();
    }
}
