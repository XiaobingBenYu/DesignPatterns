package ServiceLocatorPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class Service1 implements Service {
    public void execute() {
        System.out.println("Executing Service1");
    }

    public String getName() {
        return "Service1";
    }
}
