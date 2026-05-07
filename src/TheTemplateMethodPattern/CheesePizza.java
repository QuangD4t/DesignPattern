package TheTemplateMethodPattern;


public class CheesePizza extends Pizza {

    @Override
    protected void addToppings() {
        System.out.println("Adding cheese");
    }
}
