import java.util.Scanner;

public class Prob4 {

    double kmToMiles(double km) {
        return km * 0.621371;
    }

    double milesToKm(double miles) {
        return miles * 1.60934;
    }

    double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob4 obj = new Prob4();

        double val = sc.nextDouble();

        System.out.println(obj.kmToMiles(val));
        System.out.println(obj.milesToKm(val));
        System.out.println(obj.metersToFeet(val));
        System.out.println(obj.feetToMeters(val));
    }
}