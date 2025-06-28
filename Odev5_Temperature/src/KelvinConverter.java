public class KelvinConverter implements TemperatureConverter {

    @Override
    public String getScaleName() {
        return "Kelvin";
    }

    @Override
    public double toCelsius(double value) {
        return value - 273.15;
    }

    @Override
    public double fromCelsius(double celsius) {
        return celsius + 273.15;
    }
}
