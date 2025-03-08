//Snippet 6:  
public class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 

        System.out.println(y); 
    } 
} 
// Guess the output of this code snippet.

/*dry run 
x=5
calculation             value of x      value of x in use 
++x                      6                  6

x--                      5                  6

--x                      4                  4

x++                      5                   4

Output is 8 */