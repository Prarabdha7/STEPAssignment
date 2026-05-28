import java.util.Scanner;

public class Prob2 {

    static String[] splitWords(String text){

        int spaces=0;

        for(int i=0;i<text.length();i++)
            if(text.charAt(i)==' ')
                spaces++;

        String arr[]=new String[spaces+1];

        int start=0,index=0;

        for(int i=0;i<=text.length();i++){

            if(i==text.length() || text.charAt(i)==' '){

                arr[index++]=text.substring(start,i);

                start=i+1;

            }

        }

        return arr;

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String arr[]=splitWords(text);

        for(String s:arr)
            System.out.println(s);

    }

}