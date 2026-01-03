/*
 * Problem: ProductOfArrayExceptSelf
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 *
 * Approach:
 * 
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }

    // Solution Method
    private static int[] productExceptSelf(int[] nums) {
        /*
         * Brute Force -> failed
         * Time Complexity: O(n*n)
         * Space Complexity: O(1)
         * 
         * int n = nums.length;
         * int[] ans = new int[n];
         * for (int i = 0; i < n; i++) {
         * int count = 1;
         * for (int j = 0; j < n; j++) {
         * if (i == j) {
         * continue;
         * }
         * count = count * nums[j];
         * }
         * ans[i] = count;
         * }
         * return ans;
         * 
         * 
         * Divide product of all num by nums[i] -> failed because of num can be 0
         * 
         * Best Approch -> Prefix & Suffix Product
         * Prefix Pass (Left → Right)
         * Maintain a variable prefix = 1
         * Store product of all elements before index i
         * Suffix Pass (Right → Left)
         * Maintain suffix = 1
         * Multiply existing value with product of elements after index i
         */
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
