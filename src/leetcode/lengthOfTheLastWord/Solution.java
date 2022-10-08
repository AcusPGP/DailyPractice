package leetcode.lengthOfTheLastWord;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord_1("Hello World"));
        System.out.println(solution.lengthOfLastWord_2("Hello World"));
    }

    public int lengthOfLastWord_1(String s) {
        String[] temp = s.split(" ");
        return temp[temp.length - 1].length();
    }

    public int lengthOfLastWord_2(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
