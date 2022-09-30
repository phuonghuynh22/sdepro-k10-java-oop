package lab_06;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.util.Arrays;

public class Lab_06_1 {
    public static void main(String[] args) {
        /*
         * Given input string: "2hrs and 5 minutes"
         * Please calculate how many minutes in total
         */

        //Given input string: "2hrs and 5 minutes"
        String myChar = "2hrs and 5 minutes";
        System.out.println("Input: " + myChar);
        char[] myTime = myChar.toCharArray();

        //separate hours and minutes
        String myHourString = "";
        String myMinuteString = "";
        String[] splitStr = myChar.split("and");

        for (int index = 0; index < splitStr.length; index++) {
            myHourString = splitStr[index];
            myMinuteString = splitStr[index+1];
            break;
        }

        //get digits only and convert to Integer
        int hourInt = Integer.parseInt(myHourString.replaceAll("[^0-9]","")) * 60;
        int minuteInt = Integer.parseInt(myMinuteString.replaceAll("[^0-9]",""));

        //print out minute in total
        System.out.print("Total: ");
        System.out.println(hourInt + minuteInt);

    }
}