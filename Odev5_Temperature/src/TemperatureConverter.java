public interface TemperatureConverter {
    String getScaleName();   // Ölçek adı (Celsius, Fahrenheit, Kelvin)

    double toCelsius(double value);       // Verilen değeri Celsius'a çevir
    double fromCelsius(double celsius);   // Celsius'tan bu ölçeğe çevir

    // İsteğe bağlı: direkt dönüşüm için
    default double convertTo(double value, TemperatureConverter targetConverter) {
        double celsius = toCelsius(value);
        return targetConverter.fromCelsius(celsius);
    }
}
