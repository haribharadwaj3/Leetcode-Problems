class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] ar=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>(map.keySet());
        arr.sort((a,b)-> map.get(b)-map.get(a));
        
        for(int i=0;i<k;i++){
            ar[i]=arr.get(i);
        }
        return ar;
    }
}