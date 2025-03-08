//Write a program to calculate the average of three int numbers using typecasting to display the result in double

public class AverageCalculation {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 35;

        double average = (double) (num1 + num2 + num3) / 3;


        System.out.println("Average of the three numbers: " + average);
    }
}
