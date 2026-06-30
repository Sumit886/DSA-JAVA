package Arrays;

import java.util.HashSet;

public class LC_128 {

    public static int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int ele : nums) {
            set.add(ele);
        }

        int maxLength = 0;

        for (int ele : set) {

            if (!set.contains(ele - 1)) {

                int start = ele;
                int length = 1;

                while (set.contains(start + 1)) {
                    length++;
                    start++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}
