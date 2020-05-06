package base.Introduction;

public class MaxCalculatorImpl implements MaxCalculator {
    @Override
    public int max(int num1, int num2) {
        return (num1>=num2) ? num1:num2;
    }
}
