package interfaces;

public class Smartphone extends Device implements Calling, Gaming, Messaging, Surfing {
    public Smartphone(int price, String manufacture) {
        super(price, manufacture);
    }

    @Override
    public void doCall(String interlocutor) {
        System.out.println("Call my friend " + interlocutor + " from anywhere");
    }

    @Override
    public void play(String game) {
        System.out.println("Play " + game + " on smartphone");
    }

    @Override
    public void writeMessage(String msg) {
        System.out.println("Type message: " + msg + " from smartphone");
    }

    @Override
    public void serfWebsites(String url) {
        System.out.println("View " + url + " from smartphone");
    }
}
