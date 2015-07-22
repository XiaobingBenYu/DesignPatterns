package VisitorPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
