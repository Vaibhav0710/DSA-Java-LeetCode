
/**
 * Problem: Maximum Subarray(Kadane's algorithm)
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/maximum-subarray/
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class MaximumSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
        sc.close();
    }

    // Solution Method
    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            sum = Math.max(sum, maxSum);
        }
        return sum;
    }
}
