
/**
 * Problem: FirstBadVersion
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/first-bad-version/
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class FirstBadVersion {

    // simulate API
    static int firstBad;

    static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total versions: ");
        int n = sc.nextInt();

        System.out.print("Enter first bad version: ");
        firstBad = sc.nextInt();

        int result = firstBadVersion(n);
        System.out.println("First bad version is: " + result);
        sc.close();
    }

    // Solution Method
    private static int firstBadVersion(int n) {
        int left = 0;
        while (left < n) {
            int mid = (int) (left + (n - left) / 2);
            if (isBadVersion(mid)) {
                n = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
