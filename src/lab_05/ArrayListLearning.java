package lab_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        /*//raw type
        List myArrList = new ArrayList<Integer>();
        myArrList.add(1);
        myArrList.add(true);
        myArrList.add('a');
        myArrList.add("hello");

        System.out.println(myArrList);
        myArrList.clear();
        System.out.println(myArrList);
        System.out.println(myArrList.size());

         */
        //CRUD
        List<Integer> myArrList2 = new ArrayList<>();
        myArrList2.add(2);
        myArrList2.add(4);
        myArrList2.add(4);
        myArrList2.add(4);
        //ArrayList<Integer> myArrListFromArrayList = new ArrayList<>();
        //myArrList2 = Arrays.asList(1,2,3);
        //myArrList2.add(4);
        System.out.println("before insert" + myArrList2);

        int indexToInsert = 0;
        int valueToInsert = 1;
        myArrList2.add(indexToInsert,valueToInsert);
        System.out.println("after insert" + myArrList2);

        myArrList2.set(2, 5);
        System.out.println("after update" + myArrList2);
        for (int index = 0; index < myArrList2.size(); index++) {
            System.out.print(myArrList2.get(index));
            if (index == myArrList2.size()-1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for (int index = myArrList2.size() - 1; index >= 0; index--) {
            System.out.print(myArrList2.get(index));
            if (index == 0) {
                System.out.println("");
                break;
            }
            System.out.print(", ");
        }

        for (Integer value : myArrList2) {
            System.out.println(value);
        }

        myArrList2.remove(2); // remove by index
        myArrList2.remove(new Integer(4)); // remove the first obj
        System.out.println("after remove" + myArrList2);
        System.out.println(myArrList2.isEmpty());
        System.out.println(myArrList2.contains(2));
        System.out.println(myArrList2.indexOf(3));
    }
}
