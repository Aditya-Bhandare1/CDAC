 //Write a program to reverse the digits of the number 1234. The output should be 4321. 
class ReverseOrder{
  public static void main(String[] args) {

    int num = 1234, reversed = 0;
    
    System.out.println("Original Number: " + num);

    
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}