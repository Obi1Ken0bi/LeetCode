
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

       @Override
       public String toString() {
           return "ListNode{" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
       }
   }

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode current=result;
        int overflow=0;
        while (l1!=null||l2!=null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
        int summOfDigits=overflow+x+y;
        overflow=summOfDigits/10;
        current.next=new ListNode(summOfDigits%10);
        current=current.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        if(overflow>0){
            current.next=new ListNode(overflow);
        }

        return result.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(5);
        l1.next=new ListNode(4);
        l2.next=new ListNode(6);
        l1.next.next=new ListNode(3);
        l2.next.next=new ListNode(4);

        System.out.println( addTwoNumbers(l1,l2));
    }
}