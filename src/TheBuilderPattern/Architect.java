package TheBuilderPattern;

class Architect {
    public Bedroom createSimpleRoom(BedroomBuilder bedroomBuilder) {
        return new BedroomBuilder()
                .setBedType("Single")
                .setNumOfBeds(1)
                .setHasAC(true)
                .build();
    }
    public Bedroom createLuxuryRoom(LuxuryBedroomBuilder builder) {
        return builder
                .setBedType("King")
                .setNumOfBeds(2)
                .setHasAC(true)
                .setHasTV(true)
                .addJacuzzi()
                .build();
    }
}
