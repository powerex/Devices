package interfaces;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();

        Console c = new Console(14000, "Sony", true);
        c.serfWebsites("gooogle.com");

        devices.add(c);
        devices.add(new Smartphone(29000, "Samsung"));
        devices.add(new Smartphone(32000, "Iphone"));
        devices.add(new Mobile(3000, "Nokia"));
        devices.add(new Phone(500, "DE"));


    }

}
