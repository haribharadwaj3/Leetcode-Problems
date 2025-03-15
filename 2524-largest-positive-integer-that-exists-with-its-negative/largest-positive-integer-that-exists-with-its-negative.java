class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            int max=Math.abs(i);
            if(max>ans && set.contains(-i)){
                ans=max;
            }
            set.add(i);
        }
        return ans;
    }
}