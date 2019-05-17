package linkedlisttasks.deletenode;

public class ListNode {

    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode next(){
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int val(){
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
