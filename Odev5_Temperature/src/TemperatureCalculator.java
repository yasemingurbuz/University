import java.util.ArrayList;
import java.util.List;

public class TemperatureCalculator {

    private List<TemperatureConverter> converters = new ArrayList<>();

    public void addConverter(TemperatureConverter converter) {
        converters.add(converter);
    }

    public void listConverters() {
        System.out.println("Available Temperature Scales:");
        for (TemperatureConverter converter : converters) {
            System.out.println("- " + converter.getScaleName());
        }
    }

    public double convert(String fromScale, String toScale, double value) {
        TemperatureConverter fromConverter = null;
        TemperatureConverter toConverter = null;

        for (TemperatureConverter c : converters) {
            if (c.getScaleName().equalsIgnoreCase(fromScale)) {
                fromConverter = c;
            }
            if (c.getScaleName().equalsIgnoreCase(toScale)) {
                toConverter = c;
            }
        }

        if (fromConverter == null || toConverter == null) {
            throw new IllegalArgumentException("Invalid temperature scale provided.");
        }

        return fromConverter.convertTo(value, toConverter);
    }
}
