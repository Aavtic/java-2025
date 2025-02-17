# 448. Find All Numbers Disappeared in an Array

## Description

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:

Input: nums = [1,1]
Output: [2]


## Code

```
import java.util.Arrays;

class DisappearedNum {
    public static void main(String args[]) {
        int arr[] = {4,3,2,7,8,2,3,1};
        DisappearedNum dn = new DisappearedNum();
        System.out.println(Arrays.toString(dn.disappearedNum(arr));
    }

    int[] disappearedNum(int[] nums) {
        int n = nums.length;
        int []result = new int[n];
        int ri = 0;
        for (int i=1; i<n+1; ++i) {
            boolean found = false;
            for (int j=0; j<n; ++j) {
                if (i == nums[j])
                    found = true;
            }
            if (!found)
                result[ri++] = i;
        }

        return Arrays.copyOfRange(result, 0, ri);
    }
}

```

## Output

```
[5, 6]
```
