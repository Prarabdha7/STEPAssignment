public class Prob4 {

    static void generateException(){

        String text=null;

        System.out.println(
                text.length()
        );

    }

    static void handleException(){

        try{

            generateException();

        }

        catch(
                NullPointerException e
        ){

            System.out.println(
                    "Handled NullPointerException"
            );

        }

    }

    public static void main(
            String args[]
    ){

        handleException();

    }

}