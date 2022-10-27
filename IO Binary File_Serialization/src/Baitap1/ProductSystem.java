package Baitap1;

import java.util.Scanner;

public class ProductSystem {
    private final Scanner scanner;

    ProductManager productManager = new ProductManager();

    public ProductSystem() {
        this.scanner = new Scanner(System.in);
    }

    public void menuMaterialManager() {
        do {
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. Display product from file");
            System.out.println("3. Put product into file after add product");
            System.out.println("4. Search product");
            System.out.println("0. Exit program");
            System.out.println("Enter a number: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.display("src/Baitap1/product.txt");
                    break;
                case 3:
                    productManager.writeToFile("src/Baitap1/product.txt");
                    break;
                case 4:
                    productManager.search("src/Baitap1/product.txt", scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}

