//Snippet 25:  
/*public class Main25{ 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work? 
Ans: A switch statement works with the following primitive types and their wrappers:

byte
short
char
int
In addition, you are allowed to switch on an enum or String (since Java 5). However, Boolean, long, float, and double types are prohibited.*/ 


public class Main25{ 
    public static void main(String[] args) { 
        int score = 85; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 