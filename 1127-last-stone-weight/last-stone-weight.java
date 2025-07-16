class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int lar=pq.poll();
            int seclar=pq.poll();
            if(lar!=seclar){
                pq.add(lar-seclar);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }
}