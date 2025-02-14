## Write a java program to perform the following process
## 1. Right Shift by 2 using loop.
## 2. Left Shift by 2 using loop.
## 3. Right Shift by 2 using Array Method.
## 4. Left Shift by 2 using Array Method.



## Code for Rotation using loop

```
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
        int r = 4;
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
```

## Output

```

Array: [11, 12, 13, 14, 15]
Right Rotation: 2
Array: [14, 15, 11, 12, 13]
Temp: [14, 15]


Array: [11, 12, 13, 14, 15]
Left Rotation: 2
Array: [13, 14, 15, 11, 12]
Temp: [11, 12]
```

## Code for rotate using copy method

```
import java.util.Arrays;

class Rotate {
    public static void main(String args[]) {
        int arr[] = {11, 12, 13, 14, 15};
        int n = arr.length;
        int r = 2;
        boolean right_shift = true;


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
```


## Output

```
Array: [11, 12, 13, 14, 15]
Right Rotation: 2
[14, 15, 11, 12, 13]

[Process exited 0]

Array: [11, 12, 13, 14, 15]
Left Rotation: 2
[13, 14, 15, 11, 12]

[Process exited 0]
```
