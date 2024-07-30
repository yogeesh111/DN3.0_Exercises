package Exercise_1_Inventory_Management_System;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Product> productlist = new HashMap<>();

        while (true) {
            System.out.println("To add Product : Enter 1\nTo update Product : Enter 2\nTo delete Product : Enter 3\nTo View all Product : Enter 4\nTo view particular Product : Enter 5\nTo Exit : Enter 6");
            int option = in.nextInt();
            switch (option) {
                case 1: {
                    ProductOperations.addProduct(productlist);
                    break;
                }
                case 2: {
                    ProductOperations.updateProduct(productlist);
                    break;
                }
                case 3: {
                    ProductOperations.deleteProduct(productlist);
                    break;
                }
                case 4: {
                    ProductOperations.displayProducts(productlist);
                    break;
                }
                case 5: {
                    ProductOperations.displayProduct(productlist);
                    break;

                }
                case 6: {
                    System.exit(1);
                }
            }


        }


    }
}


