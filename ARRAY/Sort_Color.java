package ARRAY;

class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

public class Sort_Color {

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        Solution obj = new Solution();

        obj.sortColors(nums);

        System.out.print("Sorted Array: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}