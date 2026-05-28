
public class Prob8 {

    static void handle() {

        String names[] = {
                "A",
                "B",
                "C"
        };

        try {

            System.out.println(
                    names[10]
            );

        }

        catch (
                ArrayIndexOutOfBoundsException e
        ) {

            System.out.println(
                    "Handled ArrayIndexOutOfBoundsException"
            );

        }

    }

    public static void main(
            String args[]
    ) {

        handle();

    }

}