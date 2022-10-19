package Baitap2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove (int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.getData();
    }

    public boolean removeBoolean(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contain(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get (int i) {
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
    }
    public void printList() {
        Node temp = head;
        if (head != null) {
            for (int i = 0; i < numNodes; i++) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
        } else {
            System.out.println("No Node");
        }
        System.out.println();
    }
}
