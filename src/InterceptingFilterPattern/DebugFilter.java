package InterceptingFilterPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
