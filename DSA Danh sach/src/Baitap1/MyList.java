package Baitap1;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E element) {
        elements[size++] = element;
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        for (int index_del = index; index_del < elements.length - 1; index_del++) {
            elements[index_del] = elements[index_del+1];
        }
        elements[elements.length-1] = null;
        return (E) elements;
    }

    public int size() {
        return size;
    }

//    public Object clone() {
//        Object[] newElements = new Object[size];
//        System.arraycopy(elements, 0, newElements, 0, elements.length);
//    }

    public boolean contain (E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    public void display(){
        for (int i = 0; i < size; i++){
            System.out.print(elements[i] + " ");
        }
    }

    public E get(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
        }
        return element;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}
