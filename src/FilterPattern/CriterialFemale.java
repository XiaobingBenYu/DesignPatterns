package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/9/15.
 */
public class CriterialFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
