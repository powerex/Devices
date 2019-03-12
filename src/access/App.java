package access;

public class App {

    public static void main(String[] args) {
        Console c = new Console(14000, "Sony", true);
        Mobile m = new Mobile(5000, "Meizu");

        Device d = c;
        try {
            d.doCall("Garry");
        } catch (IllegalOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        d = m;
        try {
            d.doCall("Fred");
        } catch (IllegalOperationException e) {
            e.printStackTrace();
        }

    }

}
