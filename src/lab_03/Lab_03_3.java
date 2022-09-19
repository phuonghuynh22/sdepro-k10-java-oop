package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_3 {
    public static void main(String[] args) {
        int[] inputArray = inputArr();
        sortingArr(inputArray);
    }
    public static int[] inputArr(){
        Scanner scanner = new Scanner(System.in);

        //Inputting the array's length
        System.out.print("How many integer numbers do you want to add: ");
        int arrLength = scanner.nextInt();
        int[] inputArray = new int[arrLength];//{5,7,3,1,9,0,4,-1,2,1,2}

        //Adding numbers into the array from keyboard
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Please input a number: ");
            inputArray[i] = scanner.nextInt();
        }

        //Printing out the input array
        System.out.println("Input array: " + Arrays.toString(inputArray));
        return inputArray;
    }
    public static void sortingArr(int[] inputArray){
        //Sorting numbers
        int a = 0;
        while (a < inputArray.length) {
            for (int i = a + 1; i< inputArray.length; i++) {
                int max = inputArray[a];
                if (inputArray[a] > inputArray[i]){
                    inputArray[a] = inputArray[i];
                    inputArray[i] = max;
                }
            }
            a++;
        }
        //Printing out the sorted array
        System.out.println("Sorted array: " + Arrays.toString(inputArray));
    }
}
