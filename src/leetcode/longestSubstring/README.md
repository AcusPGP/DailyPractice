# LeetCode Exercises
### Exercise 3: Longest Substring Without Repeating Characters

- You can find the problem description on the internet or LeetCode website: https://leetcode.com/problems/longest-substring-without-repeating-characters/
- Project link (GitHub): https://github.com/AcusPGP/DailyPractice
- Project's author: Pham Gia Phuc - "Acus" (Personal profile: https://github.com/AcusPGP)
-----------------------------------
<ins>

### Problem solving

</ins>

**_Solution 1: Brute Force_**

We use Brute Force algorithm to scan through the elements in the given array. Then we will compare each character with the elements in the set. If the set does not 
have the character, it will add the missing character.

- The time complexity is O(n^m), it depends on how many nested loops do we use. In this exercise, m is 3, so the time complexity is O(n^3).

**_Solution 2: Sliding Window_**

We use Sliding Window algorithm to check a group of elements in the given array.
Then, we compare the window we are checking with the previous window to change the result.

- The time complexity is O(2n) = O(n). In the worst case each character will be visited twice by i and j.

