import java.util.Scanner;

public class Prob9 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int games=sc.nextInt();

        int userWins=0;
        int compWins=0;

        for(int i=0;i<games;i++){

            int user=sc.nextInt();

            int comp=
                    (int)(Math.random()*3);

            if(user==comp)
                continue;

            if(
                    (user==0&&comp==2)||
                    (user==1&&comp==0)||
                    (user==2&&comp==1)
            )

                userWins++;

            else

                compWins++;

        }

        System.out.println(
                "User "+userWins
        );

        System.out.println(
                "Computer "+compWins
        );

    }

}