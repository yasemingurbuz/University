public class SquareFunction implements MetaFunction {
    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double calculate(double x) {
        return x * x;
    }
}
