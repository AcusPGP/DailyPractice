/**
 * LeetCode Exercises
 * Problem 3: Longest Substring Without Repeating Characters
 */

package leetcode.longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution attempt = new Solution();
        int result_1 = attempt.lengthOfLongestSubstring_1("abcddbc");
        int result_2 = attempt.lengthOfLongestSubstring_2("abcddbc");
        System.out.println(result_1);
        System.out.println(result_2);
    }

    // Solution 1
    public int lengthOfLongestSubstring_1(String s) {
        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (checkRepetition(s, i, j)) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }

    private boolean checkRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();

        for (int i = start; i <= end; i++) {
            char temp = s.charAt(i);
            if (chars.contains(temp)) {
                return false;
            }
            chars.add(temp);
        }
        return true;
    }

    // Solution 2
    public int lengthOfLongestSubstring_2(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            char a = s.charAt(right);
            map.put(a, map.getOrDefault(a,0) + 1);
            System.out.println(map);
            while (map.get(a) > 1) {
                char b = s.charAt(left);
                map.put(b, map.get(b) - 1);
                System.out.println(map);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
