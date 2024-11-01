import java.util.Scanner;

public class IT24103834Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        
        double discount = totalBill * 0.10;
        
        double amountToPay = totalBill - discount;
        
        System.out.println("Original Total Bill: $" + totalBill);
        System.out.println("Discount (10%): $" + discount);
        System.out.println("Amount to Pay after Discount: $" + amountToPay);
        
        scanner.close();
    }
}