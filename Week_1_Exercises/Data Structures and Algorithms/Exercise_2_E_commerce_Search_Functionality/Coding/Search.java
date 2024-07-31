package Exercise_2_E_commerce_Search_Functionality;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Search {
   static Scanner in=new Scanner(System.in);
    public static Product linearSearch(Product[] arr)
    {
        System.out.println("Enter Product ID to search");
        int id=in.nextInt();
        if(id<=arr.length)
        {
            for(Product p: arr)
            {
                if(p.getProductId()==id)
                {
                    return p;
                }
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr)
    {
        System.out.println("Enter Product ID to search");
        int id=in.nextInt();
        Arrays.sort(arr, (p1, p2) -> Integer.compare(p1.getProductId(),p2.getProductId())
        );
        int st=0;
        int end=arr.length-1;

        if(id<=arr.length)
        {
            while(st<=end)
            {
                int mid=st+(end-st)/2;
                if(mid==id-1)
                {
                    return arr[mid];
                }
                else if(mid>id)
                {
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }

            }
            return null;


        }
        else{
            return null;
        }
    }
}
