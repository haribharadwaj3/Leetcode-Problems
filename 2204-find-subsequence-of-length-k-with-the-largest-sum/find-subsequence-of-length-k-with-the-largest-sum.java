class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[0]!=b[0]?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<int[]> arr=new ArrayList<>(pq);
        arr.sort(Comparator.comparingInt(a->a[1]));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[0];
        }
        return ans;
    }
}