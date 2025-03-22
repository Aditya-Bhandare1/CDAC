class Student{
private String name;
private int s1,s2,s3;
public void studentNew(String name,int s1,int s2,int s3){
this.name=name;
this.s1=s1;

this.s2=s2;
this.s3=s3;


}
public int total (){
return s1+s2+s3;


}

public double average(){
return (s1+s2+s3)/3.0;


}


public void display(){

System.out.println("Name"+name);
System.out.println("Total "+total ());
System.out.println("Average"+ average());


}




public static void main(String args[]){
Student student = new Student();
student.studentNew("ABC",85,85,86);
        student.display();



}
}