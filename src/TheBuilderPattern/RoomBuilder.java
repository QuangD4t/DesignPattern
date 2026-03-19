package TheBuilderPattern;

interface RoomBuilder {
    RoomBuilder setBedType(String bedType);
    RoomBuilder setNumOfBeds(int numOfBeds);
    RoomBuilder setHasTV(boolean hasTV);
    RoomBuilder setHasAC(boolean hasAC);
    RoomBuilder setColor(String color);
    RoomBuilder setSize(int size);
    RoomBuilder setHasBalcony(boolean hasBalcony);
    RoomBuilder setView(String view);
    Bedroom build();
}

