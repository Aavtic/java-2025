import java.util.Arrays;

class FindDuplicates {
    public static void main(String args[]) {
        int arr[] = {1, 1, 2};

        FindDuplicates fd = new FindDuplicates();
        System.out.println(Arrays.toString(fd.findDuplicates(arr)));
    }

    int[] findDuplicates(int[] arr) {
        int n = arr.length;
        int max = 0;
        int result[] = new int[n];
        int ri = 0;

        for (int i=0; i<n; ++i) {
            if (arr[i] > max) 
                max = arr[i];
        }

        int map[] = new int[max+1];

        for (int i=0; i<n; ++i) {
            map[arr[i]]++;
        }
        
        for (int i=0; i<n; ++i) {
            if (map[i] == 2) {
                result[ri++] = i;
            }
        }
        return Arrays.copyOfRange(result, 0, ri);
    }
}
