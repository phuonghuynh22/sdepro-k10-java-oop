package lab_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(7);
        myArrList.add(3);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(6);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(0);

        //First 3 minimum value and not duplicated -> ArrayList [1,2,3]
        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);

        List<Integer> listFromSet = new ArrayList<>(set);
        System.out.println(listFromSet);
//        List<Integer> first3Values = new ArrayList<>();
//        int starIndex = 0;
//        int endIndex = 3; //Exclusive
//        first3Values = listFromSet.subList(starIndex, endIndex);
//        System.out.println(first3Values);

    }
}
