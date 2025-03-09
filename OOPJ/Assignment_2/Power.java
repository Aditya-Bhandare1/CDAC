import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

     
        boolean PowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);

        System.out.println(num + " is " + (PowerOfTwo ? "a power of 2" : "not a power of 2"));

        scanner.close();
    }
}
