

import java.util.HashMap;



    public static boolean ContainsDuplicateLCII(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {

                int prevIndex = map.get(nums[i]);

                if (i - prevIndex <= k)
                    return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean ans = ContainsDuplicateLCII(nums, k);

        System.out.println(ans);
    }
