class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;

        for(int i=0; i<k; i++){
            ans += nums[n-1];
            nums[n-1] = nums[n-1] + 1;
        }
        return ans;
    }
}
