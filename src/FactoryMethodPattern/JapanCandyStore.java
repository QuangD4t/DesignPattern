package FactoryMethodPattern;

public class JapanCandyStore extends CandyStore {

    @Override
    protected Candy createCandy(String type) {

        if (type.equalsIgnoreCase("Kẹo Socola")) {
            return new JapanChocolateCandy();
        } 
        else if (type.equalsIgnoreCase("Kẹo Dẻo")) {
            return new JapanGummyCandy();
        }

        return null;
    }
}
