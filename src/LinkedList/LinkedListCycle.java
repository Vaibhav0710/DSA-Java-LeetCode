/**
 * Problem: LinkedListCycle
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/linked-list-cycle/description/
 *
 * Approach:
 * - Use Floyd’s Cycle Detection algorithm
 * - Move slow pointer by 1 step and fast pointer by 2 steps
 * - If slow and fast meet, a cycle exists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LinkedListCycle {

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 2 (cycle)
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // cycle here

        boolean hasCycle = hasCycle(head);
        System.out.println("Has cycle: " + hasCycle);
    }

    // Solution Method
    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast == slow) {
                return true;
            }
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
        }
        return false;
    }
}
