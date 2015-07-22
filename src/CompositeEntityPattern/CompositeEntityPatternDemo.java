package CompositeEntityPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();

        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
