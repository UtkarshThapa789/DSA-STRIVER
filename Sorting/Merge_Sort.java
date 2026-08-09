package SORTING;
import java.util.Scanner;

public class Merge_Sort {
    //-------------------------MERGE THE DIFF ARRAY----------------
    public static void Merge(int[] arr,int low, int mid, int high)
    {
        int[] temp= new int[high - low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                temp[k] = arr[left];
                left++;
            }else{
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        while(left <= mid)
        {
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high)
        {
            temp[k] = arr[right];
            right++;
            k++;
        }
        //------------------ASSING VALUE TO THE ORIGNAL ARRAY---------------
        for(int i = low ; i <= high ; i++)
        {
            arr[i] = temp[i-low];
        }
    }
    //--------------MERGE SORT BY RECURSION------------
    public static void Merge_sort(int[] arr,int low, int high)
    {
      if(low >= high)
      {
        return;
      }
      int mid = (low+high)/2;
      Merge_sort(arr, low, mid);
      Merge_sort(arr, mid+1, high);
      Merge(arr,low,mid,high);
    }
    public static void main(String[]args)
    {
        //-----------TAKING INPUT-----------------
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of array:");
    for(int i = 0 ; i < n ; i++)
    {
        arr[i]= sc.nextInt();
    }
    Merge_sort(arr,0,arr.length-1);
    System.out.println("Sorted Array:");
     for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
