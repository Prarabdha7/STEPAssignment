import java.util.Random;

public class Prob1 {

    int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        Prob1 obj = new Prob1();
        Random r = new Random();

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101);
        }

        System.out.println(obj.findSum(heights));
        System.out.println(obj.findMean(heights));
        System.out.println(obj.findMin(heights));
        System.out.println(obj.findMax(heights));
    }
}