//Snippet 4:  
public class OffByOneErrorForLoop { 

    public static void main(String[] args) { 
        for (int i = 1; i < 11; i++) { 


            System.out.println(i); 
        } 
       
    } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output? 

//Loop executing as expected 