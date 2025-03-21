class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                arr.add(grid[i][j]);
            }
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        for(int i=0;i<grid.length;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                arr.add(grid[j][i]);
            }
            if(map.containsKey(arr)){
                count+=map.get(arr);
            }
        }
        return count;
    }
}