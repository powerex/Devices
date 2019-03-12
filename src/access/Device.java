package access;

public abstract class Device implements Comparable<Device> {

    int price;
    String manufacture;

    public Device(int price, String manufacture) {
        this.price = price;
        this.manufacture = manufacture;
    }

    void doCall(String interlocutor) throws IllegalOperationException {
        throw new IllegalOperationException("This device can't do call");
    }

    void play(String game) throws IllegalOperationException {
        throw new IllegalOperationException("On this device can't playing games");
    }

    void writeMessage(String msg) throws IllegalOperationException {
        throw new IllegalOperationException("This device can't send message");
    }

    void serfWebsites(String url) throws IllegalOperationException {
        throw new IllegalOperationException("This device hasn't access to the WEB");
    }

    @Override
    public int compareTo(Device o) {
        return o.price - price;
    }
}
