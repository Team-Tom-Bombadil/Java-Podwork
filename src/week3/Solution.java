package week3;

import java.util.Arrays;

public class Solution {

    //    Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,
    public static String longest(String s1, String s2) {
        String newStr = s1 + s2;
        String output = "";

        for (int i = 0; i < newStr.length(); i++) {
            if (output.indexOf(newStr.charAt(i)) == -1) {
                output += newStr.charAt(i);
            }
        }
        String[] arr = output.split("");
        Arrays.sort(arr);
        output = String.join("", arr);

        return output;
    }

    //    ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
    //    If the function is passed a valid PIN string, return true, else return false.
    public static boolean validatePin(String pin) {
        // Your code here...
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            try {
                Integer.parseInt(Character.toString(pin.charAt(i)));
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    //    You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
    //
    //    The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
    //    The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
    //    You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (((x1 > x2) && (v1 >= v2)) || ((x1 < x2) && (v1 <= v2)))
            return "NO";

        if (Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0)
            return "YES";
        else
            return "NO";
    }
}