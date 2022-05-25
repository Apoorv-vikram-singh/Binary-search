import java.util.*;
class binarySearch
{
    public int binarySearch(int arr[],int key,int loop)
    {
        int low=0,high=loop-1;
        while(low<=high)
        {
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(key>arr[mid])
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
        return -1;
    }

    public static void main(String args[])
    {
        binarySearch obj=new binarySearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key");
        int key=sc.nextInt();
        int loop=sc.nextInt();
        int[] arr=new int[loop];
        for(int i=0;i<loop;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=obj.binarySearch(arr,key,loop);
        System.out.println(result);

    }
    }
