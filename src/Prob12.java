import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            if (sumFormula == sumWhile) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}