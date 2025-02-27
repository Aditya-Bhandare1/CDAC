//Snippet 22:  
public class Main22 { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
/*What syntax error occurs? Can a method be declared inside another method?
error: Main22.java:4: error: illegal start of expression
        static void displayMessage() {
        ^
Main22.java:8: error: class, interface, or enum expected
}
^
2 errors
Ans Java is not designed to support nested methods.
Java follows OOP principles, so methods belong to classes or objects, not other methods.
Instead, Java allows inner classes, anonymous classes, and lambdas for similar functionality.
 */

