
/**
 * Problem: FindAllDuplicates
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class FindAllDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> duplicates = findDuplicates(nums);

        System.out.print("Duplicates: ");
        for (int val : duplicates) {
            System.out.print(val + " ");
        }
        sc.close();
    }

    // Solution Method
    private static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (temp.contains(num)) {
                ans.add(num);
            }
            temp.add(num);
        }
        return ans;
    }
}
