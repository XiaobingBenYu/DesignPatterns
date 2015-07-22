package BusinessDelegatePattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
