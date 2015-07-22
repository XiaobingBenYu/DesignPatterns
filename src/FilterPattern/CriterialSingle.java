package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/9/15.
 */
public class CriterialSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
