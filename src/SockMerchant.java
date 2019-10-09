/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
 */
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] == 0) {
                    continue;
                }
                if (ar[i] == ar[j]) {
                    ar[i] = 0;
                    ar[j] = 0;
                    count++;
                }
            }
        }
        return count;
    }
}