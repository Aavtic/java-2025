import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int copied[] = Arrays.copyOf(arr, arr.length);

        System.out.println("Arr: " + Arrays.toString(arr) + " copied: " + Arrays.toString(copied));
    }
}
