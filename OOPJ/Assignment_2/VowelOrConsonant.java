import java.util.Scanner;
class VowelOrConsonant{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter char");
char ch= sc.next().charAt(0);
String i=(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') ?"Vowel": "Not Vowel ";
System.out.println(i);


}

}