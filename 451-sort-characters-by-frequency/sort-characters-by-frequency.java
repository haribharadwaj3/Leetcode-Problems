class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(char i:map.keySet()){
            pq.add(i);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int num=map.get(ch);
            for(int i=0;i<num;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}