/*
 * LeetCode Exercises
 * Problem 217: Contains Duplicate
 */

package leetcode.containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate_1(nums));
        System.out.println(solution.containsDuplicate_2(nums));
        System.out.println(solution.containsDuplicate_3(nums));
    }

    // Nested Loop
    public boolean containsDuplicate_1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    // Sorting Algorithm
    public boolean containsDuplicate_2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    // HashSet (similar to HashMap)
    public boolean containsDuplicate_3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
