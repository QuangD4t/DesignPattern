package TheTemplateMethodPattern;

public class SeaFoodPizza extends Pizza {

    @Override
    protected void addToppings() {
        System.out.println("Adding shrimp and squid");
    }
}
