import java.util.Scanner;

public class Prob3 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String words[]=text.split(" ");

        for(String w:words){

            System.out.println(
                    w+" "+w.length()
            );

        }

    }

}