import java.util.Scanner;

public class Prob7 {

    static String trimText(String text){

        int start=0;
        int end=text.length()-1;

        while(text.charAt(start)==' ')
            start++;

        while(text.charAt(end)==' ')
            end--;

        return text.substring(
                start,
                end+1
        );

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String custom=
                trimText(text);

        System.out.println(custom);

        System.out.println(
                text.trim()
        );

    }

}