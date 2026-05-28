import java.util.Calendar;
import java.util.Scanner;

public class Prob9 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int month=sc.nextInt();

        int year=sc.nextInt();

        Calendar c=
                Calendar.getInstance();

        c.set(year,month-1,1);

        int first=
                c.get(Calendar.DAY_OF_WEEK);

        int days=
                c.getActualMaximum(
                        Calendar.DATE
                );

        System.out.println(
                "Sun Mon Tue Wed Thu Fri Sat"
        );

        for(int i=1;i<first;i++)
            System.out.print("    ");

        for(int d=1;d<=days;d++){

            System.out.printf("%3d ",d);

            if((d+first-1)%7==0)

                System.out.println();

        }

    }

}