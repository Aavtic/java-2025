# Perform the list of methods in Arrays

# 1. Find the length of the Array variable.
# 2. Convert the array variable and store it in the String variable and display the array values.
# 3. Copy the array value from source array to designation array using copyOf method.
# 4. Copy the array value from source array to designation array using copyOfRange method.
# 5. Compare two array and check whether the array are same or not.
# 6. Make the array variable to store it in ascending order and display the arraydata.
# 7. Display the array data in descending order.


# 1. Find the length of the Array variable.

## Code

```
class Main {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Length of array: " + arr.length);
    }
}

```

## Output

```
Length of array: 5
```

# 2. Convert the array variable and store it in the String variable and display the array values.

## Code
```
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        String arr_str = Arrays.toString(arr);

        System.out.println("Array as string: " + arr_str);
    }
}
```

## Output
```
Array as string: [1, 2, 3, 4]
```


# 3. Copy the array value from source array to designation array using copyOf method.

## Code

```
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int copied[] = Arrays.copyOf(arr, arr.length);

        System.out.println("Arr: " + Arrays.toString(arr) + " copied: " + Arrays.toString(copied));
    }
}
```


## Output
```
Arr: [1, 2, 3, 4] copied: [1, 2, 3, 4]
```


# 4. Copy the array value from source array to designation array using copyOfRange method.

## Code
```
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int copied[] = Arrays.copyOfRange(arr, 0, arr.length);

        System.out.println("Arr: " + Arrays.toString(arr) + " copied: " + Arrays.toString(copied));
    }
}
```

## Output
```
Arr: [1, 2, 3, 4] copied: [1, 2, 3, 4]
```
