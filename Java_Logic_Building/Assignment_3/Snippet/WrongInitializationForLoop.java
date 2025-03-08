//Snippet 5:  
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i <= 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the initialization and update statements in the `for` loop? 

//no error as loop is going in infinte times .

//modification in initialise i=0 and i<=10

