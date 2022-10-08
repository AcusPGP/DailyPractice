package cses.weirdAlgorithm;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution_1(num);
        System.out.println("");
        Solution_2(num);
    }

    public static void Solution_1(int num) {
        System.out.print(num + " ");
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            System.out.print(num + " ");
        }
    }

    public static void Solution_2(int num) {
        System.out.print(num + " ");
        if (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                Solution_2(num);
            } else {
                num = num * 3 + 1;
                Solution_2(num);
            }
        }
    }
}
