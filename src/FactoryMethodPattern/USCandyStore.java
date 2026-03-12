package FactoryMethodPattern;

public class USCandyStore extends CandyStore {

    @Override
    protected Candy createCandy(String type) {

        if (type.equalsIgnoreCase("Kẹo Socola")) {
            return new USChocolateCandy();
        } 
        else if (type.equalsIgnoreCase("Kẹo Dẻo")) {
            return new USGummyCandy();
        }

        return null;
    }
}
