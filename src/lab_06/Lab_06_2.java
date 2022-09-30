package lab_06;

import java.util.Scanner;

public class Lab_06_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        int isValid = 0;
        while (isValid < 3) {
            System.out.print("Input your password: ");
            String input = scanner.nextLine();
            if (input.equals(myPassword)) {
                System.out.println("Your password is correct!");
                break;
            }
            isValid++;
            if (isValid == 3) {
                System.out.println("Please try again later!");
                break;
            }

        }
    }
}
