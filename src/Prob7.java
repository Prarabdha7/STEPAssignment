import java.util.Scanner;

public class Prob7 {

    static void handle(String text) {

        try {

            int number =
                    Integer.parseInt(text);

            System.out.println(
                    "Number = " + number
            );

        }

        catch (
                NumberFormatException e
        ) {

            System.out.println(
                    "Handled NumberFormatException"
            );

        }

    }

    public static void main(
            String args[]
    ) {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter Input: "
        );

        String text =
                sc.next();

        handle(text);

    }

}