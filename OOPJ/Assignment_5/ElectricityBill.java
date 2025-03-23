import java.util.Scanner;
class ElectricityBill{

private String customerName;
private double unitsConsumed;
private double billAmount;


ElectricityBill(String customerName, double unitsConsumed){



if (unitsConsumed<=0)
{
        throw new IllegalArgumentException("unitsConsumed is negative");
    }
this.customerName=customerName;
this.unitsConsumed=unitsConsumed;



}
void calculateBillAmount(){
if(unitsConsumed<=100){
billAmount=unitsConsumed*5;
}else if(unitsConsumed>=101||unitsConsumed<=300){
billAmount=unitsConsumed*7;

}else{
billAmount=unitsConsumed*10;

}
System.out.println("customerName :"+ customerName+" unitsConsumed: "+ unitsConsumed+" billAmount : "+billAmount);


}



public static void main(String args[])
{
Scanner sc=new Scanner (System.in);


try{
System.out.println("Name");
String customerName1=sc.nextLine();;
System.out.println("Units");
double unitsConsumed1=sc.nextDouble();
ElectricityBill e=new ElectricityBill(customerName1,unitsConsumed1);

e.calculateBillAmount();



}
catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

}catch (Exception e) {
            System.out.println("Invalid Type");
}
}

}