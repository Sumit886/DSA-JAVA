package Arrays;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] arr) {
        int n = arr.length;
        int l = 0, h = n - 1;
        int mid = 0;

        while (mid <= h) {

            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[l];
                arr[l] = temp;

                l++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;

                h--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));
    }
}