class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                arr.add(nums[j]);
                if(div(arr,k,p)){
                    set.add(new ArrayList<>(arr));
                }
            }
        }
        return set.size();
    }
    boolean div(List<Integer> arr,int k,int p){
        int count=0;
        for(int i:arr){
            if(i%p==0){
                count++;
            }
        }
        return count<=k;
    } 
}