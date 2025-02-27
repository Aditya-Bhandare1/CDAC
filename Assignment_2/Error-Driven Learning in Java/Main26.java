//Snippet 26:  
public class Main26{ 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 1: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
/* Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block? 
Ans:  Two cases cannot have the same value. The data type of variable in the switch needs to be the same as all test cases' values. The value for the cases needs to be literal or constant but not a variable */