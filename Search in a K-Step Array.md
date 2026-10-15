## 01. Search in a K-Step Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1)

### Problem Description

**Task:** Given a step array arr[], a step value k, and an integer x, find the first index of x in the array. If x is not present, return -1.
For example, arr[] = [4, 6, 7, 9] with k = 2 is a step array because the difference between consecutive elements is ≤ 2.

> **Note:** A K-Step array is an array where the absolute difference between any two adjacent elements is at most k.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [4, 5, 6, 7, 6], k = 1, x = 6
```
- **Output:**
```text
2
```
- **Explanation:** In the array arr, 6 is present at index 2. So, return 2.

##### Example 2

- **Input:**
```text
arr[] = [20, 40, 50], k = 20, x = 70
```
- **Output:**
```text
-1 Explanation: As there is no occurrence of 70. So, return -1.
```

#### Constraints

- **1.** `1 ≤ arr.size ≤ 10⁵¹ ≤ k ≤ 1001 ≤ arr[i], x ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)
#### Solution 3 (Java)

- **Submitted:** 2026-10-15 18:56:50
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static int findStepKeyIndex(int[] arr, int k, int x) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] == x) {
                return i;
            }
            // Each step changes value by at most k, so skip safely
            int jump = Math.max(1, Math.abs(arr[i] - x) / k);
            i += jump;
        }
        return -1;
    }
}
```

*Generated on: 10/15/2026, 7:15:48 PM*
