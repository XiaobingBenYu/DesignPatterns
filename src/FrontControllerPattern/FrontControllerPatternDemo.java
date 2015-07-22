package FrontControllerPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
