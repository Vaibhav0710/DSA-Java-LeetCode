
/**
 * Problem: ContainsDuplicate
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Approach:
 * use HashSet and solve nums while iterating and check if its contains (return true) in end (return false)
 * -
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);
        System.out.println(result);
        sc.close();
    }

    // Solution Method
    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                return true;
            }
            temp.add(nums[i]);
        }
        return false;
    }
}
