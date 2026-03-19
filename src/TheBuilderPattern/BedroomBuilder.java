package TheBuilderPattern;

class BedroomBuilder implements RoomBuilder {
    private Bedroom bedroom = new Bedroom();

    public RoomBuilder setBedType(String bedType) {
        bedroom.bedType = bedType;
        return this;
    }

    public RoomBuilder setNumOfBeds(int numOfBeds) {
        bedroom.numOfBeds = numOfBeds;
        return this;
    }

    public RoomBuilder setHasTV(boolean hasTV) {
        bedroom.hasTV = hasTV;
        return this;
    }

    public RoomBuilder setHasAC(boolean hasAC) {
        bedroom.hasAC = hasAC;
        return this;
    }

    public RoomBuilder setColor(String color) {
        bedroom.color = color;
        return this;
    }

    public RoomBuilder setSize(int size) {
        bedroom.size = size;
        return this;
    }

    public RoomBuilder setHasBalcony(boolean hasBalcony) {
        bedroom.hasBalcony = hasBalcony;
        return this;
    }

    public RoomBuilder setView(String view) {
        bedroom.view = view;
        return this;
    }

    public Bedroom build() {
        return bedroom;
    }
}