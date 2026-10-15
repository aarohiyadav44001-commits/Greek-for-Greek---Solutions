## 01. Counting Sort

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/counting-sort/1)

### Problem Description

**Task:** Given a string s consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

#### Examples

##### Example 1

- **Input:**
```text
s = "edsab"
```
- **Output:**
```text
abdes
```
- **Explanation:** In lexicographical order, s will be abdes.

##### Example 2

- **Input:**
```text
s = "geeksforgeeks"
```
- **Output:**
```text
eeeefggkkorss
```
- **Explanation:** In lexicographical order, s will be eeeefggkkorss.

#### Constraints

- **1.** `1 ≤ s.size() ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-15 19:32:24
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static String countSort(String s) {
        int n = s.length();
        if (n <= 1) return s;

        int max = 255;
        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                result.append((char) i);
                count[i]--;
            }
        }

        return result.toString();
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-13 19:59:47
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static String countSort(String s) {
        int n = s.length();
        if (n <= 1) return s;

        int max = 255;
        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                result.append((char) i);
                count[i]--;
            }
        }

        return result.toString();
    }
}
```

*Generated on: 10/15/2026, 7:33:02 PM*