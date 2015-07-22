package InterceptingFilterPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
