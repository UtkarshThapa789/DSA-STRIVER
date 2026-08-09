package ARRAY;
public class Remove_Duplicates{
    public static int remove_duplicate(int[] arr)
    {
        int i = 0;
        for(int j =1; j< arr.length; j++)
        {
            if(arr[j] != arr[i])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return arr[i+1];

    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3,3};
        int unique = remove_duplicate(arr);
        System.out.println("NEW ARRAY WITH UNIQUE ELEMENTS IS");
        for(int i = 0 ; i <= unique ;i++)
        {
            System.out.println(arr[i]);
        }
    }
}