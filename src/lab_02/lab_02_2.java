package lab_02;

import java.util.Scanner;

public class lab_02_2 {
    public static void main(String[] args) {
        //Allow user to input a number, print out it’s an odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        double myNum = scanner.nextDouble();
        double result = myNum % 2;
        System.out.print(myNum + " % 2 = " + result + " hence ");
        if (result == 0 )
            System.out.println(myNum + " is an even number!");
        else
            System.out.println(myNum + " is an odd number!");
    }
}