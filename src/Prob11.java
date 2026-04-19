import java.util.Scanner;

public class Prob11 {
    double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);

        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob11 obj = new Prob11();

        double angle = sc.nextDouble();

        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}