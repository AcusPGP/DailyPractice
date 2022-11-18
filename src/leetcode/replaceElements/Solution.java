/**
 * LeetCode Exercises
 * Problem 1299: Replace Elements with Greatest Element on Right Side
 */

package leetcode.replaceElements;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.replaceElements_1(arr)));
        System.out.println(Arrays.toString(solution.replaceElements_2(arr)));
    }

    // Solution 1
    public int[] replaceElements_1(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = sortLargestNumber(i + 1, arr.length - 1, arr);
            temp[i] = max;
        }
        temp[arr.length - 2] = arr[arr.length - 1];
        temp[arr.length - 1] = -1;
        return temp;
    }

    public int sortLargestNumber(int start, int end, int[] arr) {
        int max = 0;
        for (int i = start; i <= end - 1; i++) {
            int temp = Math.max(arr[i], arr[i + 1]);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    // Solution 2
    public int[] replaceElements_2(int[] arr) {
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            int element = arr[i];
            arr[i]= max;
            if(max<element){
                max = element ;
            }
        }
        return arr;
    }
}
