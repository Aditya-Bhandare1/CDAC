import java.util.Scanner;

class AbsoluteValueBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value : ");
        int num = scanner.nextInt();

        
        int mask = num >> 31;  
        int abs = (num + mask) ^ mask; 
        System.out.println("Absolute value: " + abs);

        scanner.close();
    }
}
