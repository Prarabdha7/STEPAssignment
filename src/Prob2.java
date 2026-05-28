import java.util.Scanner;

public class Prob2 {

    static void unique(String str){

        for(int i=0;i<str.length();i++){

            boolean found=false;

            for(int j=0;j<i;j++){

                if(str.charAt(i)==str.charAt(j)){

                    found=true;

                    break;

                }

            }

            if(!found)

                System.out.print(
                        str.charAt(i)+" "
                );

        }

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        unique(str);

    }

}