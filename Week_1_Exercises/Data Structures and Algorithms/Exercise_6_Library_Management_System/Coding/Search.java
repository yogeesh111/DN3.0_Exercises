package Exercise_6_Library_Management_System;

import java.util.Scanner;

public class Search {
    static Scanner in=new Scanner(System.in);

    public static boolean linearSearch(Book[] arr)
    {
        System.out.println("Enter the title in lower case: ");
        String title=in.nextLine();
        for(Book b: arr)
        {
            if(b.getTitle().equals(title))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(Book[] arr,int l, int h)
    {
        System.out.println("Enter the title in lower case: ");
        String title=in.nextLine();
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid].getTitle().equals(title))
            {
                return true;
            } else if (arr[mid].getTitle().charAt(0)<title.charAt(0)) {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }

        return false;
    }
}
