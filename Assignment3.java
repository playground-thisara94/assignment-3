import java.util.Scanner;

public class Assignment3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        entireCode:
        {

            String red = "\033[31m";
            String white = "\033[30m";

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.startsWith(" ") | name.length()==0) {
                System.out.printf("%sInvalid Name%s \n",red,white);
                break entireCode;
            }

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 10 | age > 18) {
                System.out.printf("%sInvalid Age%s \n",red,white);
                break entireCode;
            }

            scanner.nextLine();

            System.out.print("Enter your Subject 1: ");
            String subject1 = scanner.nextLine();

            if (!subject1.startsWith("SE-")) {
                System.out.printf("%sInvalid Subject%s \n",red,white);
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject1+": ");
            double marks1 = scanner.nextDouble();

            if (marks1 < 0 | marks1 > 100) {
                System.out.printf("%sInvalid Marks%s \n",red,white);
                break entireCode;
            }

            scanner.nextLine();

            System.out.print("Enter your Subject 2: ");
            String subject2 = scanner.nextLine();

            if (!subject2.startsWith("SE-") | subject2.equals(subject1)) {
                System.out.printf("%sInvalid Subject%s \n",red,white);
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject2+": ");
            double marks2 = scanner.nextDouble();

            if (marks2 < 0 | marks2 > 100) {
                System.out.printf("%sInvalid Marks%s \n",red,white);
                break entireCode;
            }

            scanner.nextLine();

            System.out.print("Enter your Subject 3: ");
            String subject3 = scanner.nextLine();

            if (!subject3.startsWith("SE-") | subject3.equals(subject1) | subject3.equals(subject2)) {
                System.out.printf("%sInvalid Subject%s \n",red,white);
                break entireCode;
            }

            System.out.print("Enter your Marks of "+subject3+": "); 
            double marks3 = scanner.nextDouble();

            if (marks3 < 0 | marks3 > 100) {
                System.out.printf("%sInvalid Marks%s \n",red,white);
                break entireCode;
            }

            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();


            double total = marks1 + marks2 + marks3;
            double average = total/3;
            String status = average>=75 ? "\033[34;1mDP\033[30;0m" : 
                            average>=65 ? "\033[32;1mCP\033[30;0m" : 
                            average>=55 ? "\033[33;1mP\033[30;0m" : "\033[31;1mF\033[30;0m";
            
            String status1 = marks1>=75 ? "\033[34mDP\033[30m" : 
                            marks1>=65 ? "\033[32mCP\033[30m" : 
                            marks1>=55 ? "\033[33mP\033[30m" : "\033[31mF\033[30m";

            String status2 = marks2>=75 ? "\033[34mDP\033[30m" : 
                            marks2>=65 ? "\033[32mCP\033[30m" : 
                            marks2>=55 ? "\033[33mP\033[30m" : "\033[31mF\033[30m";

            String status3 = marks3>=75 ? "\033[34mDP\033[30m" : 
                            marks3>=65 ? "\033[32mCP\033[30m" : 
                            marks3>=55 ? "\033[33mP\033[30m" : "\033[31mF\033[30m";

            System.out.printf("Name : %s%s%s \n","\033[34;1m",name.toUpperCase(),"\033[30;0m");
            System.out.printf("Age : %s years old \n",age);
            System.out.printf("Status : %s \n",status);
            System.out.printf("Total : %.2f     Avg : %.2f%s \n", total,average,"%");
            System.out.println();
            System.out.printf("+%s+%2$s+%2$s+ \n", "-".repeat(10),"-".repeat(8));
            System.out.printf("|%-10s|%8s|%8s| \n", "Subject", "Marks", "Status");
            System.out.printf("+%s+%2$s+%2$s+ \n", "-".repeat(10),"-".repeat(8));
            System.out.printf("|SE-%03d%s|% 8.2f|%18s| \n", Integer.valueOf(subject1.substring(3))," ".repeat(4),marks1,status1);
            System.out.printf("|SE-%03d%s|% 8.2f|%18s| \n", Integer.valueOf(subject2.substring(3))," ".repeat(4),marks2,status2);
            System.out.printf("|SE-%03d%s|% 8.2f|%18s| \n", Integer.valueOf(subject3.substring(3))," ".repeat(4),marks3,status3);
            System.out.printf("+%s+%2$s+%2$s+ \n", "-".repeat(10),"-".repeat(8));
        }

    }
}