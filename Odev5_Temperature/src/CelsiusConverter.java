public class CelsiusConverter implements TemperatureConverter {

    @Override
    public String getScaleName() {
        return "Celsius";
    }

    @Override
    public double toCelsius(double value) {
        return value;  // zaten Celsius
    }

    @Override
    public double fromCelsius(double celsius) {
        return celsius;
    }
}
