package ServiceLocatorPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }

    public String getName() {
        return "Service2";
    }
}
