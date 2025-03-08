/* 19. Calculate the Power of a Number 
Write a Java program that calculates the power of a number. Take two numbers as input: the 
base and the exponent, and compute the result of base raised to the power of exponent. 
Test Data: 
 Input base number: 3 
 Input exponent number: 4 
Expected Output: 
3 raised to the power 4 is 81 */


import java.util.Scanner; 
class Power{

	// Function to calculate N raised to the power P
	static int power(int N, int P)
	{
		if (P == 0)
			return 1;
		else
			return N * power(N, P - 1);
	}

	// Driver code
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    int N = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    int P = myObj.nextInt(); // Read user input

		System.out.println(power(N, P));
	}
}
