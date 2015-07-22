package BuilderPattern;

/**
 * Created by Ben Yu on 4/8/15.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
