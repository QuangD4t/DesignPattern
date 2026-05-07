package TheTemplateMethodPattern;

public class Main {

    public static void main(String[] args) {

        Pizza cheesePizza = new CheesePizza();

        System.out.println("=== Cheese Pizza ===");
        cheesePizza.makePizza();

        System.out.println();

        Pizza seafoodPizza = new SeaFoodPizza();

        System.out.println("=== Seafood Pizza ===");
        seafoodPizza.makePizza();
    }
}
