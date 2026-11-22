
class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;

        int[] arr = nums;

        long ans = Long.MAX_VALUE;

        int i = 0;

        while (i < n) {
            int j = i;

            while (j + 1 < n && arr[j] == arr[j + 1]) {
                j++;
            }

            if (i <= n - 2 && j >= 1) {
                long cost = (long) arr[i] * (i + n - 1 - j);

                ans = Math.min(ans, cost);
            }

            i = j + 1;
        }

        return ans;
    }
}
