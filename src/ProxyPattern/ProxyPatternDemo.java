package ProxyPattern;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loadded from disk
        image.display();
    }
}
