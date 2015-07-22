package BusinessDelegatePattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
