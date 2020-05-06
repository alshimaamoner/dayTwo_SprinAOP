package base.Introduction;

public class MinCalculatorImpl implements MinCalculator {
    @Override
    public int min(int num1, int num2) {
        return (num1<num2) ? num1:num2;
    }
}
