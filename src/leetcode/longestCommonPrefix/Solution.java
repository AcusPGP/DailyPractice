package leetcode.longestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
