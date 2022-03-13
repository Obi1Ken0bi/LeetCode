public class Solution {
    public int getDecimalValue(ListNode head) {
        int k = 1;
        int result = head.val;
        while (head.next != null) {
            head = head.next;
            result <<= 1;
            result += head.val;
        }
        return result;
    }


}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
