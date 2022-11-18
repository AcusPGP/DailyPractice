/**
 * LeetCode Exercises
 * Problem 242: Valid Anagram
 */

package leetcode.validAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram_1("aacc", "ccac"));
        System.out.println(solution.isAnagram_2("aacc", "ccac"));
    }

    // Library Arrays
    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] char_1 = s.toCharArray();
        char[] char_2 = t.toCharArray();
        Arrays.sort(char_1);
        Arrays.sort(char_2);
        return Arrays.equals(char_1, char_2);
    }

    // HashMap
    public boolean isAnagram_2(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char temp : map.keySet()) {
            if (map.get(temp) != 0) {
                return false;
            }
        }
        return true;
    }
}

