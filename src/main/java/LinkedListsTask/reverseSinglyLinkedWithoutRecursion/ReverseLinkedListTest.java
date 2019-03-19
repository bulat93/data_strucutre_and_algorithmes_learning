package LinkedListsTask.reverseSinglyLinkedWithoutRecursion;

public class ReverseLinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList linkedList = new SinglyLinkedList(head);

        linkedList.add(new SinglyLinkedList.Node(2));
        linkedList.add(new SinglyLinkedList.Node(3));

        linkedList.print();

        linkedList.reverse();

        linkedList.print();
    }
}
