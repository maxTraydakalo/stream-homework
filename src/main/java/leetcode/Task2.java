package leetcode;

public class Task2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next= new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l3 = solution.addTwoNumbers(l1, l2);
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null;
            ListNode temp = null;
            if (l1 != null || l2 != null) {
                if (l1 != null && l2 != null) {
                    temp = head = new ListNode(l1.val + l2.val);
                    temp.next = makeDigitFromNumberIfPossible(temp);
                    l1 = l1.next;
                    l2 = l2.next;
                } else {
                    l1 = getNotNullListNode(l1, l2);
                    temp = head = new ListNode(l1.val);
                    l1 = l1.next;
                }
            }
            while (l1 != null && l2 != null) {
                if (temp.next == null) {
                    temp.next = new ListNode(l1.val + l2.val);
                } else {
                    temp.next.val = temp.next.val + l1.val + l2.val;
                }
                temp = temp.next;
                temp.next = makeDigitFromNumberIfPossible(temp);
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1 != null || l2 != null) {
                l1 = getNotNullListNode(l1, l2);
                while (l1 != null) {
                    if (temp.next == null) {
                        temp.next = new ListNode(l1.val);
                    } else {
                        temp.next.val = temp.next.val + l1.val;
                    }
                    temp = temp.next;
                    temp.next = makeDigitFromNumberIfPossible(temp);
                    l1 = l1.next;
                }
            }
            return head;
        }

        public ListNode makeDigitFromNumberIfPossible(ListNode l3) {
            if (l3.val > 9) {
                l3.val = l3.val - 10;
                l3.next = new ListNode(1);
                return l3.next;
            }
            return null;
        }

        public ListNode getNotNullListNode(ListNode l1, ListNode l2) {
            return l1 == null ? l2 : l1;
        }

        public ListNode getHeadIfAbsent(ListNode head, ListNode temp) {
            return head == null ? temp : head;
        }
    }

}
