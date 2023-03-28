import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l1Element = new ArrayList<>();
        List<Integer> l2Element = new ArrayList<>();
        List<ListNode> resultElement = new ArrayList<>();

        while (l1 != null) {
            l1Element.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            l2Element.add(l2.val);
            l2 = l2.next;
        }

        if (l1Element.size() <= l2Element.size()) {
            for (int i = 0; i < l1Element.size(); i++) {
                    resultElement.add(new ListNode(l2Element.get(i) + l1Element.get(i)));

            }
        }
        else {
            for (int i = 0; i <l2Element.size()-1 ; i++) {

                    resultElement.add(new ListNode(l2Element.get(i)+l1Element.get(i)));
            }
        }


        return resultElement.get(0);
    }
}