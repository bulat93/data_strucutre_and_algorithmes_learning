package linkedlisttasks.deletenode;

public class LinkedList
{
    private ListNode head;
    private ListNode tail;

    public LinkedList()
    {
        this.head = new ListNode(1);
        tail = head;
    }

    public ListNode head(){
        return head;
    }

    public void add(ListNode node) {
        this.tail.setNext(node);
        tail = node;
    }
}
