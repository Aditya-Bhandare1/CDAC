import java.util.Scanner;

class BooleanInput{

public static void main(String args[])

{

boolean a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Boolean value");
a=sc.nextBoolean();
b=sc.nextBoolean();
c=sc.nextBoolean();



System.out.println(a&&b||c);



}


}