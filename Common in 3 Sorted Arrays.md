## 01. Common in 3 Sorted Arrays

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/common-elements1132/1)

### Problem Description

**Task:** Given three sorted arrays in non-decreasing order, return all common elements in non-decreasing order across these arrays. If there are no such elements return an empty array.Note: Ignore duplicates, include each common element only once in the output.Examples :Input: a[] = [1, 5, 10, 20, 40, 80], b[] = [6, 7, 20, 80, 100], c[] = [3, 4, 15, 20, 30, 70, 80, 120]

#### Examples

##### Example 1

- **Output:**
```text
[]
```
- **Explanation:** Since none of the elements in arrays a, b, and c appear in all three arrays, there are no common elements, so the output is [].Input: a[] = [1, 1, 1, 2, 2, 2], b[] = [1, 1, 2, 2, 2], c[] = [1, 1, 1, 1, 2, 2, 2, 2]Output: [1, 2]Explanation: Ignoring duplicates, 1 and 2 are present in all three arrays, so the output is [1, 2].

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-10-15 19:10:54
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                // avoid duplicates in the result
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++; j++; k++;
            } else {
                int max = Math.max(a[i], Math.max(b[j], c[k]));
                if (a[i] < max) i++;
                if (b[j] < max) j++;
                if (c[k] < max) k++;
            }
        }
        return res;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-15 18:53:17
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                // avoid duplicates in the result
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++; j++; k++;
            } else {
                int max = Math.max(a[i], Math.max(b[j], c[k]));
                if (a[i] < max) i++;
                if (b[j] < max) j++;
                if (c[k] < max) k++;
            }
        }
        return res;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-10-15 18:53:10
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                // avoid duplicates in the result
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++; j++; k++;
            } else {
                int max = Math.max(a[i], Math.max(b[j], c[k]));
                if (a[i] < max) i++;
                if (b[j] < max) j++;
                if (c[k] < max) k++;
            }
        }
        return res;
    }
}
```

*Generated on: 10/15/2026, 7:11:18 PM*