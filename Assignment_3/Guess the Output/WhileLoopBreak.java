//Snippet 3:  
public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this while loop. 


/* DryRun 

Count     Count value print 
0            0
1            1
2            2
3            

outer statement will print value as 3

final output 
0 1 2 3

*/