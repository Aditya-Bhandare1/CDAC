//Snippet 14:  
public class Main14 { 
    public static void main(String[] args) { 
        String num = "Hello"; 
        System.out.println(num); 
    } 
} 

/*error : Main14.java:4: error: incompatible types: String cannot be converted to double
        double num = "Hello";
                     ^
1 error



modified double num = "Hello";   to String num ="Hello"; */