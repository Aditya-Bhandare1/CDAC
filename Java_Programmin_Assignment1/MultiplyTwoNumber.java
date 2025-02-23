/*5. Multiply Two Numbers 
Write a Java program that takes two numbers as input and displays the product of the two 
numbers. 
Test Data: 
 Input first number: 25 
 Input second number: 5 */

import java.util.Scanner; 
class MultiplyTwoNumber{

public static void main(String []args)

{

int x, y, mul;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input

    mul= x * y;  // Calculate the sum of x + y
    System.out.println("Multiplication is: " + mul); 



}



}