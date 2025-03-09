import java.util.Scanner;

public class DivisibilityByThree {
    
 
    static boolean isDivisibleBy3(int num) {
        num = Math.abs(num);
        
        while (num > 2) {
            int sum = 0;

            
            while (num > 0) {
                sum += (num & 1); 
                num >>= 1;        
            }
            
            num = sum; 
        }

        return num == 0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleBy3(number)) {
            System.out.println(number + " is divisible by 3.");
        } else {
            System.out.println(number + " is NOT divisible by 3.");
        }

        scanner.close();
    }
}
