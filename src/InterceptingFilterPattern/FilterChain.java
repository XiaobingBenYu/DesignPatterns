package InterceptingFilterPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
