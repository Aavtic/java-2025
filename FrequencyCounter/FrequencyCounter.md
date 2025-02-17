# Frequency Counter

## 1. Write a algorithm and java program to find the minimum value with minimum frequency.
## 2. Write a algorithm and java program to find the minimum value with maximum frequency.
## 3. Write a algorithm and java program to find the maximum value with minimum frequency.
## 4. Write a algorithm and java program to find the maximum value with maximum frequency.


### Code 
```
import java.util.Arrays;

class FreqCounter {
    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 4, 2, 5, 6, 6 , 2, 7, 7, 3, 7, 1};
        int n = arr.length;

        Arrays.sort(arr);

        System.out.println("Array: " + Arrays.toString(arr));

        //1. Write a algorithm and java program to find the minimum value with minimum frequency.

        int val = arr[0];
        int min_freq = n;
        int i=0;
        int j=1;

        while (i<n && j<n) {
            int freq = 1;
            for (; j<n; ++j) {
                if (arr[j] == arr[i])
                    freq++;
                else
                    break;
            }

            if (freq < min_freq) {
                min_freq = freq;
                val = arr[i];
            }
            i=j;
            ++j;
        }


        System.out.println("Minimum Value with Minimum Frequency");
        System.out.println("Minimum Value: " + val);
        System.out.println("Minimum Frequency: " + min_freq);
        System.out.println();


        //2. Write a algorithm and java program to find the minimum value with maximum frequency.


        val = arr[0];
        int max_freq = 0;
        i=0;
        j=1;

        while (i<n && j<n) {
            int freq = 1;
            for (; j<n; ++j) {
                if (arr[j] == arr[i])
                    freq++;
                else
                    break;
            }

            if (freq > max_freq) {
                max_freq = freq;
                val = arr[i];
            }
            i=j;
            ++j;
        }


        System.out.println("Minimum Value with Maximum Frequency");
        System.out.println("Minimum Value: " + val);
        System.out.println("Maximum Frequency: " + max_freq);
        System.out.println();


        //3. Write a algorithm and java program to find the maximum value with minimum frequency.


        val = arr[0];
        min_freq = n;
        i=n-1;
        j=i-1;

        while (i>-1 && j>-1) {
            int freq = 1;
            for (; j>-1; --j) {
                if (arr[j] == arr[i])
                    freq++;
                else
                    break;
            }

            if (freq < min_freq) {
                min_freq = freq;
                val = arr[i];
            }
            i=j;
            --j;
        }


        System.out.println("Maximum Value With Minimum Frequency");
        System.out.println("Maximum Value: " + val);
        System.out.println("Minimum Frequency: " + min_freq);
        System.out.println();

        //4. Write a algorithm and java program to find the maximum value with maximum frequency.

        val = arr[0];
        max_freq = 0;
        i=n-1;
        j=i-1;

        while (i>-1 && j>-1) {
            int freq = 1;
            for (; j>-1; --j) {
                if (arr[j] == arr[i])
                    freq++;
                else
                    break;
            }

            if (freq > max_freq) {
                max_freq = freq;
                val = arr[i];
            }
            i=j;
            --j;
        }


        System.out.println("Maximum Value With Maximum Frequency");
        System.out.println("Maximum Value: " + val);
        System.out.println("Maximum Frequency: " + max_freq);
        System.out.println();
    }
}
```


## Output

```
Array: [1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7]
Minimum Value with Minimum Frequency
Minimum Value: 3
Minimum Frequency: 1

Minimum Value with Maximum Frequency
Minimum Value: 2
Maximum Frequency: 4

Maximum Value With Minimum Frequency
Maximum Value: 5
Minimum Frequency: 1

Maximum Value With Maximum Frequency
Maximum Value: 2
Maximum Frequency: 4


[Process exited 0]
```
