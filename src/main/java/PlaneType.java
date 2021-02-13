public enum PlaneType {


    //passengers weight 80 avg each

    GOING_hUg3(200, 32000.0),
    GOING_B1g(100, 16000.0),
    GOING_W33(50, 8000.0),
    GOING_TEST(1, 160);

    private int capacity;
    private double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public double getTotalWeight() {
        return this.totalWeight;
    }

}
