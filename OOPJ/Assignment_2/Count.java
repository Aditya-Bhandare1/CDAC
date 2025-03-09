import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int num = scanner.nextInt();

        int count = 0;
        int n = num;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of representation: " + count);

        scanner.close();
    }
}
