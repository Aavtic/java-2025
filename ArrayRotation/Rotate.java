//Write a java program to perform the following process
//1. Right Shift by 2 using loop.
//2. Left Shift by 2 using loop.
//3. Right Shift by 2 using Array Method.
//4. Left Shift by 2 using Array Method.

import java.util.Arrays;

class Rotate {
    public static void main(String args[]) {
        int arr[] = {11, 12, 13, 14, 15};
        //{11, 12, 13, 14, 15}
        //{12, 13, 14, 15, 11} r = 4 rr
        //{13, 14, 15, 11, 12} r = 3 rr
        //{14, 15, 11, 12, 13} r = 2 rr
        //{15, 11, 12, 13, 14} r = 1 rr
        //****************************
        //{15, 11, 12, 13, 14} r = 4 ll
        //{14, 15, 11, 12, 13} r = 3 lr
        //{13, 14, 15, 11, 12} r = 2 lr
        //{12, 13, 14, 15, 11} r = 1 lr
        //
        //lr - 1 -> rr -> 4
        //lr - 2 -> rr -> 3
        //lr - 3 -> rr -> 2
        //lr - 4 -> rr -> 1
        int n = arr.length;
        int r = 2;
        boolean right_shift = false;

        System.out.println("Array: " + Arrays.toString(arr));

        if (!right_shift) {
            System.out.println("Left Rotation: " + r);
            r = n - r; 
        } else {
            System.out.println("Right Rotation: " + r);
        }


        if (r <= n/2) {
            int temp[] = new int[r];
            int ti = 0;
            for (int i=n-r; i<n; ++i) {
                temp[ti++] = arr[i];
            }

            for (int i=n-r-1; i>-1; --i) {
                arr[i+r] = arr[i];
            }

            for (int i=0; i<temp.length; ++i) {
                arr[i] = temp[i];
            }

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Temp: " + Arrays.toString(temp));

        } else {
            int temp[] = new int [n-r];
            int ti = 0;

            for (int i=0; i<n-r; ++i) {
                temp[ti++] = arr[i];
            }
            ti = 0;

            for (int i=n-r; i<n; ++i) {
                arr[i-r+1] = arr[i];
            }

            for (int i=n-temp.length; i<n; ++i) {
                arr[i] = temp[ti++];
            }

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Temp: " + Arrays.toString(temp));

        }
    }
}
