public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 


/* error: 'main' method is not declared 'public static'
 Making the main() method public makes it globally available. It is made public so that JVM can invoke it from outside the class as it is not present in the current class. */