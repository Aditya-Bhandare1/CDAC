

public class Demo25{
  
    public static void printPattern(int n)
    {
        int i, j;
        
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
               
               
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}