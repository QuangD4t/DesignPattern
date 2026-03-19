package TheBuilderPattern;

class HouseBuilder {
    private House house = new House();

    public HouseBuilder addRoom(Bedroom room) {
        house.addRoom(room);
        return this;
    }

    public HouseBuilder setFloors(int floors) {
        house.setFloors(floors);
        return this;
    }

    public House build() {
        return house;
    }
}

