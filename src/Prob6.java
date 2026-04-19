import java.util.Scanner;

public class Prob6 {
    int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob6 obj = new Prob6();

        int n = sc.nextInt();

        System.out.println(obj.sum(n));
    }
}