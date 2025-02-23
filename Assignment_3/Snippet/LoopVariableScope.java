//Snippet 12:  
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
System.out.println(x); 
        } 
         
    } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope 

/* Solution: int x scope is only for the for loop not outside so its not accessible 
we have to print valus x inside the for loop */