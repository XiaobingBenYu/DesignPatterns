package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/9/15.
 */
public class CriterialMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
