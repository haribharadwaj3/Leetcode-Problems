class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    list.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> arr=new ArrayList<>(list);
        return arr;
    }
}