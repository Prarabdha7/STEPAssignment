import java.util.Scanner;

public class Prob10 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int players=sc.nextInt();

        String suits[]={
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String ranks[]={
                "2","3","4","5","6","7",
                "8","9","10","J",
                "Q","K","A"
        };

        String deck[]=new String[52];

        int index=0;

        for(String s:suits)

            for(String r:ranks)

                deck[index++]=
                        r+" of "+s;

        for(int i=0;i<52;i++){

            int rand=
                    i+
                    (int)(Math.random()
                            *(52-i));

            String temp=deck[i];

            deck[i]=deck[rand];

            deck[rand]=temp;

        }

        int card=0;

        for(int p=1;p<=players;p++){

            System.out.println(
                    "Player "+p
            );

            for(int j=0;j<52/players;j++){

                System.out.println(
                        deck[card++]
                );

            }

        }

    }

}