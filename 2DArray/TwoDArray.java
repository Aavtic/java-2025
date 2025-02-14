//2. Write a program to create store and display the value of jagged array with each row has different number of columns.

import java.util.Scanner;
import java.util.Arrays;

class TwoD {
    public static void main(String args[]) {
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        int arr[][] = new int[m][];

        for (int i=0; i<m; ++i) {
            int n = sc.nextInt();
            arr[i] = new int[n];
            for (int j=0; j<n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; ++i) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
