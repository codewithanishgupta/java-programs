// 8. Create a class Temperature with overloaded methods to convert: Celsius to Fahrenheit ,Fahrenheit to Celsius 

class Temperature {
    // Celsius to Fahrenheit
    double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    double convert(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Temperature t = new Temperature();

        System.out.println("Celsius to Fahrenheit: " + t.convert(37.0));
        System.out.println("Fahrenheit to Celsius: " + t.convert(98)); 
    }
}
