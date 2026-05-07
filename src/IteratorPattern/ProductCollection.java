package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public Iterator<Product> iterator() {
        return new InStockIterator(products);
    }
}
