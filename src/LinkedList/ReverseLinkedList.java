
/**
 * Problem: ReverseLinkedList
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/reverse-linked-list/description/
 *
 * * Approach:
 * - Use three pointers: prev, curr, next
 * - Reverse links one by one
 * - Move curr forward until list ends
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed: ");
        printList(head);
    }

    // Solution Method
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
