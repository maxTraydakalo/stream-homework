package leetcode;

public class Task93 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        ListNode result = solution.reverseList(l1);
        System.out.println(0);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode reverseList1(ListNode head) {
            ListNode temp = null;
            ListNode dummyHead = new ListNode(0);
            while (head != null) {
                temp = head;
                head = head.next;
                temp.next = dummyHead.next;
                dummyHead.next = temp;
            }
            return dummyHead.next;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode listNode = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return listNode;
        }
    }
}
