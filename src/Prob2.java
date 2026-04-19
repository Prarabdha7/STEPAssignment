import java.util.Scanner;

public class Prob2 {

    int recursiveSum(int n) {
        if (n <= 1) return n;
        return n + recursiveSum(n - 1);
    }

    int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob2 obj = new Prob2();

        int n = sc.nextInt();

        int r1 = obj.recursiveSum(n);
        int r2 = obj.formulaSum(n);

        System.out.println(r1);
        System.out.println(r2);

        if (r1 == r2) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}