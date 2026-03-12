package FactoryMethodPattern;

public class JapanChocolateCandy extends Candy {

    public JapanChocolateCandy() {
        name = "Kẹo Socola Matcha Nhật";
    }

    @Override
    public void prepare() {
        System.out.println("Chuẩn bị socola matcha truyền thống Nhật");
    }
}