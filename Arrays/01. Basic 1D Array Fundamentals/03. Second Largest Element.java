class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1])
            return arr[i];
        }
        return -1;
        
    }
}
