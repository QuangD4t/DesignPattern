package FactoryMethodPattern;

public abstract class CandyStore {

    protected abstract Candy createCandy(String type);

    public Candy orderCandy(String type) {

        Candy candy = createCandy(type);

        System.out.println("----- Đang xử lý đơn hàng -----");

        candy.prepare();
        candy.pack();

        System.out.println("Hoàn tất đơn: " + candy.getName());
        return candy;
    }
}