import java.util.Scanner;

public class Prob4 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String words[]=text.split(" ");

        String small=words[0];
        String large=words[0];

        for(String w:words){

            if(w.length()<small.length())
                small=w;

            if(w.length()>large.length())
                large=w;

        }

        System.out.println(
                "Smallest = "+small
        );

        System.out.println(
                "Largest = "+large
        );

    }

}