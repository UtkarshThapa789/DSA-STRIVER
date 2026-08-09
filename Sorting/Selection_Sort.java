package SORTING;
import java.util.Scanner;
public class Selection_Sort {

    public static void selectionSort(int[] arr)
    {
        for(int i = 0 ; i <= arr.length-2; i++)
        {
            int minIdx = i;
            for(int j = i ; j <= arr.length-1 ; j++)
            {
                if(arr[j] < arr[minIdx] )
                {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
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

    selectionSort(arr);
    
    System.out.println("Sorted Array:");
     for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
