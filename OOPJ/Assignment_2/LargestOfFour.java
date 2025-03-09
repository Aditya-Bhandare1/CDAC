class LargestOfFour{

public static void main(String args[]){
int n1=20,n2=50,n3=10,n4=50;
int max=(n1>n2&&n1>n3&&n1>n4) ? n1:((n2>n3&& n2>n4)?n2:(n3>n4?n3:n4));
System.out.println("Max value= "+max);

}


}