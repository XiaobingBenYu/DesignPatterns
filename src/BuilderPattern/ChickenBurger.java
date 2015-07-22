package BuilderPattern;

/**
 * Created by Ben Yu on 4/8/15.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
