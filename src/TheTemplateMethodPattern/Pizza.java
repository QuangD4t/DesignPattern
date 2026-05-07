package TheTemplateMethodPattern;


public abstract class Pizza {

    // Template Method
    public final void makePizza() {

        prepareDough();
        addSauce();
        addToppings();
        bake();
        serve();
    }

    private void prepareDough() {
        System.out.println("Preparing dough");
    }

    private void addSauce() {
        System.out.println("Adding tomato sauce");
    }

    // Different for each pizza
    protected abstract void addToppings();

    private void bake() {
        System.out.println("Baking pizza");
    }

    private void serve() {
        System.out.println("Serving pizza");
    }
}
