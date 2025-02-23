//Snippet 10:  
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 

/*error we got: incompatible types: int cannot be converted to boolean
        while (num = 10) {
                   ^
Solution : we have to update condition while(num==10)*/