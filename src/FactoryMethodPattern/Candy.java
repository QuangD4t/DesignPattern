package FactoryMethodPattern;

public abstract class Candy {

    protected String name;

    public abstract void prepare();

    public void pack() {
        System.out.println("Đóng gói: " + name);
    }

    public String getName() {
        return name;
    }
}
