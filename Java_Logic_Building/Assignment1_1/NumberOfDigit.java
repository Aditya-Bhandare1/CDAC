/*20. Count the Number of Digits in a Number 
Write a Java program that counts the number of digits in a given number. 
Test Data: 
 Input number: 123456 
Expected Output: 
The number 123456 has 6 digits.*/



class NumberOfDigit{

    // function to count digits
    static int countDigit(int n) {
        // Base case
        if (n == 0)
            return 1;

        int count = 0;
      
        // Iterate till n has digits remaining
        while (n != 0) {
          
            // Remove rightmost digit
            n = n / 10;
          
            // Increment digit count by 1
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println( countDigit(n));
    }
}