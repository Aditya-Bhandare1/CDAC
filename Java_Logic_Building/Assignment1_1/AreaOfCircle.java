/*9. Calculate the Area of a Circle 
Write a Java program that calculates the area of a circle. */


public class AreaOfCircle{
	public static void main(String[] args)
	{
		int radius;
		double pi = 3.142, area;
		radius = 7;
		
		area = pi * radius * radius;
		
		System.out.println("Area of circle is :" + area);
	}
}
