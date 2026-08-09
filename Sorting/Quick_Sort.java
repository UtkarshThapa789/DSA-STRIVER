package SORTING;

import java.util.Scanner;
public class Quick_Sort {
    public static int Partition(int[] arr,int low,int high)
    {
      int i = low;
      int j = high;
      int pvoit = arr[low];
      while(i<j)
      {
        while (i <= high - 1 && arr[i] <= pvoit) {
            i++;
        }
        while (j >= low + 1 && arr[j] > pvoit) {
            j--;
        }
        if(i<j)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
      }
            int temp = arr[j];
            arr[j] = arr[low];
            arr[low] = temp;
            return j;
    }
    public static void Quick_sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int partition = Partition(arr,low,high);
            Quick_sort(arr, low, partition-1);
            Quick_sort(arr, partition+1, high);
        }
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
    Quick_sort(arr,0,arr.length-1);
    System.out.println("Sorted Array:");
     for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
