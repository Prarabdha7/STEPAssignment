import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double h = height / 100.0;
            double bmi = weight / (h * h);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + " " + personData[i][0] + " " + personData[i][2] + " " + weightStatus[i]);
        }
    }
}