
/**
 * Problem: MoveZeroes
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/move-zeroes/
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.print("After moving zeroes: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    // Solution Method
    private static void moveZeroes(int[] nums) {
        /*
         * Brute Force
         * int n = nums.length;
         * int[] temp = new int[n];
         * int i = 0;
         * for (int num : nums) {
         * if (num != 0) {
         * temp[i] = num;
         * i++;
         * }
         * }
         * while (i < n) {
         * temp[i] = 0;
         * i++;
         * }
         * for (int j = 0; j < n; j++) {
         * nums[j] = temp[j];
         * }
         */

        /*
         * Two Pointer
         */
        int numslen = nums.length;
        int count = 0;

        for (int i = 0; i < numslen; i++) {
            if (nums[i] != 0) {
                // swap
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }
}
