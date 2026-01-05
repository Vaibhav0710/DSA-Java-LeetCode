
/**
 * Problem: MaximumAverageSubarray
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/maximum-average-subarray-i
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class MaximumAverageSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        double result = findMaxAverage(nums, k);
        System.out.println("Maximum Average: " + result);
        sc.close();
    }

    // Solution Method
    private static double findMaxAverage(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int count = 0;
        double sum = Integer.MIN_VALUE;
        double maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            deque.addFirst(num);
            sum += num;
            if (count == k) {
                int lastnum = deque.removeLast();
                sum = sum - lastnum;
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
            count++;
        }
        return maxSum / k;
    }
}
