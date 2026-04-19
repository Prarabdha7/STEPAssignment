import java.util.Scanner;

public class Prob6 {

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    double poundsToKilograms(double p) {
        return p * 0.453592;
    }

    double kilogramsToPounds(double k) {
        return k * 2.20462;
    }

    double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    double litersToGallons(double l) {
        return l * 0.264179;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob6 obj = new Prob6();

        double val = sc.nextDouble();

        System.out.println(obj.fahrenheitToCelsius(val));
        System.out.println(obj.celsiusToFahrenheit(val));
        System.out.println(obj.poundsToKilograms(val));
        System.out.println(obj.kilogramsToPounds(val));
        System.out.println(obj.gallonsToLiters(val));
        System.out.println(obj.litersToGallons(val));
    }
}