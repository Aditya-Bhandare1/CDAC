/*8. Swap Two Numbers 
Write a Java program to swap the values of two variables without using a third variable.*/

public class Swap  {
 
    public static void main(String[] args)
    {
        int x = 10, y = 20;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

       
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
