package Exercise_3_Sorting_Customer_Orders;

import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
        int size=0;
        System.out.println("Enter no.of items: ");
        size=in.nextInt();
        in.nextLine();
        Order[] orderArr=new Order[size];

        for(int i=0;i<size;i++)
        {
            int orderId;
            String customerName;
            String totalPrice;

            System.out.println("Enter Customer name: ");
            customerName=in.nextLine();

            System.out.println("Enter Id: ");
            orderId=in.nextInt();

            System.out.println("Enter Price: ");
            totalPrice=in.next();
            in.nextLine();
            orderArr[i]=new Order(orderId,customerName,totalPrice);
        }

        System.out.println("Before sorting");
        for(Order o:orderArr)
        {
            System.out.println("Id: "+o.getOrderId()+" Name: "+o.getCustomerName()+" Price: "+o.getTotalPrice());
        }

        while (true)
        {
            int option=0;
            System.out.println("Press 1: for Bubble Sort\nPress 2: for Quick sort\nPress 3: for continue sorting\nPress 4 to exit");
            option=in.nextInt();

            switch (option)
            {
                case 1:{
                    Sort.bubbleSort(orderArr);
                    System.out.println("After sorting");
                    for(Order o:orderArr)
                    {
                        System.out.println("Id: "+o.getOrderId()+" Name: "+o.getCustomerName()+" Price: "+o.getTotalPrice());
                    }
                    break;
                }
                case 2:
                {
                    Sort.quickSort(orderArr,0,orderArr.length-1);
                    System.out.println("After sorting");
                    for(Order o:orderArr)
                    {
                        System.out.println("Id: "+o.getOrderId()+" Name: "+o.getCustomerName()+" Price: "+o.getTotalPrice());
                    }
                    break;
                }
                case 4:
                {
                    System.exit(1);
                }
            }
        }
    }
}
