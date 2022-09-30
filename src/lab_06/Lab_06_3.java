package lab_06;

import java.util.Arrays;

public class Lab_06_3 {
    public static void main(String[] args) {
        /*
         * String myStr = "100 minutes";
         * NOT using REGEX, extract digit character from that String
         * Expected output: "100".
         * EX: "12345nabc678" -> "12345678"
         */

        String myStr = "100 minutes";
        char[] myDigit = myStr.toCharArray();
        System.out.println("Input: " + myStr);
        System.out.print("Output: ");

        for (char digit : myDigit) {
            if (Character.isDigit(digit))
                System.out.print(digit);
        }
    }
}
