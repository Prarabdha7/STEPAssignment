import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        if (average >= 80) {
            System.out.println("Grade A");
        } else if (average >= 70) {
            System.out.println("Grade B");
        } else if (average >= 60) {
            System.out.println("Grade C");
        } else if (average >= 50) {
            System.out.println("Grade D");
        } else if (average >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade R");
        }
    }
}