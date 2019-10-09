package week4;

import java.util.Map;
import java.util.*;

public class Week4 {

    //You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.
    public static int findEvenIndex(int[] arr) {
        int left;
        int right;

        for (int i = 0; i < arr.length; i++) {
            right = 0;
            left = 0;

            if (i == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    right += arr[j];
                }
            } else if (i == arr.length - 1) {
                for (int j = 0; j < i; j++) {
                    left += arr[j];
                }
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    right += arr[j];
                }
                for (int j = 0; j < i; j++) {
                    left += arr[j];
                }
            }
            if (left == right) {
                return i;
            }
        }
        return -1;
    }

    //In this kata, you will write a function that returns the positions and the values of the "peaks" (or local maxima) of a numeric array.
    //For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).
    //The output will be returned as a Map<String,List>
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        Map<String, List<Integer>> output = new HashMap<>();
        boolean plat = false;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
                plat = true;
                int j = i;
                while (plat && j < arr.length - 1) {
                    if (arr[j] < arr[j + 1])
                        plat = false;
                    else if (arr[j] > arr[j + 1]) {
                        pos.add(i);
                        peaks.add(arr[i]);
                        plat = false;
                    }
                    j++;
                }
            }

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                pos.add(i);
                peaks.add(arr[i]);
            }
        }
        output.put("pos", pos);
        output.put("peaks", peaks);

        return output;
    }

    //There is an array with some numbers. All numbers are equal except for one. Try to find it!
    public static double findUniq(double arr[]) {
        double first = arr[0];
        double second = arr[1];
        double third = arr[2];
        double same = 0;

        if (first == second) {
            same = first;
        } else if (second == third) {
            same = second;
        } else if (second != third) {
            same = third;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != same) {
                return arr[i];
            }
        }
        return 0;
    }
}