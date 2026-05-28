import java.util.Scanner;

public class Prob6 {

    static String type(char ch){

        ch=Character.toLowerCase(ch);

        if(ch>='a'&&ch<='z'){

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";

            return "Consonant";

        }

        return "Not Letter";

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            System.out.println(
                    ch+" "+type(ch)
            );

        }

    }

}