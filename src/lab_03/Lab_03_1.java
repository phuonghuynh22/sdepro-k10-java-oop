package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_1 {
    public static void main(String[] args) {
        countOddOrEvenNumber(inputArr());
    }
    public static int[] inputArr(){
        //Inputting array length
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to add to an array: ");
        int arrayLength = scanner.nextInt();

        //Adding numbers to the array
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please input a number: ");
            inputArray[i] = scanner.nextInt();
        }

        //Printing the input array
        System.out.println("Input array: " + Arrays.toString(inputArray));
        return inputArray;
    }
    public static void countOddOrEvenNumber(int[] inputArray){
        //counting odd and even numbers
        int odd = 0;
        int even = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.print("Even numbers: " + even);
        System.out.print("\nOdd numbers: " + odd);
    }
}
