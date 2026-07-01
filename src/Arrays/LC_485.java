package Arrays;

public class LC_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int ele : nums) {

            if (ele == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        // In case the array ends with 1's
        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};

        int ans = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum Consecutive Ones = " + ans);
    }
}
