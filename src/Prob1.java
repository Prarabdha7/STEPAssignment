import java.util.Scanner;

public class Prob1 {

    int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    int product(int[] arr) {
        int p = 1;
        for (int i : arr) p *= i;
        return p;
    }

    int sumOfSquares(int[] arr) {
        int s = 0;
        for (int i : arr) s += i * i;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob1 obj = new Prob1();

        int n = sc.nextInt();

        int[] factors = obj.getFactors(n);

        for (int i : factors) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(obj.sum(factors));
        System.out.println(obj.product(factors));
        System.out.println(obj.sumOfSquares(factors));
    }
}