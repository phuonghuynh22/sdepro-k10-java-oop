package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_2 {
    public static void main(String[] args) {
        findMaxMin(intArr());
    }
    public static int[] intArr(){
        //Inputting array length
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to add to an array: ");
        int arrayLength = scanner.nextInt();

        //Adding numbers to the array
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please input a number: ");
            intArray[i] = scanner.nextInt();
        }

        //Printing the input array
        System.out.println("Input array: " + Arrays.toString(intArray));
        return intArray;
    }
    public static void findMaxMin(int[] intArray){
        //finding min/ max number
        int min = intArray[0];
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min)
                min = intArray[i];
            else
                max = intArray[i];
        }
        //printing out min/max number
        System.out.print("Minimum: " + min);
        System.out.print("\nMaximum: " + max);
    }
}
