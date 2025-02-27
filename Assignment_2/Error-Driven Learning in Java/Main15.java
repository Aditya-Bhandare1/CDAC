//Snippet 15:  
public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
} 
/* What error occurs when compiling this code? How should you handle different data types 
in operations? 

error :Main15.java:6: error: incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;
                          ^
1 error


modify :  int result = num1 + num2;    to Double result = num1 + num2; */