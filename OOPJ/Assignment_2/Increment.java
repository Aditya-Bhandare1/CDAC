import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        int incrementedNum = -~num;

        System.out.println("Incremented value: " + incrementedNum);

        scanner.close();
    }
}
