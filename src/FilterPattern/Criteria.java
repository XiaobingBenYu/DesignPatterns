package FilterPattern;
import java.util.List;

/**
 * Created by Ben Yu on 4/9/15.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
