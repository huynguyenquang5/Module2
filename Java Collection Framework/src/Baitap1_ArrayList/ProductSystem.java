package Baitap1_ArrayList;

import java.util.Scanner;

public class ProductSystem {
    private final Scanner scanner;
    ProductManager productManager = new ProductManager();
    public ProductSystem() {
        Product product1 = new Product(1,"qwe","qwe",456456);
        Product product2 = new Product(2,"zxc","qwe",789789);
        Product product3 = new Product(3,"asd","qwe",756756);
        productManager.addElement(product1);
        productManager.addElement(product2);
        productManager.addElement(product3);
        this.scanner = new Scanner(System.in);

    }

    public void menuProductManager() {
        do{
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. Update product");
            System.out.println("3. Remove product");
            System.out.println("4. Display product");
            System.out.println("5. Find product");
            System.out.println("6. Sort product");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add(scanner);
                    break;
                case 2:
                    productManager.update(scanner);
                    break;
                case 3:
                    productManager.remove(scanner);
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.findProduct(scanner);
                    break;
                case 6:
                    menuSortPrice();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private void menuSortPrice() {
        int choice1;
        do {
            System.out.println("Choose sort type:");
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            System.out.println("0. Back");
            choice1 = Integer.parseInt(scanner.nextLine());
            if (choice1 == 0) {
                break;
            }
            productManager.sortPrice(choice1, scanner);
        } while (true);
    }
}
