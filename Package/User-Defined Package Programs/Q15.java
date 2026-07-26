// 15.Create a package conversion for:Celsius to Fahrenheit,Fahrenheit to Celsius 

import conversion.TemperatureConversion;

public class Q15 {
    public static void main(String[] args) {
        TemperatureConversion tc = new TemperatureConversion();

        double celsius = 37.0;
        double fahrenheit = 98.6;

        System.out.println(celsius + "°C in Fahrenheit = " + tc.celsiusToFahrenheit(celsius));
        System.out.println(fahrenheit + "°F in Celsius = " + tc.fahrenheitToCelsius(fahrenheit));
    }
}
