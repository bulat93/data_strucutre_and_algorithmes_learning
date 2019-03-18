package LinkedListsTask.checkLinkedListHaveCycle;

public class LinkedListWithoutCycle {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        linkedList.appendIntoTail(new LinkedList.Node("201"));
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));

        System.out.println("Linked List : " + linkedList);

        if (linkedList.isCyclic()) {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
    }
}
