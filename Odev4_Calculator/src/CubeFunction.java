public class CubeFunction implements MetaFunction {
    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double calculate(double x) {
        return x * x * x;
    }
}
