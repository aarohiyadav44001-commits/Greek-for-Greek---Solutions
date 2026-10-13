## 01. code

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/permutations-in-array1747/1)

### Problem Description

**Task:** Given two arrays a[], b[], and an integer k, find if it is possible to permute both arrays such that for every index i, arr1[i] + arr2[i] ≥ k. Examples:Input: k = 10, a[] = [2, 1, 3], b[] = [7, 8, 9].

#### Examples

##### Example 1

- **Output:**
```text
false
```
- **Explanation:** Since any permutation won't give the answer.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (5)

#### Solution 1 (Java)

- **Submitted:** 2026-10-13 19:08:45
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public boolean isPossible(int k, int[] a, int[] b) {
        // code here
        
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0 ; i< n; i++){
            if(a[i]+b[n-1-i] < k){
                return false;
            }
        }
        return true;
    }
}
        return true;
    }
}
```

*Generated on: 10/13/2026, 7:09:01 PM*
