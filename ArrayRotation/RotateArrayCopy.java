import java.util.Arrays;

class Rotate {
    public static void main(String args[]) {
        int arr[] = {11, 12, 13, 14, 15};
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


        if (n/2 <= r){
            int temp[] = new int[r];
            System.arraycopy(arr, n-r, temp, 0, temp.length);
            System.arraycopy(arr, 0, arr, r, n-r);
            System.arraycopy(temp, 0, arr, 0, temp.length);

            System.out.println(Arrays.toString(arr));
        } else {
            int temp[] = new int[n-r];
            System.arraycopy(arr, 0, temp, 0, temp.length);
            System.arraycopy(arr, n-r, arr, 0, n);
            System.arraycopy(temp, 0, arr, r, temp.length);

            System.out.println(Arrays.toString(arr));
        }
    }
}
