package task1;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.println("Choose the current Scale: ");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int currScale = sc.nextInt();

        System.out.println("Choose the Target Scale: ");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int targetScale = sc.nextInt();

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("-------------------------------");


        double celsius = 0;
        double result = 0;

        // Convert to Celsius first
        switch (currScale) {
            case 1:
                celsius = temperature;
                break;

            case 2:
                celsius = (temperature - 32) * 5 / 9;
                break;

            case 3:
                celsius = temperature - 273.15;
                break;

            default:
                System.out.println("Invalid Current Scale");
                return;
        }
        // Convert Celsius to target scale
        switch (targetScale) {
            case 1:
                result = celsius;
                System.out.printf("Converted Temperature: %.2f °C%n", result);
                break;

            case 2:
                result = (celsius * 9 / 5) + 32;
                System.out.printf("Converted Temperature: %.2f °F%n", result);
                break;

            case 3:
                result = celsius + 273.15;
                System.out.printf("Converted Temperature: %.2f K%n", result);
                break;

            default:
                System.out.println("Invalid Target Scale");
                return;
        }
        sc.close();
    }
}
