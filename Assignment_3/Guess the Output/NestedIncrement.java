//Snippet 7:  
public class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
} 
// Guess the output of this code snippet.

/*
value of a   In use a         value of b        In use b
11           11                4                 5
10           10                5                 4


11*5-10+4 */
                