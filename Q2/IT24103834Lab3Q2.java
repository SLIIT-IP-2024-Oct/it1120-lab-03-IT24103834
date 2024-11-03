import java.util.Scanner;

public class IT24103834Lab3Q2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        int otHours = input.nextInt();

        System.out.print("Enter the OT hourly rate: ");
        double otRate = input.nextDouble();

        double otAmount = otHours * otRate;

        double totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}
