import java.util.Scanner;

public class Prob5 {

    double yardsToFeet(double yards) {
        return yards * 3;
    }

    double feetToYards(double feet) {
        return feet * 0.333333;
    }

    double metersToInches(double meters) {
        return meters * 39.3701;
    }

    double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob5 obj = new Prob5();

        double val = sc.nextDouble();

        System.out.println(obj.yardsToFeet(val));
        System.out.println(obj.feetToYards(val));
        System.out.println(obj.metersToInches(val));
        System.out.println(obj.inchesToMeters(val));
        System.out.println(obj.inchesToCentimeters(val));
    }
}