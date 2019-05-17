package linkedlisttasks.deletenode;

public class Solution {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        linkedList.add(one);
        linkedList.add(two);
        linkedList.add(three);
        linkedList.add(four);

        deleteNode(three);
    }

    public static void deleteNode(ListNode node) {

    }
}
