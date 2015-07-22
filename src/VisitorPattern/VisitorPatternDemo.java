package VisitorPattern;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
