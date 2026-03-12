package FactoryMethodPattern;

public class USChocolateCandy extends Candy {

    public USChocolateCandy() {
        name = "Kẹo Socola kiểu Mỹ";
    }

    @Override
    public void prepare() {
        System.out.println("Chuẩn bị socola kiểu Mỹ");
    }
}