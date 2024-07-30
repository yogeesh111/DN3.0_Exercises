package Exercise_2_E_commerce_Search_Functionality;

import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no.of products to add");
        int size=in.nextInt();
        Product[] productArr=new Product[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter product "+(i+1)+" ID:");
            int id=in.nextInt();
            System.out.println("Enter product "+(i+1)+" Name:");
            String name=in.next();
            System.out.println("Enter product "+(i+1)+" Category:");
            String category=in.next();

            productArr[i]= new Product(id,name,category);
        }


        while(true) {
            int option;
            System.out.println("Press 1: for lenear search\nPress 2: for Binary search\nPress 3: for continue searching\nPress 4 to exit");
            option=in.nextInt();
            switch (option) {
                case 1: {
                    Product product=Search.linearSearch(productArr);
                    if(product != null)
                        System.out.println("ID: "+ product.getProductId()+" Name: "+ product.getProductName()+" Category: "+ product.getProductCategory());
                    else
                        System.out.println("No such product");
                    break;
                }
                case 2: {
                    Product product=Search.binarySearch(productArr);
                    if(product != null)
                        System.out.println("ID: "+ product.getProductId()+" Name: "+ product.getProductName()+" Category: "+ product.getProductCategory());
                    else
                        System.out.println("No such product");
                    break;
                }
                case 4: {
                    System.exit(1);
                }

            }
        }
    }
}
