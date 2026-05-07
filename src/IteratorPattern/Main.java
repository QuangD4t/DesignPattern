package IteratorPattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ProductCollection store = new ProductCollection();

        store.addProduct(new Product("Laptop", true));
        store.addProduct(new Product("Mouse", false));
        store.addProduct(new Product("Keyboard", true));
        store.addProduct(new Product("Monitor", false));

        Iterator<Product> iterator = store.iterator();

        while (iterator.hasNext()) {

            Product p = iterator.next();

            System.out.println(p.getName());
        }
    }
}
