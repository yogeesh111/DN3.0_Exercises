package Exercise_6_Library_Management_System;

import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int size;
        System.out.println("Enter no.of Books: ");
        size=in.nextInt();
        in.nextLine();
        Book[] arr=new Book[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("ID: ");
            int id=in.nextInt();
            in.nextLine();
            System.out.println("Title: ");
            String title=in.nextLine();
            System.out.println("Author: ");
            String author=in.nextLine();
            arr[i]=new Book(id,title,author);
        }

        while (true)
        {
            int option;
            System.out.println("Press 1: for linear search\nPress 2: for Binary search\nPress 3 to Exit");
            option = in.nextInt();

            switch (option)
            {
                case 1:
                {
                   if(Search.linearSearch(arr))
                   {
                       System.out.println("Book found");
                   }
                   else
                   {
                       System.out.println("Book Not Found");
                   }
                   break;
                }
                case 2:
                {
                    if(Search.binarySearch(arr,0,arr.length-1))
                    {
                        System.out.println("Book found");
                    }
                    else
                    {
                        System.out.println("Book Not Found");
                    }
                    break;

                }
                case 3:
                {
                    System.exit(1);
                }
            }
        }

    }
}
