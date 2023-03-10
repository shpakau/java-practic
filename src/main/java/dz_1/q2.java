package dz_1;

import java.util.Arrays;
public class q2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        peren(nums, val);
        System.out.println(Arrays.toString(nums));

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    static void peren(int[] array, int val) {
        int size = array.length;
        int shift = 1;
        for (int i = 0; i < size - shift; i++) {
            while (array[size - shift] == val) {
                shift++;
            }

            if (array[i] == val) { // меняем значение массива
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }
        }

    }
}