package PrototypePattern;

public class Rabbit implements Prototype {

    private int age;
    private Person owner;

    public Rabbit(int age, Person owner){
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public  Rabbit clone() {
        Person newOwner = new Person(owner.getName());
        return new Rabbit(age, newOwner);
    }
}
