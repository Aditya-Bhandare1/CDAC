//Write a program to find and print the first 5 prime numbers.

public class Prime
{  
public static void main(String[] args)   
{  
int ct=0,n=0,i=1,j=1;  
while(n<5)  
{  
j=1;  
ct=0;  
while(j<=i)  
{  
if(i%j==0)  
ct++;  
j++;   
}  
if(ct==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}  
}  
}  