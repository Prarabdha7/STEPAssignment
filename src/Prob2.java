import java.util.Scanner;

public class Prob2 {

    static String createSubstring(
            String text,
            int start,
            int end
    ) {

        String result = "";

        for (int i = start; i < end; i++) {

            result += text.charAt(i);

        }

        return result;

    }

    static boolean compare(
            String a,
            String b
    ) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i))
                return false;

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String text = sc.next();

        System.out.print("Start: ");

        int start = sc.nextInt();

        System.out.print("End: ");

        int end = sc.nextInt();

        String custom =
                createSubstring(text,start,end);

        String builtin =
                text.substring(start,end);

        System.out.println(custom);

        System.out.println(builtin);

        System.out.println(
                compare(custom,builtin)
        );

    }

}