## 1. Write a program to create store and display the value of 2 dimensional array with mXn martix.

## Code

```
//1. Write a program to create store and display the value of 2 dimensional array with mXn martix.

import java.util.Scanner;
import java.util.Arrays;

class TwoD {
    public static void main(String args[]) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i=0; i<m; ++i) {
            for (int j=0; j<n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; ++i) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
```

## Output

```
2
2
1
2
3
4
[1, 2]
[3, 4]
```


## 2. Write a program to create store and display the value of jagged array with each row has different number of columns.

## Code

```
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
```

## Output

```
3
2
1
2
3
1
2
3
4
1
2
3
4
[1, 2]
[1, 2, 3]
[1, 2, 3, 4]

[Process exited 0]
```
