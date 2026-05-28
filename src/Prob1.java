import java.util.Scanner;

public class Prob1 {

    static double[][] calculateBMI(double data[][]){

        double bmi[][]=new double[10][1];

        for(int i=0;i<10;i++){

            double weight=data[i][0];

            double height=data[i][1]/100.0;

            bmi[i][0]=weight/(height*height);

        }

        return bmi;
    }

    static String status(double bmi){

        if(bmi<18.5) return "Underweight";

        if(bmi<25) return "Normal";

        if(bmi<40) return "Overweight";

        return "Obese";

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        double data[][]=new double[10][2];

        for(int i=0;i<10;i++){

            data[i][0]=sc.nextDouble();

            data[i][1]=sc.nextDouble();

        }

        double bmi[][]=calculateBMI(data);

        for(int i=0;i<10;i++){

            System.out.println(
                    data[i][0]+" "
                    +data[i][1]+" "
                    +bmi[i][0]+" "
                    +status(bmi[i][0])
            );

        }

    }

}