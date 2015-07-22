package ObserverPattern;

/**
 * Created by Ben Yu on 4/10/15.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
