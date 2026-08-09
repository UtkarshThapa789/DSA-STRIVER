package ARRAY;
import java.util.ArrayList;

public class Rearrange_Array_Elements {

    public static void rearrangeArray(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Store positive and negative numbers separately
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        // If positive elements are more
        if (pos.size() > neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }

            int index = neg.size() * 2;

            for (int i = neg.size(); i < pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }
        }

        // If negative elements are more
        else {

            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }

            int index = pos.size() * 2;

            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, -4, -1, 4, -5, -6, 7, 8};

        rearrangeArray(nums);

        System.out.print("Rearranged Array: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}