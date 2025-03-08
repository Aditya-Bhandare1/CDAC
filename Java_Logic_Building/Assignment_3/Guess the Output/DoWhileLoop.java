//Snippet 4:  
public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
// Guess the output of this do-while loop.



/*DryRun
i         inner print    outer print
1          1
2          2
3          3
4          4                 
5                             5


output : 1 2 3 4 5 */