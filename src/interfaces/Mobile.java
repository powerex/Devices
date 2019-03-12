package interfaces;

public class Mobile extends Device implements Calling, Messaging {
    public Mobile(int price, String manufacture) {
        super(price, manufacture);
    }

    @Override
    public void doCall(String interlocutor) {
        System.out.println("Call my friend " + interlocutor + " from mobile");
    }

    @Override
    public void writeMessage(String msg) {
        System.out.println("Type message: " + msg + " from mobile");
    }
}
