package TheBuilderPattern;

class LuxuryBedroomBuilder extends BedroomBuilder {

    @Override
    public LuxuryBedroomBuilder setBedType(String bedType) {
        super.setBedType(bedType);
        return this;
    }

    @Override
    public LuxuryBedroomBuilder setNumOfBeds(int numOfBeds) {
        super.setNumOfBeds(numOfBeds);
        return this;
    }

    @Override
    public LuxuryBedroomBuilder setHasTV(boolean hasTV) {
        super.setHasTV(hasTV);
        return this;
    }

    @Override
    public LuxuryBedroomBuilder setHasAC(boolean hasAC) {
        super.setHasAC(hasAC);
        return this;
    }

    public LuxuryBedroomBuilder addJacuzzi() {
        setHasBalcony(true);
        return this;
    }
}