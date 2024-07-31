package Exercise_3_Sorting_Customer_Orders;

public class Sort {

    public static void swap(Order[] arr,int i,int j)
    {
        Order temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(Order [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swap = false;
            for(int j=0;j< arr.length-i-1;j++) {

                if (arr[j].getOrderId() > arr[j + 1].getOrderId()) {
                    swap(arr, j, j + 1);
                    swap = true;
                }
            }
                if(!swap)
                    break;

        }
    }


    /////////////////////////////////////////////////////////
    public static int partition(Order[] arr,int l,int h)
    {
        Order pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j].getOrderId()<pivot.getOrderId())
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return (i+1);
    }

    public static void quickSort(Order [] arr,int l,int h)
    {
        if(l<h)
        {
            int p=partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
}
