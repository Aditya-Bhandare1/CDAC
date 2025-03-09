import java.util.Scanner;
class CheckRange{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
System.out.print("Enter a number");
int i=sc.nextInt();
String s= (i>=20&&i<=50) ?("The number is in the range"):("The number is not in the range");

System.out.print(s);




}



}