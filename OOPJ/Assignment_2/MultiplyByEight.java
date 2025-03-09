import java.util.Scanner;

class MultiplyByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        int result = num << 3;

        System.out.println("Result after multiplying by 8: " + result);

        scanner.close();
    }
}
