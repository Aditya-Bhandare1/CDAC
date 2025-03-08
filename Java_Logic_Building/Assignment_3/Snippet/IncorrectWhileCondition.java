//Snippet 2:  
public class IncorrectWhileCondition { 
   public static void main(String[] args) { 
        int count = 5; 
        while (count >= 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop? 


/*error: IncorrectWhileCondition.java:6: error: incompatible types: int cannot be converted to boolean
        while (count = 0) 

solution : Condition given in while is wrong .It should be count>=0 to run the loop as expected .*/