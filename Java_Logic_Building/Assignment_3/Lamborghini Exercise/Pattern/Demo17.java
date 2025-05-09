

public class Demo17{

    
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printPattern(n);
    }
}