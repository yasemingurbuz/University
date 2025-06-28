public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addFunction(new SquareFunction());
        calculator.addFunction(new CubeFunction());
        calculator.addFunction(new FibonacciSumFunction());

        calculator.listFunctions();

        double input = 5;

        System.out.println("square(5) = " + calculator.doCalculation("square", input));
        System.out.println("cube(5) = " + calculator.doCalculation("cube", input));
        System.out.println("fibonaccisum(5) = " + calculator.doCalculation("fibonaccisum", input));
    }
    }
