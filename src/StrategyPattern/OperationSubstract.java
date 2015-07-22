package StrategyPattern;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class OperationSubstract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
