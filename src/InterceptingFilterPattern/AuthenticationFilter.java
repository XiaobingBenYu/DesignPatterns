package InterceptingFilterPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
