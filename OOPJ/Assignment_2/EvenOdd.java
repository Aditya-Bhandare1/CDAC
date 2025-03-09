/*  Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check. */

class EvenOdd{

static String EvenOddMethod(int n){

if((n^1)==n+1)
return "even";
else
return "odd";



}


public static void main(String args[]){
int n=10;


System.out.println(EvenOddMethod(n));




}



}