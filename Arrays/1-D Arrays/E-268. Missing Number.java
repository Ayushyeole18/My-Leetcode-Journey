class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = 0;
        int sum2 = 0;

        for(int ele:nums){
            sum1 += ele;
        }

        sum2 = (n*(n+1))/2;

        return sum2 - sum1;
    }
}
