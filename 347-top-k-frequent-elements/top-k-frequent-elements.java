class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)return nums;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(int i:map.keySet()){
            pq.add(i);
            if(pq.size()>k)pq.poll();
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}