import java.util.Scanner;

public class Prob6 {

    static void handle(String text) {

        try {

            System.out.println(
                    text.substring(5,2)
            );

        }

        catch (IllegalArgumentException e) {

            System.out.println(
                    "Handled IllegalArgumentException"
            );

        }

        catch (Exception e) {

            System.out.println(
                    "Handled Exception"
            );

        }

    }

    public static void main(String args[]) {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter String: "
        );

        String text =
                sc.next();

        handle(text);

    }

}