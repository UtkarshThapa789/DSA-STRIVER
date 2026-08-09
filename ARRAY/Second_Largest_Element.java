package ARRAY;

public class Second_Largest_Element {
    public static int Slargest(int[]arr,int n)
    {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > largest)
            {
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest &&  arr[i] > slargest ){
                slargest = arr[i];
            }
        }
        return slargest;

    }

    public static int Ssmallest(int[] arr,int n)
    {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1; i < n ; i++)
        {
            if(arr[i] < smallest)
            {
                ssmallest = smallest;
                smallest= arr[i];
            }else if(arr[i] > smallest && arr[i] < ssmallest )
            {
                ssmallest =arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,7,7,5};
        System.out.println(Slargest(arr,arr.length));
        System.out.println(Ssmallest(arr,arr.length));     
    }
}
