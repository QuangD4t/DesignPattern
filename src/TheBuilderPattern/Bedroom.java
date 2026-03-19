package TheBuilderPattern;

class Bedroom {
    String bedType = "Unknown";
    int numOfBeds = 1;
    boolean hasTV = false;
    boolean hasAC = false;
    String color = "White";
    int size = 20;
    boolean hasBalcony = false;
    String view = "City";

    @Override
    public String toString() {
        return "Bedroom{" +
                "bedType='" + bedType + '\'' +
                ", numOfBeds=" + numOfBeds +
                ", hasTV=" + hasTV +
                ", hasAC=" + hasAC +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", hasBalcony=" + hasBalcony +
                ", view='" + view + '\'' +
                '}';
    }
}