//Snippet 17:  
public class Main17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a * b; 
        System.out.println(result); 
    } 
} 
/* What compilation error occurs? Why is the ** operator not valid in Java?

error : Main17.java:6: error: illegal start of expression
        int result = a ** b;
                        ^
1 error
** this operation illegal.
modified from int result = a ** b;  to int result = a * b;  */