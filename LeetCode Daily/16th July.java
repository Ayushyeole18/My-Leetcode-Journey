// Medium 3867. Sum of GCD of Formed Pairs

import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            arr[i] = gcd(nums[i], max);
        }

        Arrays.sort(arr);

        long ans = 0;

       
        for (int i = 0; i < n / 2; i++) {
            ans += gcd(arr[i], arr[n - 1 - i]);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
