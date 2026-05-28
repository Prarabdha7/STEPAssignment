import java.util.Scanner;

public class Prob1 {

    static int findLength(String str) {

        int count = 0;

        try {

            while (true) {

                str.charAt(count);
                count++;

            }

        }

        catch(Exception e) {}

        return count;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(findLength(str));

        System.out.println(str.length());

    }

}