import java.util.Scanner;
class ArithmaticOperations{

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter first number");
int x=sc.nextInt();

System.out.println("Enter second number");
float y=sc.nextFloat();

int sum=(int)(x+y);

int sub=(int)(x-y);
int mul=(int)(x*y);
float div=x/y;
float mod=x%y;
System.out.println("Sum is:"+ sum +"Sub is "+ sub +" " + mul +" "+ div +" "+ mod);

}


}