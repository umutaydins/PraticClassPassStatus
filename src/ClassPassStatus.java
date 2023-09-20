import java.util.Scanner;

public class ClassPassStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Math grade (between 0-100): ");
        int mathGrade = scanner.nextInt();
        if (mathGrade < 0 || mathGrade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Enter your Physics grade (between 0-100): ");
        int physicsGrade = scanner.nextInt();
        if (physicsGrade < 0 || physicsGrade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Enter your Turkish grade (between 0-100): ");
        int turkishGrade = scanner.nextInt();
        if (turkishGrade < 0 || turkishGrade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Enter your Chemistry grade (between 0-100): ");
        int chemistryGrade = scanner.nextInt();
        if (chemistryGrade < 0 || chemistryGrade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Enter your Music grade (between 0-100): ");
        int musicGrade = scanner.nextInt();
        if (musicGrade < 0 || musicGrade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        double average = (mathGrade + physicsGrade + turkishGrade + chemistryGrade + musicGrade) / 5.0;

        if (average >= 55) {
            System.out.println("Your average is " + average + " and you have passed the class!");
        } else {
            System.out.println("Your average is " + average + " and you have failed the class.");
        }

        scanner.close();
    }
}
