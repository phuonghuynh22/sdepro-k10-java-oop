package lab_05;

import java.util.*;

public class Lab_05 {
    public static void main(String[] args) {
        /*
        Create a simple menu with 4 options:
        =====MENU======
        1. Add number into ArrayList
        2. Print numbers
        3. Get maximum number
        4. Get minimum number

        5. search number
        Optional: Add option number 5 to find a number -> index
         */

        List<Integer> myArrList = new ArrayList<>();
        showMenu(myArrList);
    }

    public static List showMenu(List myArrList) {

        //print out the menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Quit the program");
        System.out.print("\nPlease select an option: ");

        int inputOption = scanner.nextInt();
        switch (inputOption) {
            case 1:
                //add number to the arrayList
                myArrList = addNumberToArrayList();
                showMenu(myArrList);
                break;
            case 2:
                //print out the original input ArrayList without sorting
                if (myArrList.size() > 0) {
                    System.out.println(">>>>> Your input ArrayList: " + myArrList);
                    showMenu(myArrList);
                } else {
                    //ask to add number prior to printing out
                    System.out.println("> > > Your ArrayList is blank! Please add number to the ArrayList first!");
                    myArrList = addNumberToArrayList();
                    System.out.println(">>>>> Your input ArrayList: " + myArrList);
                    showMenu(myArrList);
                }
                break;
            case 3:
                //get max number
                if (myArrList.size() > 0) {
                    getMaxNumber(myArrList);
                } else {
                    //ask to add number prior to getting max number
                    System.out.println("> > > Your ArrayList is blank! Please add number to the ArrayList first!");
                    myArrList = addNumberToArrayList();
                    getMaxNumber(myArrList);
                }
                showMenu(myArrList);
                break;
            case 4:
                //get min number
                if (myArrList.size() > 0) {
                    getMinNumber(myArrList);
                    showMenu(myArrList);
                } else {
                    //ask to add number prior to getting min number
                    System.out.println("> > > Your ArrayList is blank! Please add number to the ArrayList first!");
                    myArrList = addNumberToArrayList();
                    getMinNumber(myArrList);
                    showMenu(myArrList);
                }
                break;
            case 5:
                if (myArrList.size() <= 0) {
                    System.out.println("> > > Your ArrayList is blank! Please add number to the ArrayList first!");
                    myArrList = addNumberToArrayList();
                    findNumber(myArrList);
                    showMenu(myArrList);
                }
                findNumber(myArrList);
                showMenu(myArrList);
                break;
            case 6:
                //close the program
                break;
            default:
                //ask user to select the proper option
                System.out.println("Please select a correct option!");
                showMenu(myArrList);
        }
        return myArrList;
    }

    public static List addNumberToArrayList() {

        //clear the ArrayList in case it has been added recently
        List<Integer> myArrList = new ArrayList<>();
        myArrList.clear();

        //add number to the arrayList
        System.out.print("How many numbers do you want to add: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        for (int index = 0; index < numbers; index++) {
            System.out.print("Input a number: ");
            myArrList.add(scanner.nextInt());
        }
        return myArrList;
    }

    public static void getMaxNumber(List myArrList) {
        /*
        //sort then print out the maximum number on the ArrayList
        Set<Integer> set = new HashSet<Integer>(myArrList);
        System.out.println(set);
        List<Integer> listFromSet = new ArrayList<>(set);
        */

        Collections.sort(myArrList);
        for (int index = 0; index < myArrList.size(); index++) {
            if (index == myArrList.size() - 1)
                System.out.println("Max number: " + myArrList.get(index));
        }
    }

    public static void getMinNumber(List myArrList) {

        //sort then print out the minimum number of the ArrayList
        /*
        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);
        List<Integer> listFromSet = new ArrayList<>(set);
         */

        Collections.sort(myArrList);
        for (int index = myArrList.size() - 1; index >= 0; index--) {
            if (index == 0)
                System.out.println("Min number: " + myArrList.get(index));
        }
    }

    public static void findNumber(List myArrList) {
        //input a number to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSearch for number: ");
        int number = scanner.nextInt();
        List<Integer> indexOfNumber = new ArrayList<>();

        //find the number and get its index in the arraylist
        for (int index = 0; index < myArrList.size(); index++) {
            if (myArrList.get(index).equals(number))
                indexOfNumber.add(index);
        }

        //print out the result
        if (indexOfNumber.size() == 0)
            System.out.printf("Cannot find the number %d!", number);
        else System.out.print("Index of number " + number + " is at: " + indexOfNumber);
    }
}
