//Snippet 6:  
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {
            System.out.println(i); 
            System.out.println("Done"); 
    } }
} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to include all statements within the loop? 
/*As Done is print only once because if we mention for loop withput curly brackets it will print immediate next statement .
Solution: we have to mention two statements in curly brackets */  