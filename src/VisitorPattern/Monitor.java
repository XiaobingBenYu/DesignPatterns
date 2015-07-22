package VisitorPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
