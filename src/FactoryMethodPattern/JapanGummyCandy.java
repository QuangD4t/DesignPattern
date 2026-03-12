package FactoryMethodPattern;

public class JapanGummyCandy extends Candy {

    public JapanGummyCandy() {
        name = "Kẹo dẻo trái cây Nhật";
    }

    @Override
    public void prepare() {
        System.out.println("Chuẩn bị kẹo dẻo vị trái cây tự nhiên Nhật");
    }
}