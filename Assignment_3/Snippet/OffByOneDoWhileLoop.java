//Snippet 8:  
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; //initialisation on num
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 6); 
    } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5? 

/*Current: it print only 1 as ouput
Solution: to print 1 to 5 we have to modify 1) num++ 2) while (num<6)*/