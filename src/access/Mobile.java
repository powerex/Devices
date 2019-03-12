package access;

public class Mobile extends Device {
    public Mobile(int price, String manufacture) {
        super(price, manufacture);
    }

    public void doCall(String interlocutor) {
        System.out.println("Call my friend " + interlocutor + " from mobile");
    }

    public void writeMessage(String msg) {
        System.out.println("Type message: " + msg + " from mobile");
    }
}
