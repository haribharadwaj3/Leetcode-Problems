class Solution {
    public int maxCoins(int[] piles) {
        int total=0;
        Arrays.sort(piles);
        for(int i=piles.length/3;i<piles.length;i+=2){
            total+=piles[i];
        }
        return total;
    }
}