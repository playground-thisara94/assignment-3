import java.util.Scanner;

public class Assignment3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        entireCode:
        {

            // System.out.print("Enter your name: ");
            // String name = scanner.nextLine();

            // if (name.startsWith(" ") | name.length()==0) {
            //     System.out.printf("%sInvalid Name%s \n","\033[31m","\033[30m");
            //     break entireCode;
            // }

            // System.out.print("Enter your age: ");
            // int age = scanner.nextInt();

            // if (age < 10 | age > 18) {
            //     System.out.printf("%sInvalid Age%s \n","\033[31m","\033[30m");
            //     break entireCode;
            // }

            //scanner.nextLine();

            System.out.print("Enter your Subject 1: ");
            String subject1 = scanner.nextLine();

            if (!subject1.startsWith("SE-")) {
                System.out.printf("%sInvalid Subject%s \n","\033[31m","\033[30m");
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject1+": ");
            int marks1 = scanner.nextInt();

            if (marks1 < 0 | marks1 > 100) {
                System.out.printf("%sInvalid Marks%s \n","\033[31m","\033[30m");
                break entireCode;
            }

            scanner.nextLine();

            System.out.print("Enter your Subject 2: ");
            String subject2 = scanner.nextLine();

            if (!subject2.startsWith("SE-") | subject2.equals(subject1)) {
                System.out.printf("%sInvalid Subject%s \n","\033[31m","\033[30m");
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject2+": ");
            int marks2 = scanner.nextInt();

            if (marks2 < 0 | marks2 > 100) {
                System.out.printf("%sInvalid Marks%s \n","\033[31m","\033[30m");
                break entireCode;
            }

            scanner.nextLine();

            System.out.print("Enter your Subject 3: ");
            String subject3 = scanner.nextLine();

            if (!subject3.startsWith("SE-") | subject3.equals(subject1) | subject3.equals(subject2)) {
                System.out.printf("%sInvalid Subject%s \n","\033[31m","\033[30m");
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject3+": ");
            int marks3 = scanner.nextInt();

            if (marks3 < 0 | marks3 > 100) {
                System.out.printf("%sInvalid Marks%s \n","\033[31m","\033[30m");
                break entireCode;
            }

        }

    }
}