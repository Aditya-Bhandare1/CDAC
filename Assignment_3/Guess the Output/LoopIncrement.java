//Snippet 8:  
public class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
 
 
} 
// Guess the output of this code snippet.
/*i=0  count=0
i    count
0    -2
1     -4
2
3
4 

Output is -4
 */