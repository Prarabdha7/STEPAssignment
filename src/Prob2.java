
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years the employee has been in service: ");
        int yearsOfService = sc.nextInt();
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        double bonus = 0.0;
        if(yearsOfService>=5){
            bonus = 0.05 * salary;
        }
        System.out.println("The employee's bonus is: " + bonus);
    }
    
}
