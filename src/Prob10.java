import java.util.Scanner;

public class Prob10 {

    static String convert(
            String text
    ) {

        String result = "";

        for (
                int i = 0;
                i < text.length();
                i++
        ) {

            char ch =
                    text.charAt(i);

            if (
                    ch >= 'A'
                            &&
                            ch <= 'Z'
            ) {

                ch =
                        (char)(ch + 32);

            }

            result += ch;

        }

        return result;

    }

    static boolean compare(
            String a,
            String b
    ) {

        if (
                a.length()
                        !=
                        b.length()
        )
            return false;

        for (
                int i=0;
                i<a.length();
                i++
        ) {

            if (
                    a.charAt(i)
                            !=
                            b.charAt(i)
            )
                return false;

        }

        return true;

    }

    public static void main(
            String args[]
    ) {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter Text: "
        );

        String text =
                sc.nextLine();

        String custom =
                convert(text);

        String builtin =
                text.toLowerCase();

        System.out.println(
                "Custom: "
                        + custom
        );

        System.out.println(
                "Built-in: "
                        + builtin
        );

        System.out.println(
                "Same? "
                        +
                        compare(
                                custom,
                                builtin
                        )
        );

    }

}