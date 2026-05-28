import java.util.Scanner;

public class Prob5 {

    static boolean vowel(char ch){

        ch=Character.toLowerCase(ch);

        return ch=='a'||ch=='e'||ch=='i'
                ||ch=='o'||ch=='u';

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        int vowels=0;
        int consonants=0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(Character.isLetter(ch)){

                if(vowel(ch))
                    vowels++;

                else
                    consonants++;

            }

        }

        System.out.println(vowels);

        System.out.println(consonants);

    }

}