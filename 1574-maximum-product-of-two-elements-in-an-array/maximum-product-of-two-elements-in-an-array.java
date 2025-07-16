class Solution {
    public int maxProduct(int[] nums) {
        Queue<Integer> pq=new PriorityQueue<>((a,b) -> a-b);
        for(int i:nums){
            pq.add(i);
            if(pq.size()>2){
                pq.poll();
            }
        }
            int num1=pq.poll();
            int num2=pq.poll();
            return (num1-1)*(num2-1);
    }
}