package LinkedListsTask.reverseSinglyLinkedWithRecursion;

public class SinglyLinkedList {

    private Node head;

    public <T> void append(T data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail(){
        Node tail = head;

        while (tail.next != null){
            tail = tail.next;
        }

        return tail;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current).append("-->");
            current = current.next;
        }
        if (sb.length() >= 3) {
            sb.delete(sb.length() - 3, sb.length());
        }

        return sb.toString();
    }

    private Node reverseRecursively(Node node){
        Node newHead;

        if (node.next == null) {
            return node;
        }

        newHead = reverseRecursively(node.next);

        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public void reverseRecursively(){
        head = reverseRecursively(head);
    }

    private static class Node<T> {
        private Node next;
        private T data;

        public Node(T data)
        {
            this.data = data;
        }

        @Override
        public String toString()
        {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
