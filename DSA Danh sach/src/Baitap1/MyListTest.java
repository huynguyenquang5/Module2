package Baitap1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>(20);
        myList1.add(123);
        myList1.add(234);
        myList1.add(345);
        myList1.add(456);
        myList1.add(567);
        System.out.println("Array before:");
        myList1.display();
        System.out.println();
        System.out.println("Array after add:");
        myList1.add(4,123123);
        myList1.display();
        System.out.println();
        System.out.println("Array after remove:");
        myList1.remove(0);
        myList1.display();

        System.out.println();
        System.out.println("Size: " + myList1.size());


        System.out.println("Contain: " + myList1.contain(234));

        System.out.println();
        System.out.println("Size: " + myList1.size());

        System.out.println("IndexOf: " + myList1.indexOf(456));

        System.out.println("Get an element: " + myList1.get(2));

        System.out.println("Clear: ");
        myList1.clear();
        myList1.display();

    }
}
