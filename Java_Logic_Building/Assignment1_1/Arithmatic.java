import java.util.Scanner; 

class Arithmatic{
  public static void main(String[] args) {
    int x, y, sum,sub,mul,div,mod;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = myObj.nextInt();

    System.out.println("Type another number:");
    y = myObj.nextInt();

    sum = x + y;
sub=x-y;
mul=x*y;
div=x/y;
mod=x%y;
  
    System.out.println("" + sum +" " + sub +" "+ mul +" "+ div +" "+ mod); 
} 
}