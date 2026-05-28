import java.util.Scanner;

public class Prob10 {

    static char grade(double p){

        if(p>=80) return 'A';

        if(p>=70) return 'B';

        if(p>=60) return 'C';

        if(p>=50) return 'D';

        if(p>=40) return 'E';

        return 'R';

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            double p=
                    (sc.nextInt()
                            +
                            sc.nextInt()
                            +
                            sc.nextInt())
                            /3.0;

            System.out.println(
                    p+" "+grade(p)
            );

        }

    }

}