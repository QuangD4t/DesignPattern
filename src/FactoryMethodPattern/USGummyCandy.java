package FactoryMethodPattern;

public class USGummyCandy extends Candy {

    public USGummyCandy() {
        name = "Kẹo dẻo kiểu Mỹ";
    }

    @Override
    public void prepare() {
        System.out.println("Chuẩn bị kẹo dẻo nhiều màu kiểu Mỹ");
    }
}