import java.util.Scanner;

public class Prob4 {
    int check(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob4 obj = new Prob4();

        int n = sc.nextInt();

        int res = obj.check(n);

        if (res == 1) {
            System.out.println("positive");
        } else if (res == -1) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}