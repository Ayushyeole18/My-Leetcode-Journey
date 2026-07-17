class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] gcdCount = new long[max + 1];

        for (int g = max; g >= 1; g--) {
            long cnt = 0;

            for (int m = g; m <= max; m += g)
                cnt += freq[m];

            gcdCount[g] = cnt * (cnt - 1) / 2;

            for (int m = g * 2; m <= max; m += g)
                gcdCount[g] -= gcdCount[m];
        }

        for (int i = 1; i <= max; i++)
            gcdCount[i] += gcdCount[i - 1];

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long q = queries[i];
            int l = 1, r = max;

            while (l < r) {
                int mid = l + (r - l) / 2;
                if (gcdCount[mid] > q)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}
