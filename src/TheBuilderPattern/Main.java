package TheBuilderPattern;

public class Main {
    public static void main(String[] args) {

        Architect architect = new Architect();

        // Simple room
        Bedroom room1 = architect.createSimpleRoom(new BedroomBuilder());

        // Luxury room
        Bedroom room2 = architect.createLuxuryRoom(new LuxuryBedroomBuilder());

        // Build house
        House house = new HouseBuilder()
                .addRoom(room1)
                .addRoom(room2)
                .setFloors(2)
                .build();

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(house);
    }
}
