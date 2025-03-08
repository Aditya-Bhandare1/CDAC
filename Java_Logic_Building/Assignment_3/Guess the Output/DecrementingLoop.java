//Snippet 2:  
public class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; // total variable initilisation 
        for (int i = 5; i > 0; i--) { 
            total += i; 

            if (i == 3) continue; 
            total -= 1; 

        } 
        System.out.println(total); 
    } 
} 
// Guess the output of this loop. 

/*Dryrun :

i     total=total+i      total=total-1
5     5                     4
4     8                     7
3     10                    
2     12                    11
1     12                    11

output : 11*/