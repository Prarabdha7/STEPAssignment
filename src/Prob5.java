import java.util.Scanner;

public class Prob5 {

    static void handle(
            String text
    ){

        try{

            System.out.println(
                    text.charAt(
                            text.length()+1
                    )
            );

        }

        catch(
                StringIndexOutOfBoundsException e
        ){

            System.out.println(
                    "Handled Exception"
            );

        }

    }

    public static void main(
            String args[]
    ){

        Scanner sc =
                new Scanner(System.in);

        String text =
                sc.next();

        handle(text);

    }

}