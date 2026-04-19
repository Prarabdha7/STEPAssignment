import java.util.Scanner;

public class Prob2 {
    int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob2 obj = new Prob2();

        int n = sc.nextInt();

        System.out.println(obj.handshakes(n));
    }
}