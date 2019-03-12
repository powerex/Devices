package interfaces;

public class Phone extends Device implements Calling {
    public Phone(int price, String manufacture) {
        super(price, manufacture);
    }

    @Override
    public void doCall(String interlocutor) {
        System.out.println("Call " + interlocutor + " from home");
    }
}
