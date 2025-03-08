//3. Write a program to convert a double value to int using typecasting and explain the data loss.
class ConvertToInt1{
public static void main(String args[])
{
	double j=500.1234;
int i=(int)j;
System.out.print("Double"+j+"int"+i);

}




}


/*
The decimal part (fractional value) is lost when casting.
Example: 500.1234(the .1234 is truncated, not rounded).
The value is not rounded but simply truncated towards zero.*/