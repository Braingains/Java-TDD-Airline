public class Plane {

    private final PlaneType PlaneType;

    public Plane (PlaneType planeType) {
        this.PlaneType = planeType;


    }


    public int getCapacity() {
        return this.PlaneType.getCapacity();
    }

    public double getTotalWeight() {
        return this.PlaneType.getTotalWeight();
    }
}
