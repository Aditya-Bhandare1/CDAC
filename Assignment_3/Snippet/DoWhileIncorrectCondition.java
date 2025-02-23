//Snippet 3:  
public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; //1
        } while (num < 0);
 
 
    } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop?

/*Answer : The loop is not executing once its going in infinite loop 

Solution : To execute loop once we have to make change in while as (num<0)*/