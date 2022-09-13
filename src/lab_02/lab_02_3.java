package lab_02;

import java.util.Scanner;

public class lab_02_3 {
    public static void main(String[] args) {
        /*
        Lab 2.1:
            Get input from user about height(m) and weight(kg) then calculate BMI

            Underweight = <18.5
            Normal weight = 18.5 – 24.9
            Overweight = 25–29.9
            Obesity = BMI of 30 or greater

            BMI = weight / (height x 2)

        Lab 2.3(Optional):
            Lab 2.1 + Suggest user to increase/decrease weight
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height(m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight(kg): ");
        float weight = scanner.nextFloat();
        float yourBMI = weight / (height * 2);
        float underWeight = 18.5f;
        float normalWeight = 25f;
        float overWeight = 30f;
        float min;
        float max;

        System.out.printf("Your BMI number is %f\n", yourBMI);
        //Underweight = <18.5
        if (yourBMI < underWeight)
        {
            System.out.println("You are Underweight!");
            min = underWeight * (height * 2) - weight;
            max = normalWeight * (height * 2) - weight;
            System.out.println("Gain at least " + min + " to maximum " + max + " kg to be healthier!");
        }
        //Normal weight = 18.5 – 24.9
        else if (yourBMI < normalWeight)
        {
            System.out.println("You are in Normal weight!");
            max = normalWeight * (height * 2) - weight;
            min = weight - underWeight * (height * 2);
            if (yourBMI == underWeight)
                System.out.println("Keep it up or flexibility gain maximum " + max + " kg to keep in good shape!");
            else
                System.out.println("However, you can flexibility lose maximum " + min + " or gain maximum " + max + " kg to keep in good shape!");
        }
        //Overweight = 25–29.9
        else if (yourBMI < overWeight)
        {
            System.out.println("You are Overweight!");
            min = weight - underWeight * (height * 2);
            max = overWeight * (height * 2) - weight;
            System.out.println("Lose at least " + max + " to maximum " + min + " kg to keep in good shape!");

        }
        //Obesity = BMI of 30 or greater
        else
        {
            System.out.println("You are Obesity!");
            max = weight - normalWeight * (height * 2);
            min = weight - underWeight * (height * 2);
            System.out.println("Lose at least " + max + " but less than " + min + " kg to keep in good shape!");
        }
    }
}
