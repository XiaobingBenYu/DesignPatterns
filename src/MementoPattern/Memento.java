package MementoPattern;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class Memento {
    private  String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
