package MediatorPattern;
import java.util.Date;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
