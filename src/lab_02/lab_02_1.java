package lab_02;

import java.util.Scanner;

public class lab_02_1 {
    public static void main(String[] args) {
        /*
        Lab 2.1:
            Get input from user about height(m) and weight(kg) then calculate BMI

            Underweight = <18.5
            Normal weight = 18.5 – 24.9
            Overweight = 25–29.9
            Obesity = BMI of 30 or greater

            BMI = weight / (height x 2)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height(m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight(kg): ");
        float weight = scanner.nextFloat();

        float yourBMI = weight / (height * 2);
        System.out.printf("Your BMI number is %f\n", yourBMI);
    }
}
