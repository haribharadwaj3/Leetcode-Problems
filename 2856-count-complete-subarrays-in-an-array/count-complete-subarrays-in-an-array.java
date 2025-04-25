class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set1=new HashSet<>();
        for(int i:nums){
            set1.add(i);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set2=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                set2.add(nums[j]);
                if(set1.size()==set2.size()){
                    count++;
                }
            }
        }
        return count;
    }
}