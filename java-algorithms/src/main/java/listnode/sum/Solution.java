package listnode.sum;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode result = new ListNode();
        ListNode currentNode = result;

        while ((a != null) || (b != null)) {
            int sum = (a != null ? a.val : 0) + (b != null ? b.val : 0);
            int resto = sum - 10;
            if (resto >= 0) {
                currentNode.val += resto;
                currentNode.next = new ListNode(1);
            } else {
                currentNode.val += sum;
                if (currentNode.val == 10) {
                    currentNode.val = 0;
                    currentNode.next = new ListNode(1);
                } else {
                    if ((a != null && a.next != null) || (b != null && b.next != null)) {
                        currentNode.next = new ListNode(0);
                    }
                }

            }
            if (a != null && a.next != null) {
                a = a.next;
            } else {
                a = null;
            }
            if (b != null && b.next != null) {
                b = b.next;
            } else {
                b = null;
            }
            currentNode = currentNode.next;
        }


        return result;

    }
}
