## 01. Friends Pairing Problem

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/friends-pairing-problem5425/1)

### Problem Description

**Task:** Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.Examples :Input: n = 3

#### Examples

##### Example 1

- **Output:**
```text
4 {1}, {2}, {3} : All single {1}, {2,3} : 2 and 3 paired but 1 is single. {1,2}, {3} : 1 and 2 are paired but 3 is single. {1,3}, {2} : 1 and 3 are paired but 2 is single. Note that {1,2} and {2,1} are considered same.
```

##### Example 2

- **Input:**
```text
n = 2
```
- **Output:**
```text
1
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-03 18:29:40
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int countFriendsPairings(int n) {
        if(n==1 || n==2){
            return n;
        }
        // Single
        int fnm1 = countFriendsPairings(n-1);
        //Pair
        int fnm2 = countFriendsPairings(n-2);
        int pairWays = (n-1) * fnm2;
        
        //TotalPair
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-03 18:28:50
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int countFriendsPairings(int n) {
        if(n==1 || n==2){
            return n;
        }
        // Single
        int fnm1 = countFriendsPairings(n-1);
        //Pair
        int fnm2 = countFriendsPairings(n-2);
        int pairWays = (n-1) * fnm2;
        
        //TotalPair
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
}
```

*Generated on: 10/3/2026, 6:32:36 PM*