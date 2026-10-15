## 01. Ceil in Sorted Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1)

### Problem Description

**Task:** Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x. This element is called the ceil of x. If such an element does not exist, return -1.Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.ExamplesInput: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5

#### Examples

##### Example 1

- **Output:**
```text
0
```
- **Explanation:** Smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-15 19:22:25
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static int findCeil(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= x) {
                ans = mid;        // possible ceil
                hi = mid - 1;     // look for an earlier one
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
```

*Generated on: 10/15/2026, 7:23:34 PM*