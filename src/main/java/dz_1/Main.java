package dz_1;

import java.util.Arrays;

class Main
{
    public static void main(String[] args)
    {
        int[] A = { 3, -12, -44, 9, 10, 0, -9, -31, -1, 23, 95, 784, 11, 43, 39, -15 };

        Arrays.sort(A);

        System.out.println("Min element is " + A[0]);
        System.out.println("Max element is " + A[A.length - 1]);
    }
}
