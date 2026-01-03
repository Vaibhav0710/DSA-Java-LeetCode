
/**
 * Problem: ValidAnagram
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/valid-anagram/
 *
 * Approach:
 * -
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class ValidAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        boolean result = isAnagram(s, t);
        System.out.println(result);
        sc.close();
    }

    // Solution Method
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        /*
         * First solution
         */
        Map<Character, Integer> s_HashSet = new HashMap<>();
        for (char c : s.toCharArray()) {
            s_HashSet.put(c, (s_HashSet.getOrDefault(c, 0) + 1));
        }
        Map<Character, Integer> t_HashSet = new HashMap<>();
        for (char d : t.toCharArray()) {
            t_HashSet.put(d, (t_HashSet.getOrDefault(d, 0) + 1));
        }
        return t_HashSet.equals(s_HashSet);

        /*
         * Second solution
         * char[] a = s.toCharArray();
         * char[] b = t.toCharArray();
         * Arrays.sort(a);
         * Arrays.sort(b);
         * return Arrays.equals(a, b);
         */
    }
}
