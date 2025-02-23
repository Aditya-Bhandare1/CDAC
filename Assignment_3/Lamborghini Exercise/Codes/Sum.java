//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6)
class Sum{
    public static void main(String[] args) {
        int n = 9876;
          int sum = 0;
        while (n != 0) {

            
            int last = n % 10;

            
            sum += last;

            // Remove the last digit
            n /= 10;
        }

System.out.println(sum);
    }
}