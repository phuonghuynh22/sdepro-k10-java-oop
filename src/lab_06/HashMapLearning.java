package lab_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning<allKeys2> {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "cuu hoa");
        //emergencyList.put(115, "cap cuu");
        emergencyList.put(166, "others");
        emergencyList.put(166, "others...."); //replace the old value with the new one

        System.out.println(emergencyList.get(113));

        //option 1 - complex
        Object[] allKeys = emergencyList.keySet().toArray();
        for (int index = 0; index < allKeys.length; index++) {
            System.out.println(emergencyList.get(allKeys[index]));
        }



        Set<Integer> allKeys2 = emergencyList.keySet();

        /*
        * loop over all values
        *   if the value equals to "others"
        *       then remove
         */
        for (Integer key : allKeys2) {
            //this line of code can be replaced by the If following
            emergencyList.remove(key, "cap cuu");
            //emergencyList.remove(key);

            /*
            if (emergencyList.get(key).equals("cap cuu")) {
                emergencyList.remove(key);
             */
            }
        }
        //option 2 - recommend
        //print out all value
//        for (Integer key : allKeys2) {
//            System.out.println(emergencyList.get(key));
//        }

    }

