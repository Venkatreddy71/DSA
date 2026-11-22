class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;

        int[] arr = nums;

        long even = 0;
        long odd = Long.MAX_VALUE / 4;

        for (int i = 1; i < n - 1; i++) {

            long x = arr[i];

            long newEven = Math.min(even, odd + x);
            long newOdd = Math.min(odd, even + x);

            even = newEven;
            odd = newOdd;
        }

        return (long) arr[0]
             + arr[n - 1]
             + even;
    }
}