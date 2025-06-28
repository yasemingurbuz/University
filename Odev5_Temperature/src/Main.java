public class Main {
    public static void main(String[] args) {
        TemperatureCalculator calculator = new TemperatureCalculator();

        calculator.addConverter(new CelsiusConverter());
        calculator.addConverter(new FahrenheitConverter());
        calculator.addConverter(new KelvinConverter());

        calculator.listConverters();

        double celsius = 25;
        double fahrenheit = calculator.convert("Celsius", "Fahrenheit", celsius);
        double kelvin = calculator.convert("Celsius", "Kelvin", celsius);

        System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
        System.out.printf("%.2f Celsius = %.2f Kelvin\n", celsius, kelvin);

        // Başka dönüşüm örneği
        double tempInKelvin = 300;
        double toFahrenheit = calculator.convert("Kelvin", "Fahrenheit", tempInKelvin);
        System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n", tempInKelvin, toFahrenheit);

    }
}