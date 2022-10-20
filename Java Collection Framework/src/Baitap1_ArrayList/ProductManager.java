package Baitap1_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public List<Product> productManager;

    public int size;

    public ProductManager(){
        productManager = new ArrayList<>();
    }

    public void add(Scanner scanner) {
        Product product = new Product();
        System.out.println("Add id:");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add name:");
        product.setName(scanner.nextLine());
        System.out.println("Add description:");
        product.setDescription(scanner.nextLine());
        System.out.println("Add price");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        productManager.add(size, product);
        System.out.println("Add completed!");
        System.out.println(product);
        size++;
    }

    public void addElement(Object element) {
        productManager.add(size, (Product) element);
        size++;
    }

    public void update(Scanner scanner) {
        System.out.println("Enter id update");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (Product product : productManager) {
            if (id == product.getId()) {
                flag = true;
                System.out.println("Update name from id: " + id);
                product.setName(scanner.nextLine());
                System.out.println("Update description from id: " + id);
                product.setDescription(scanner.nextLine());
                System.out.println("Update price from id: " + id);
                product.setPrice(Double.parseDouble(scanner.nextLine()));
                System.out.println("Update Completed!");
                System.out.println(product);
            }
        }
        if (!flag) {
            System.out.println("Id Not Found!!");
        }
    }

    public void remove(Scanner scanner) {
        System.out.println("Enter id remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        productManager.remove(id - 1);
        System.out.println("Remove Completed!");
        size--;
    }

    public int size() {
        return productManager.size();
    }

    public void display() {
        for (Product product : productManager) {
            System.out.println(product);
        }
    }

    public void findProduct(Scanner scanner) {
        System.out.println("Enter a name: ");
        String findName = scanner.nextLine();
        boolean flag = false;
        for (Product product : productManager) {
            if (product.getName().equals(findName)) {
                flag = true;
                System.out.println("Found!!");
                System.out.println(product);
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }

    public void sortPrice(int choice, Scanner scanner) {
        PriceComparator priceComparator = new PriceComparator();
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        if (choice == 1) {
            System.out.println("Ascending");
            productManager.sort(priceComparator);
            display();
        } else if (choice == 2) {
            System.out.println("Descending");
            productManager.sort(priceComparator.reversed());
            display();
        } else {
            System.out.println("Enter right number!");
        }
    }

}
