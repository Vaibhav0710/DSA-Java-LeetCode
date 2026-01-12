
/**
 * Problem: MiddleOfLinkedList
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/middle-of-the-linked-list/description/
 *
 * Approach:
 * - Use fast and slow pointers
 * - Slow moves 1 step, fast moves 2 steps
 * - When fast reaches the end, slow is at the middle
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }

    // Solution Method
    private static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
