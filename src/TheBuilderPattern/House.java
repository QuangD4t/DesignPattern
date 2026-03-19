package TheBuilderPattern;
import java.util.ArrayList;
import java.util.List;

class House {
    List<Bedroom> rooms = new ArrayList<>();
    int floors;

    public void addRoom(Bedroom room) {
        rooms.add(room);
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                '}';
    }
}