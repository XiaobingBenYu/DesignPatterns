package MementoPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
