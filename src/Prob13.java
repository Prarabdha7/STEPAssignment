import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            if (sumFormula == sumFor) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}