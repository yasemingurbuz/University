import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<MetaFunction> functions = new ArrayList<>();

    public void addFunction(MetaFunction function) {
        functions.add(function);
    }

    public void listFunctions() {
        System.out.println("Available functions:");
        for (MetaFunction f : functions) {
            System.out.println("- " + f.getName());
        }
    }

    public double doCalculation(String name, double input) {
        for (MetaFunction f : functions) {
            if (f.getName().equalsIgnoreCase(name)) {
                return f.calculate(input);
            }
        }
        throw new IllegalArgumentException("Function not found: " + name);
    }
}
