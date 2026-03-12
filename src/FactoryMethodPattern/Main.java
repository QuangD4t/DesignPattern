package FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {

        CandyStore usStore = new USCandyStore();
        CandyStore japanStore = new JapanCandyStore();

        System.out.println("=== Đặt hàng tại cửa hàng Mỹ ===");
        usStore.orderCandy("Kẹo Socola");

        System.out.println("\n=== Đặt hàng tại cửa hàng Nhật ===");
        japanStore.orderCandy("Kẹo Dẻo");
    }
}