class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) ->{
            int val=Integer.compare(a[0],b[0]);
            if(val==0){
                return Integer.compare(a[1],b[1]);
            }
            return val;
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        while(k-- >0){
            int[] arr=pq.poll();
            int i=arr[1];
            nums[i]*=multiplier;
            pq.add(new int[]{nums[i],i});
        }
        return nums;
    }
}