public enum PlaneType {

    BOEING123(100, 10000),
    BOEING456(200, 20000);

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
