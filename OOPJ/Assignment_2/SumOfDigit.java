import java.util.Scanner;

class SumOfDigit{

static int sum=0;
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.println("Enter value");
int i= sc.nextInt();

while (i>0){

int digit=i%10;
sum=sum+digit;

i=i/10;



}

System.out.println(sum);




}



}