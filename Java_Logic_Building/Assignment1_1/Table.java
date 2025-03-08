import java.util.Scanner;
 
public class Table{
 
 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
   

  System.out.print("Input a number: ");
  

  int num1 = in.nextInt();
   
  // Use a loop to calculate and print the multiplication table for the input number
  for (int i = 0; i < 10; i++) {
     // Calculate and print the result of num1 multiplied by (i+1)
     System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
  }
 }
}
                                                                 