public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public String getScaleName() {
        return "Fahrenheit";
    }

    @Override
    public double toCelsius(double value) {
        return (value - 32) * 5 / 9;
    }

    @Override
    public double fromCelsius(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
