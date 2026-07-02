package Arrays;

import java.util.*;

public class LC_469 {

    public static int majorityElement(int[] nums) {
        int n = nums.length;

        int winner = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == winner) {
                count++;
            } else {
                if (count == 0) {
                    winner = nums[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        }

        int freq = 0;
        for (int ele : nums) {
            if (ele == winner) {
                freq++;
            }
        }

        return (freq > n / 2) ? winner : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = majorityElement(nums);

        System.out.println("Majority Element = " + ans);
    }
}
