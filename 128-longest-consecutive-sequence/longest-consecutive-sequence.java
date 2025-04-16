class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int longest=1;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}