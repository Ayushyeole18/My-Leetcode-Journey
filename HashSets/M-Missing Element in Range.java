class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet <Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int ele:arr){
            set.add(ele);
        }
        
        for(int i=low; i<=high; i++){
            if(!set.contains(i)) 
            ans.add(i);
        }
        return ans;
    }
}
