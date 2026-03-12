package PrototypePattern;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Dat");

        Rabbit rabbit1 = new Rabbit(3, p);

        Rabbit rabbit2 = rabbit1.clone();

        System.out.println("Rabbit1 age: " + rabbit1.getAge());
        System.out.println("Rabbit2 age: " + rabbit2.getAge());
        System.out.println("Rabbit1 owner: " + rabbit1.getOwner().getName());
        System.out.println("Rabbit2 owner " + rabbit2.getOwner().getName());
    }
}