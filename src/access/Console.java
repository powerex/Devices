package access;

public class Console extends Device {
    private boolean connection;

    public Console(int price, String manufacture, boolean connection) {
        super(price, manufacture);
        this.connection = connection;
    }

    public void connect() {
        connection = true;
    }

    public void disconnect() {
        connection = false;
    }

    @Override
    public void play(String game) {
        System.out.println("Play " + game + " on console");
    }

    @Override
    public void serfWebsites(String url) {
        if (connection)
            System.out.println("View " + url + " from console");
        else
            System.out.println("no connection");
    }
}
