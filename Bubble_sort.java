package SORTING;
import java.util.Scanner;
public class Bubble_sort {

    public static void bubbleSort(int[] arr,int n)
    {
        for(int i = n-1 ; i >= 1 ; i--)
        {
            int swap =0;
            for(int j = 0 ; j<= i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap =1;
                }
            }
            if(swap == 0)
            {
                break;
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
    bubbleSort(arr,n);
    System.out.println("Sorted Array:");
     for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }   
    
}
