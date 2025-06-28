public class FibonacciSumFunction implements MetaFunction {
    @Override
    public String getName() {
        return "fibonaccisum";
    }

    @Override
    public double calculate(double x) {
        int limit = (int)x;
        int a = 0, b = 1, sum = 0;

        while (a <= limit) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}
