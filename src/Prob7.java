import java.util.Scanner;

public class Prob7 {
    int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int min = Math.min(number1, Math.min(number2, number3));
        int max = Math.max(number1, Math.max(number2, number3));
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob7 obj = new Prob7();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] result = obj.findSmallestAndLargest(a, b, c);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}