package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumLC_15 {

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {
                    List<Integer> nums = new ArrayList<>();
                    nums.add(arr[i]);
                    nums.add(arr[l]);
                    nums.add(arr[r]);

                    if (!ans.contains(nums)) {
                        ans.add(nums);
                    }

                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(arr);

        System.out.println(ans);
    }
}
