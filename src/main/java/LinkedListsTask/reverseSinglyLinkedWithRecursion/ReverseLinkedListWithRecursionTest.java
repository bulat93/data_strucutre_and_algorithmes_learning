package LinkedListsTask.reverseSinglyLinkedWithRecursion;

public class ReverseLinkedListWithRecursionTest {

    public static void main(String[] args)
    {
        SinglyLinkedList linkedList = getDefaultList();
        System.out.println("linked list before reversing: " + linkedList);
        linkedList.reverseRecursively();
        System.out.println("linked list after reverse recursively: " + linkedList);
    }

    private static SinglyLinkedList getDefaultList()
    {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("C");
        linkedList.append("D");
        linkedList.append("E");
        linkedList.append("F");
        return linkedList;
    }
}
