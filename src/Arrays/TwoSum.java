
/**
 * Problem: two_sum
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Approach:
 * Brute Force: use 2 for loop i and j where i start from 0 and j start from i+1 and check if the sum is equals to target
 * 
 * Optimal Approch: use hashMap to store the key(nums[i]) and its value(i) and make one loop from nums[0] to end and 
 * check if the target - nums[i] is present in hashmap or not and while the loop add the key value also in hashmap 
 * 
 * Best Approch: if the array (nums[]) is sorted then use 2 pointer i = 0 and j = nums.length and i++ and j-- and check if i + j = target 
 * -
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
        sc.close();
    }

    // Solution Method
    private static int[] twoSum(int[] nums, int target) {
        // Edge case
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (temp.containsKey(num)) {
                return new int[] { temp.get(num), i };
            }
            temp.put(nums[i], i);
        }
        return new int[] {};
        /*
         * Brute force
         * for (int i = 0; i < nums.length - 1; i++) {
         * for (int j = i + 1; j < nums.length; j++) {
         * if ((nums[i] + nums[j]) == target) {
         * return new int[] { i, j };
         * }
         * }
         * }
         * return new int[] {};
         */
    }
}
