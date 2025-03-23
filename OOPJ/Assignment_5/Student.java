import java.util.Scanner;
import java.util.InputMismatchException;

class Student{

private String name;
private int rollNo;
private double marks[];
private char grade ; 
private double average;

Student(String name , int rollNo,double marks[]){

this.name=name;
this.rollNo=rollNo;

for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
        }
this.marks=marks;

}

 void calculateAverage(){
double sum=0;
for(int i=0;i<marks.length;i++)
sum=sum+marks[i];

average =sum/marks.length;



}

 void calculateGrade()
{

if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
           grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }






}

 public void displayStudentInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade );
    }


public static void main(String args[]){
Scanner sc=new Scanner(System.in);


try{

System.out.println("Enter name");
String name =sc.nextLine();
System.out.println("Enter roll number");
int rollNo=sc.nextInt();
double marks[]=new double[5];
System.out.println("Enter marks");
for(int i=0;i<marks.length;i++){
marks[i]=sc.nextDouble();
}

Student student = new Student(name,rollNo,marks);

student.calculateAverage();
student.calculateGrade();
student.displayStudentInfo();


}catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numeric values for roll number and marks.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }

}


}