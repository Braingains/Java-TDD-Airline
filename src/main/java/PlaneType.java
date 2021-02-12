public enum PlaneType {

    GOING_hUg3(200, 32000.0),
    GOING_B1g(100, 16000.0),
    GOING_W33(50, 8000.0);

    private int capacity;
    private double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }



}
