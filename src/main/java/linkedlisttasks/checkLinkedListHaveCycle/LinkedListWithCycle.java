package linkedlisttasks.checkLinkedListHaveCycle;

public class LinkedListWithCycle {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        LinkedList.Node cycle = new LinkedList.Node("201");
        linkedList.appendIntoTail(cycle);
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));
        linkedList.appendIntoTail(cycle);

        if (linkedList.isCyclic()) {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }

    }
}
