
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the odd and even numbers:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
