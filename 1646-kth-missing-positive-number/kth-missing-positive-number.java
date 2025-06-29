class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> nums=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int i=1;
        while(nums.size()<k){
            if(!set.contains(i)){
                nums.add(i);
            }
            i++;
        }
        
        return nums.get(k-1);
    }
}