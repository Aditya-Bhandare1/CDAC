import java.util.Scanner;
 class SwapOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        int evenBits = num & 0xAAAAAAAA; 
        int oddBits = num & 0x55555555;  

        
        int swappedNum = (evenBits >> 1) | (oddBits << 1);

        System.out.println("Number after swapping odd and even bits: " + swappedNum);

        scanner.close();
    }
}
