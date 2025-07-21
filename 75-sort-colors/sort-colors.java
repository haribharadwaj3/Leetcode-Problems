class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ind=0;
        while(i<=j){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                i++;
                ind++;
            }else if(nums[i]==2){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }else{
                i++;
            }
        }
    }
}