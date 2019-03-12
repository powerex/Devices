package interfaces;

public abstract class Device implements Comparable<Device> {
    protected int price;
    protected String manufacture;

    public Device(int price, String manufacture) {
        this.price = price;
        this.manufacture = manufacture;
    }

    @Override
    public int compareTo(Device o) {
        return o.price - price;
    }
}
