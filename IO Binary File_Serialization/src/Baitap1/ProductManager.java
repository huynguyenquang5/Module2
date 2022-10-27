package Baitap1;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Scanner scanner) {
        try {
            System.out.println("Enter id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter brand:");
            String brand = scanner.nextLine();
            System.out.println("Enter price:");
            long price = Long.parseLong(scanner.nextLine());
            System.out.println("Enter description:");
            String description = scanner.nextLine();
            products.add(new Product(id, name, brand, price, description));
            System.out.println("Add completed!");
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("Something not right. Try again!");
        }
    }

    public void writeToFile(String path) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(String path) {
        List<Product> productList;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            productList = ((List<Product>) objectInputStream.readObject());
            objectInputStream.close();
            products = productList;
        } catch (Exception ex) {
            System.err.println("No product in list!");
        }
        return products;
    }

    public void search(String path, Scanner scanner) {
        List<Product> productList = readDataFromFile(path);
        System.out.println("Enter id want to find:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                flag = true;
                System.out.println("Found!");
                System.out.println(product);
            }
        }
        if(!flag) {
            System.out.println("Id not found!!");
        }
    }
    public void display(String path) {
        List<Product> productList = readDataFromFile(path);
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
