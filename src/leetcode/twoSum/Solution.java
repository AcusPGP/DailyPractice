/**
 * LeetCode Exercises
 * Problem 1: Two Sum
 */

package leetcode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution attempt = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(attempt.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
