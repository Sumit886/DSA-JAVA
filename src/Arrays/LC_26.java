package Arrays;

import java.util.LinkedHashSet;

public class LC_26 {

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int ele : nums) {
            set.add(ele);
        }

        int i = 0;

        for (int ele : set) {
            nums[i++] = ele;
        }

        return i;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Unique Count = " + k);

        System.out.print("Array: ");
        for (int j = 0; j < k; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
