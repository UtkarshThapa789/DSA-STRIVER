package SORTING;

import java.util.Scanner;

public class Insertion_Sort {

    public static void insertionSort(int[] arr,int n)
    {
        for(int i = 0 ; i <= n-1 ;i++)
        {
            int j = i;
            while( j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of array:");
    for(int i = 0 ; i < n ; i++)
    {
        arr[i]= sc.nextInt();
    }

    insertionSort(arr,n);
    
    System.out.println("Sorted Array:");
     for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    } 
}
