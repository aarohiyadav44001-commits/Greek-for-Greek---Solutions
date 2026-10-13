class Solution {
    public boolean isPossible(int k, int[] a, int[] b) {
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] + b[n - 1 - i] < k) {
                return false;
            }
        }
        return true;
    }
}
