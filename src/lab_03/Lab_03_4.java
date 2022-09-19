package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a same length for 2 arrays: ");
        int arrLength = scanner.nextInt();
        System.out.println("----- First array:");
        int[] firstArr = inputArray(arrLength);
        System.out.println("\n----- Second array: ");
        int[] secondArr = inputArray(arrLength);
        sortingArray(mergingArray(firstArr,secondArr,arrLength));
    }

    public static int[] inputArray(int arrLength){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[arrLength];

        //Adding numbers into the array from keyboard
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Please input a number: ");
            intArray[i] = scanner.nextInt();
        }

        //Printing out the input array
        System.out.println("Input array: " + Arrays.toString(intArray));

        //sorting array after inputting
        sortingArray(intArray);
        return intArray;
    }
    public static void sortingArray(int[] inputArray){
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
    public static int[] mergingArray(int[] firstArr, int[] secondArr, int arrLength){
        int a = 0;
        int mergedArrLength = arrLength*2;
        int[] mergedArr = new int[mergedArrLength];

        //merging 2 arrays with the same length
        while (a <= mergedArrLength) {
            for (int i = 0; i < firstArr.length; i = i + 1) {
                if (firstArr[i] < secondArr[i]) {
                    mergedArr[a] = firstArr[i];
                    mergedArr[a + 1] = secondArr[i];
                } else {
                    mergedArr[a] = secondArr[i];
                    mergedArr[a + 1] = firstArr[i];
                }
                a = a + 2;
                if (a == mergedArrLength)
                    break;
            }
            break;
        }
        System.out.println("\n\n> > > > Merged but not sorted....: "+Arrays.toString(mergedArr));
        System.out.println("\n> > > > Starting to sort the merged array......");
        return mergedArr;
    }
}
