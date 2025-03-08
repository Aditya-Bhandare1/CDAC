import java.util.Scanner;

public class GradeClassification 
{
    public static void main(String args[])
    {
   
      
        
        float marks;
        Scanner scanner = new Scanner(System.in);
		
System.out.print("Enter Marks of Subject");
           marks = scanner.nextInt();
        scanner.close();
        
        System.out.print("The student Grade is: ");
        if(marks>=90)
        {
            System.out.print("A");
        }
        else if(marks>=80 && marks<89)
        {
           System.out.print("B");
        } 
        else if(marks>=70 && marks<79)
        {
            System.out.print("C");
        }
else if(marks>=60 && marks<69)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}