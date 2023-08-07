import java.util.Scanner;

public class Assignment3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        entireCode:
        {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.startsWith(" ") | name.length()==0) {
                System.out.printf("%sInvalid Name!%s \n","\033[31m","\033[30m");
                break entireCode;
            }

        }

    }
}