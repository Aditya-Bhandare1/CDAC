import java.util.Scanner;

public class StudentStatus{

    public static void checkPassOrFail(int[] grades) {
        int failedSubjects = 0;

       
        for (int grade : grades) {
            if (grade < 40) {
                failedSubjects++;
            }
        }

      
        if (failedSubjects == 0) {
            System.out.println("The student is pass");
        } else {
            System.out.println("The student failed in " + failedSubjects + " subject(s)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three subjects
        int[] grades = new int[3];
        System.out.println("Enter the grades for three subjects:");
        for (int i = 0; i < 3; i++) {
            grades[i] = scanner.nextInt();
        }

        
        checkPassOrFail(grades);

        scanner.close();
    }
}
