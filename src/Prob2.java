import java.util.Scanner;

public class Prob2 {

    int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    int[] getDigits(int n) {
        int size = countDigits(n);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    boolean isDuck(int n) {
        while (n != 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }

    boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int digits = countDigits(n);
        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    int[] largestTwo(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }
        return new int[]{first, second};
    }

    int[] smallestTwo(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second && x != first) {
                second = x;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prob2 obj = new Prob2();

        int n = sc.nextInt();

        int[] digits = obj.getDigits(n);

        System.out.println(obj.countDigits(n));
        System.out.println(obj.isDuck(n));
        System.out.println(obj.isArmstrong(n));

        int[] large = obj.largestTwo(digits);
        System.out.println(large[0] + " " + large[1]);

        int[] small = obj.smallestTwo(digits);
        System.out.println(small[0] + " " + small[1]);
    }
}