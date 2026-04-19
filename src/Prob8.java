import java.util.Scanner;

public class Prob8 {
    int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob8 obj = new Prob8();

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = obj.findRemainderAndQuotient(number, divisor);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}