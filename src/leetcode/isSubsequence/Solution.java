package leetcode.isSubsequence;

public class Solution {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence(s, t));
        System.out.println(solution.check_isSubsequence_2());
    }

    String source, target;
    Integer left_bound, right_bound;

    public boolean isSubsequence(String s, String t) {
        this.source = s;
        this.target = t;
        this.left_bound = s.length();
        this.right_bound = t.length();

        return check_isSubsequence_1(0, 0);
    }

    // Solution 1
    private boolean check_isSubsequence_1(int left_index, int right_index) {
        if (right_index == right_bound) return false;
        if(source.charAt(left_index) == target.charAt(right_index)) {
            left_index++;
            if (left_index == left_bound) return true;
        }
        right_index++;

        return check_isSubsequence_1(left_index, right_index);
    }

    // Solution 2
    private boolean check_isSubsequence_2() {
        int left_point = 0;
        int right_point = 0;
        while (left_point < left_bound && right_point < right_bound) {
            if (source.charAt(left_point) == target.charAt(right_point)) {
                left_point++;
            }
            right_point++;
        }
        return left_point == left_bound;
    }
}
