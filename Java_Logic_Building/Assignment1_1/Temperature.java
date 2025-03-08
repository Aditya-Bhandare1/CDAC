/* 18. Convert Celsius to Fahrenheit 
Write a Java program to convert a temperature from Celsius to Fahrenheit. 
Test Data: 
 Input temperature in Celsius: 25 
Formula: Fahrenheit = (Celsius * 9/5) + 32 
Expected Output: 
25°C is equal to 77.0°F*/

public class Temperature  
 {  
   public static void main (String args[])  
    { float Fahrenheit, Celsius;  
          Celsius= 25;  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }}  