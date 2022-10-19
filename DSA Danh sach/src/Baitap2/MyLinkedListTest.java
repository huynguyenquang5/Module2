package Baitap2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("Add first:");
        myLinkedList.addFirst(123);
        myLinkedList.printList();
        System.out.println("Add index & element:");
        myLinkedList.add(1,1);
        myLinkedList.add(2,2);
        myLinkedList.add(3, 3);
        myLinkedList.add(4, 4);
        myLinkedList.add(5, 5);
        myLinkedList.printList();
        System.out.println("Add last: ");
        myLinkedList.addLast(345);
        myLinkedList.printList();
        System.out.println("Remove: ");
        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println("Remove boolean: ");
        System.out.println("Return: " + myLinkedList.removeBoolean(3));
        myLinkedList.printList();
        System.out.println("Get size:");
        System.out.println("Size: " + myLinkedList.size());
        System.out.print("Contain: 345 ");
        System.out.println("Return: " + myLinkedList.contain(123));
        System.out.println("Index Of: " + myLinkedList.indexOf(345));
        System.out.println("Get: " + myLinkedList.get(4));
        System.out.println("Get first: " + myLinkedList.getFirst());
        System.out.println("Get last: " + myLinkedList.getLast());
        System.out.println("Clear: ");
        myLinkedList.clear();
        myLinkedList.printList();

    }
}
