import java.util.Scanner;

public class Prob9 {
    int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob9 obj = new Prob9();

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] result = obj.findRemainderAndQuotient(chocolates, children);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}