import java.util.Scanner;

public class Prob5 {
    boolean isSpring(int m, int d) {
        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob5 obj = new Prob5();

        int m = sc.nextInt();
        int d = sc.nextInt();

        if (obj.isSpring(m, d)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}