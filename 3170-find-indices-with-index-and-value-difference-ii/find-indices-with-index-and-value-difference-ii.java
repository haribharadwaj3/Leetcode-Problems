class Solution {
    public int[] findIndices(int[] nums, int ind, int val) {
        int min=0;
        int max=0;
        for(int i=ind;i<nums.length;i++){
            if(nums[i-ind]<nums[min]){
                min=i-ind;
            }if(nums[i-ind]>nums[max]){
                max=i-ind;
            }if(nums[i]-nums[min]>=val){
                return new int[]{min,i};
            }if(nums[max]-nums[i]>=val){
                return new int[]{max,i};
            }
        }
        return new int[]{-1,-1};
    }
}