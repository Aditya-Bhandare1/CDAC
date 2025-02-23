//Write a program to find and print the largest digit in the number 4825. 

class LargestNumber
{ 
	

static void Digits(int n) 
{ 
	int largest = 0; 
	
	while(n != 0) 
	{ 
		int r = n % 10; 

		// Find the largest digit 
		largest = Math.max(r, largest); 

		
		n = n / 10; 
	} 
	System.out.println(largest + " " ); 
} 

// Driver code 
public static void main (String[] args)
{ 
	int n = 4825; 

	// Function call 
	Digits(n); 

} 
} 
