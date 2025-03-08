import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the total purchase amount: Rs. ");
        double totalAmount = scanner.nextDouble();


        double discount = 0;

      
        if (totalAmount >= 1000) {
            discount = 20; // 20% discount
        } else if (totalAmount >= 500) {
            discount = 10; // 10% discount
        } else {
            discount = 5;  // 5% discount
        }

        
        double discountAmount = (totalAmount * discount) / 100;


        double finalAmount = totalAmount - discountAmount;

        // Display the results
        System.out.println("Total Purchase Amount: Rs. " + totalAmount);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Amount after Discount: Rs. " + finalAmount);

        scanner.close();
    }
}
