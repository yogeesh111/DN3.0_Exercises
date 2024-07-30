package Exercise_1_Inventory_Management_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductOperations {
    public static Scanner in=new Scanner(System.in);
    public static void addProduct(HashMap<String,Product> productlist) {

        String productId;
        String productName;
        int quantity;
        long price;
        System.out.println("Enter your Product Id:");
        productId = in.next();
        System.out.println("Enter your Product Name:");
        productName = in.next();
        System.out.println("Enter your Product quantity:");
        quantity = in.nextInt();
        System.out.println("Enter your Product price:");
        price = in.nextLong();
        Product product = new Product(productId, productName, quantity, price);
        if (product != null) {
            productlist.put(productId, product);
            System.out.println("Your product added successfully!");
        } else {
            System.out.println("Failed to add the product");
        }
    }

    public static void updateProduct(HashMap<String,Product> productlist)
    {
        System.out.println("Enter Product ID to Update:");
        String id=in.next();
        System.out.println("Select what do you want to update");
        System.out.println("1.ProductId\n2.Product Name\n3.Quantity\n4.Price");
        int option=in.nextInt();
        switch (option)
        {
            case 1:  //Update product id
            {
                Product curr_product=productlist.get(id);
                System.out.println("Enter new ID:");
                String new_id=in.next();
//                    productlist.put(new_id,new Product(curr_product.setProductId(new_id), curr_product.getProductId(), curr_product.getQuantity(), curr_product.getPrice()));
                curr_product.setProductId(id);
                productlist.put(new_id,curr_product);
                productlist.remove(id);
                break;
            }
            case 2: // to update product name
            {
                String new_name;
                System.out.println("New name for a product:");
                new_name=in.next();
                Product curr_product=productlist.get(id);
                curr_product.setProductName(new_name);
                System.out.println("Name updated successfully");
                break;
            }
            case 3: //to update quantity
            {
                Product curr_product=productlist.get(id);
                System.out.println("Enter new Quantity:");
                int new_quantity=in.nextInt();
                curr_product.setQuantity(new_quantity);
                System.out.println("Quantity updated successfullt");
                break;

            }
            case 4: // to update price
            {
                Product curr_product=productlist.get(id);
                System.out.println("Enter new Price:");
                long new_price=in.nextLong();
                curr_product.setPrice(new_price);
                System.out.println("Price updated successfully");
                break;
            }
        }
    }

    public static void deleteProduct(HashMap<String,Product> productlist)
    {
        System.out.println("Enter Product ID to Delete Product:");
        String id=in.next();

        if(productlist.containsKey(id))
        {
            productlist.remove(id);
        }
        else
        {
            System.out.println("Product Id is incorrect");
        }
    }

    public static void displayProducts(HashMap<String,Product> productlist) {

        for (Map.Entry<String, Product> e : productlist.entrySet())
        {
            System.out.println("Product Id: "+e.getKey()+" -> Name: "+e.getValue().getProductName()+" Quantity: "+e.getValue().getQuantity()+" Price: "+e.getValue().getPrice());
        }

    }

    public static void displayProduct(HashMap<String,Product> productlist){
        String id;
        System.out.println("Enter the id of the product:");
        id=in.next();
        Product curr_product=productlist.get(id);
        System.out.println("Product ID: "+ curr_product.getProductId()+" Name: "+curr_product.getProductName()+" Quantity: "+curr_product.getQuantity()+" Price: "+curr_product.getPrice());
    }

}
